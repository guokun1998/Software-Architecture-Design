package cn.edu.hrbeu.group15.controller.part01.content;

import cn.edu.hrbeu.group15.po.Organization;
import cn.edu.hrbeu.group15.po.Section;
import cn.edu.hrbeu.group15.po.Stuff;
import cn.edu.hrbeu.group15.service.OrganizationServiceImpl;
import cn.edu.hrbeu.group15.service.SectionServiceImpl;
import cn.edu.hrbeu.group15.service.StuffServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-10-10:06
 */
@Controller
public class StuffController {

    @Autowired
    private StuffServiceImpl stuffService;

    @Autowired
    private OrganizationServiceImpl organizationService;

    @Autowired
    private SectionServiceImpl sectionService;

    /**
     * 人员列表界面
     * @param model
     * @return
     */
    @RequestMapping("/part01/content/member-list.html")
    public String StuffView(Model model) {
        List<String> allOrgName = organizationService.getAllOrgName();
        model.addAttribute("allOrgName",allOrgName);
        List<Stuff> stuffList = stuffService.getNotAssignStuffListByOrgId();
        model.addAttribute("stuffList",stuffList);
        return "/part01/content/member-list.html";
    }

    /**
     * 人员列表查询
     * @param orgName
     * @param repManName
     * @param page
     * @param model
     * @return
     */
    @RequestMapping("/part01/content/member/list.html")
    public String StuffListView(@RequestParam(required=true,defaultValue="1",name = "orgName") String orgName,
                                @RequestParam(required=true,name = "repManName") String repManName,
                                @RequestParam(required=true,defaultValue="1",name = "page") Integer page,
                                Model model) {
        List<String> allOrgName = organizationService.getAllOrgName();
        model.addAttribute("allOrgName",allOrgName);
        PageHelper.startPage(page,5);
        Integer id = organizationService.getIdByOrgName(orgName);
        List<Stuff> stuffList = stuffService.getStuffListByOrgId(id);
        PageInfo<Stuff> stuffPageInfo = new PageInfo<>(stuffList);
        model.addAttribute("stuffPageInfo",stuffPageInfo);
        model.addAttribute("orgName",orgName);
        model.addAttribute("stuffList",stuffList);
        return "/part01/content/member-list.html";
    }

    /**
     * 关联科室界面
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/part01/content/member-relation.html")
    public String StuffRelationView(@RequestParam(required=true,name = "id") Integer id,
                                    Model model) {
        List<String> allOrgName = organizationService.getAllOrgName();
        model.addAttribute("allOrgName",allOrgName);
        model.addAttribute("id",id);
        return "/part01/content/member-relation.html";
    }

    /**
     * 关联科室方法
     * @param orgName
     * @param divName
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/part01/content/member/relation.html")
    public String StuffRelation(@RequestParam(required=true,name = "orgName") String orgName,
                                @RequestParam(required=true,name = "divName") String divName,
                                @RequestParam(required=true,name = "id") Integer id,
                                Model model) {
        Organization organization = organizationService.getOrgNoAndOrgCodeByOrgName(orgName);
        Integer orgId = organizationService.getIdByOrgName(orgName);
        Section section = sectionService.getIdAndDivCodeByOrgIdAndDivName(orgId, divName);

        stuffService.updateStuffRelation(section.getId(),section.getDivCode(),orgId,organization.getOrgNo(),id);
        return "/part01/welcome";
    }

    /**
     * 根据机构名称得到旗下的科室列表
     * @param orgName
     * @param model
     * @return
     */
    @RequestMapping("/part01/content/member-section.html")
    @ResponseBody
    public List<String> StuffRelationSectionView(@RequestParam(required=true,name = "orgName") String orgName,
                                           Model model) {
        Integer orgId = organizationService.getIdByOrgName(orgName);
        List<String> divNameList = sectionService.getSectionDivNameByOrgId(orgId);
        List<String> allOrgName = organizationService.getAllOrgName();
        model.addAttribute("allOrgName",allOrgName);
        model.addAttribute("divNameList",divNameList);
        return divNameList;
//        return "/part01/content/member-relation.html";
    }


    /**
     * 人员信息修改界面
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/part01/content/member-edit.html")
    public String StuffEditView(@RequestParam(required=true,name = "id") Integer id,
                                Model model) {
        Stuff stuff = stuffService.getStuffById(id);
        model.addAttribute("stuff",stuff);
        return "/part01/content/member-edit.html";
    }

    /**
     * 人员信息修改方法/请求
     * @param stuff
     * @param model
     * @return
     */
    @RequestMapping("/part01/content/member/edit.html")
    public String StuffEdit(Stuff stuff, Model model) {
        Stuff old = stuffService.getStuffById(stuff.getId());

        stuff.setSectionId(old.getSectionId());
        stuff.setDivCode(old.getDivCode());
        stuff.setOrgId(old.getOrgId());
        stuff.setOrgNo(old.getOrgNo());

        stuffService.updateStuff(stuff);
        System.out.println(stuff);
        return "/part01/welcome";
    }

    /**
     * 人员创建界面
     * @param model
     * @return
     */
    @RequestMapping("/part01/content/member-creat.html")
    public String StuffCreateView(Model model) {
        return "/part01/content/member-creat.html";
    }

    /**
     * 人员创建方法/请求
     * @param stuff
     * @param model
     * @return
     */
    @RequestMapping("/part01/content/member/creat.html")
    public String StuffCreate(Stuff stuff,Model model) {
        stuffService.insertOneStuff(stuff);
        return "/part01/welcome";
    }

    /**
     * 人员详情
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/part01/content/member-view.html")
    public String StuffInformationView(@RequestParam(required=true,name = "id") Integer id,
                                        Model model) {
        Stuff stuff = stuffService.getStuffById(id);
        model.addAttribute("stuff",stuff);
        return "/part01/content/member-view.html";
    }

    /**
     * 人员删除方法/请求
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/part01/content/member/delete.html")
    public String StuffDelete(@RequestParam(required=true,name = "id") Integer id,
                              Model model) {
        stuffService.deleteOneStuff(id);
        return "/part01/welcome";
    }


}
