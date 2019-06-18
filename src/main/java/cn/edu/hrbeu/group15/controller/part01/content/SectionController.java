package cn.edu.hrbeu.group15.controller.part01.content;

import cn.edu.hrbeu.group15.mapper.SectionMapper;
import cn.edu.hrbeu.group15.po.Fund;
import cn.edu.hrbeu.group15.po.Organization;
import cn.edu.hrbeu.group15.po.Orgattached;
import cn.edu.hrbeu.group15.po.Section;
import cn.edu.hrbeu.group15.service.OrganizationServiceImpl;
import cn.edu.hrbeu.group15.service.SectionServiceImpl;
import cn.edu.hrbeu.group15.vo.SectionEasyView;
import cn.edu.hrbeu.group15.vo.SectionSelectCondition;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Random;

/**
 * @author guokun
 * @create 2019-06-06-14:33
 */
@Controller
public class SectionController {

    @Autowired
    protected SectionServiceImpl sectionService;
    @Autowired
    private OrganizationServiceImpl organizationService;

    /**
     * 科室列表界面
     * @param model
     * @return
     */
    @RequestMapping("/part01/content/office-list.html")
    public String OfficeView(Model model) {
        List<String> allOrgName = organizationService.getAllOrgName();
        model.addAttribute("allOrgName",allOrgName);
        return "/part01/content/office-list.html";
    }

    /**
     * 科室查询
     * @param orgName
     * @param divName
     * @param page
     * @param model
     * @return
     */
    @RequestMapping("/part01/content/office/list.html")
    public String OfficeListView(@RequestParam(required=true,defaultValue="1",name = "orgName") String orgName,
                                 @RequestParam(required=true,name = "divName") String divName,
                                 @RequestParam(required=true,defaultValue="1",name = "page") Integer page,
                                 Model model) {
        //下拉选项
        List<String> allOrgName = organizationService.getAllOrgName();
        model.addAttribute("allOrgName",allOrgName);
        //查询规则
        SectionSelectCondition sectionSelectCondition = new SectionSelectCondition();
        //orgName无效
        if (!orgName.equals("请选择")) {
            Integer id = organizationService.getIdByOrgName(orgName);
            sectionSelectCondition.setOrgId(id);
        }
        //divName无效
        if (divName != null && !divName.equals("")) {
            sectionSelectCondition.setDivName(divName);
        }
        //查询 分页
        List<SectionEasyView> sectionList;
//        PageHelper.startPage(page,5);
        sectionList = sectionService.getSectionConditional(sectionSelectCondition);
//        PageInfo<Section> sectionPageInfo = new PageInfo<>(sectionList);
        //写入视图
//        model.addAttribute("sectionPageInfo",sectionPageInfo);
//        model.addAttribute("orgName",orgName);
        model.addAttribute("sectionList",sectionList);

        return "/part01/content/office-list.html";
    }

    /**
     * 科室修改界面
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/part01/content/office-edit.html")
    public String OfficeEditView(@RequestParam(required=true,defaultValue="1",name = "id") Integer id,
                                 Model model) {

        Section section = sectionService.getSectionById(id);
        String orgName = organizationService.getOrgNameById(section.getOrgId());
        model.addAttribute("section",section);
        model.addAttribute("orgName",orgName);
        return "/part01/content/office-edit.html";
    }

    /**
     * 科室修改方法
     *
     * @return
     */
    @RequestMapping("/part01/content/office/edit.html")
    public String OfficeEdit(Section section) {
        sectionService.updateSection(section);
        return "/part01/welcome";
    }

    /**
     * 科室创建界面
     * @param model
     * @return
     */
    @RequestMapping("/part01/content/office-creat.html")
    public String OfficeCreateView(Model model) {
        //下拉选项
        List<String> allOrgName = organizationService.getAllOrgName();
        model.addAttribute("allOrgName",allOrgName);
        return "/part01/content/office-creat.html";
    }

    /**
     * 科室创建请求/方法
     * @param model
     * @return
     */
    @RequestMapping("/part01/content/office/creat.html")
    public String OfficeCreate(String orgName,Section section,Model model) {

        Organization organization = organizationService.getForSectionCreate(orgName);
        section.setOrgId(organization.getId());
        section.setOrgNo(organization.getOrgNo());
        section.setExeType(organization.getExeType());
        Random random = new Random();
        section.setDivNameCode(String.valueOf(random.nextInt(99)));
        sectionService.insertOneSection(section);
        return "/part01/welcome";
    }

    /**
     * 科室删除方法
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/part01/content/office/delete.html")
    public String OfficeDelete(@RequestParam(required=true,name = "id") Integer id,
                               Model model) {
        sectionService.deleteSectionById(id);
        return "/part01/welcome";
    }





}
