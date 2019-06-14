package cn.edu.hrbeu.group15.controller.part01.content;

import cn.edu.hrbeu.group15.po.Organization;
import cn.edu.hrbeu.group15.po.Orgattached;
import cn.edu.hrbeu.group15.service.OrganizationServiceImpl;
import cn.edu.hrbeu.group15.vo.OrgInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-14-13:04
 */
@Controller
public class InstitutionOversightBodiesController {

    @Autowired
    private OrganizationServiceImpl organizationService;

    @RequestMapping("/part01/content/institution-oversightBodies.html")
    public String oversightBodiesView(Model model) {
        List<String> allOrgName = organizationService.getAllOrgName();
        model.addAttribute("allOrgName",allOrgName);
        return "/part01/content/institution-oversightBodies.html";
    }

    @RequestMapping("/part01/content/institution/oversightBodies.html")
    public String oversightBodies(@RequestParam(required=true,name = "orgName") String orgName,
                                  @RequestParam(required=true,name = "yearLy") String yearLy,
                                  Model model) {
        List<String> allOrgName = organizationService.getAllOrgName();
        model.addAttribute("allOrgName",allOrgName);
        if (orgName.equals("请选择")) {
            orgName = null;
        }
        if (yearLy.equals("请选择")) {
            yearLy = null;
        }
        List<OrgInformation> orgInformationList = organizationService.getOversignt(orgName, yearLy);

        model.addAttribute("orgInformationList",orgInformationList);
        return "/part01/content/institution-oversightBodies.html";
    }
}
