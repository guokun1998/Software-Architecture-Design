package cn.edu.hrbeu.group15.controller.part01.content;

import cn.edu.hrbeu.group15.mapper.SectionMapper;
import cn.edu.hrbeu.group15.po.Fund;
import cn.edu.hrbeu.group15.po.Organization;
import cn.edu.hrbeu.group15.po.Orgattached;
import cn.edu.hrbeu.group15.po.Section;
import cn.edu.hrbeu.group15.service.OrganizationServiceImpl;
import cn.edu.hrbeu.group15.service.SectionServiceImpl;
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
 * @create 2019-06-06-14:33
 */
@Controller
public class SectionController {

    @Autowired
    protected SectionServiceImpl sectionService;
    @Autowired
    private OrganizationServiceImpl organizationService;

    @RequestMapping("/part01/content/office-list.html")
    public String OfficeView(Model model) {
        List<String> allOrgName = organizationService.getAllOrgName();
        model.addAttribute("allOrgName",allOrgName);
        return "/part01/content/office-list.html";
    }

    @RequestMapping("/part01/content/office/list.html")
    public String OfficeListView(@RequestParam(required=true,defaultValue="1",name = "orgName") String orgName,
                                 @RequestParam(required=true,name = "divName") String divName,
                                 @RequestParam(required=true,defaultValue="1",name = "page") Integer page,
                                 Model model) {
        List<String> allOrgName = organizationService.getAllOrgName();
        model.addAttribute("allOrgName",allOrgName);
        PageHelper.startPage(page,5);
        Integer id = organizationService.getIdByOrgName(orgName);
        List<Section> sectionList;
        if (divName == null || divName == "") {
            sectionList = sectionService.getSectionListByOrgId(id);
        }
        else {
            sectionList = sectionService.getSectionListByOrgIdAndDivName(id,divName);
        }
        PageInfo<Section> sectionPageInfo = new PageInfo<>(sectionList);
        model.addAttribute("sectionPageInfo",sectionPageInfo);
        model.addAttribute("orgName",orgName);
        model.addAttribute("sectionList",sectionList);
        return "/part01/content/office-list.html";
    }

    @RequestMapping("/part01/content/office-edit.html")
    public String OfficeEditView(@RequestParam(required=true,defaultValue="1",name = "id") Integer id,
                                 Model model) {

        Section section = sectionService.getSectionById(id);
        model.addAttribute("section",section);
        return "/part01/content/office-edit.html";
    }

    @RequestMapping("/part01/content/office/edit.html")
    public String OfficeEdit(@RequestParam(required=true,defaultValue="1",name = "divName") String divName,
                             @RequestParam(required=true,defaultValue="1",name = "id") Integer id,
                                 Model model) {

        Section section = new Section();
        section.setId(id);
        section.setDivName(divName);
        sectionService.updateSectionName(section);
        return "/part01/welcome";
    }

    @RequestMapping("/part01/content/office-creat.html")
    public String OfficeCreateView(Model model) {


        return "/part01/welcome";
    }
    @RequestMapping("/part01/content/office/delete.html")
    public String OfficeDelete(@RequestParam(required=true,name = "id") Integer id,
                               Model model) {
        sectionService.deleteSectionById(id);
        return "/part01/welcome";
    }
}
