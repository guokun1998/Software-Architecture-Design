package cn.edu.hrbeu.group15.controller.part01.content;

import cn.edu.hrbeu.group15.po.Section;
import cn.edu.hrbeu.group15.po.Stuff;
import cn.edu.hrbeu.group15.service.OrganizationServiceImpl;
import cn.edu.hrbeu.group15.service.StuffServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/part01/content/member-list.html")
    public String StuffView(Model model) {
        List<String> allOrgName = organizationService.getAllOrgName();
        model.addAttribute("allOrgName",allOrgName);
        List<Stuff> stuffList = stuffService.getNotAssignStuffListByOrgId();
        model.addAttribute("stuffList",stuffList);
        return "/part01/content/member-list.html";
    }

    @RequestMapping("/part01/content/member-relation.html")
    public String StuffRelationView(Model model) {
        List<String> allOrgName = organizationService.getAllOrgName();
        model.addAttribute("allOrgName",allOrgName);
        return "/part01/content/member-relation.html";
    }



    @RequestMapping("/part01/content/member-edit.html")
    public String StuffEditView(@RequestParam(required=true,name = "id") Integer id,
                                Model model) {
        Stuff stuff = stuffService.getStuffById(id);
        model.addAttribute("stuff",stuff);
        return "/part01/content/member-edit.html";
    }

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

    @RequestMapping("/part01/content/member-creat.html")
    public String StuffCreateView(Model model) {
        return "/part01/content/member-creat.html";
    }

    @RequestMapping("/part01/content/member/creat.html")
    public String StuffCreate(Stuff stuff,Model model) {
        stuffService.insertOneStuff(stuff);
        return "/part01/welcome";
    }

    @RequestMapping("/part01/content/member-view.html")
    public String StuffInformationView(@RequestParam(required=true,name = "id") Integer id,
                                        Model model) {
        Stuff stuff = stuffService.getStuffById(id);
        model.addAttribute("stuff",stuff);
        return "/part01/content/member-view.html";
    }

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
//        List<Section> sectionList;
//        if (divName == null || divName == "") {
//            sectionList = sectionService.getSectionListByOrgId(id);
//        }
//        else {
//            sectionList = sectionService.getSectionListByOrgIdAndDivName(id,divName);
//        }
        PageInfo<Stuff> stuffPageInfo = new PageInfo<>(stuffList);
        model.addAttribute("stuffPageInfo",stuffPageInfo);
        model.addAttribute("orgName",orgName);
        model.addAttribute("stuffList",stuffList);
        return "/part01/content/member-list.html";
    }
}
