package cn.edu.hrbeu.group15.controller.part01.content;

import cn.edu.hrbeu.group15.service.LeaderServiceImpl;
import cn.edu.hrbeu.group15.service.OrganizationServiceImpl;
import cn.edu.hrbeu.group15.service.StuffServiceImpl;
import cn.edu.hrbeu.group15.vo.StuffComposition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-17-8:24
 */
@Controller
public class StaffCompositionController {
    @Autowired
    private OrganizationServiceImpl organizationService;

    @Autowired
    StuffServiceImpl stuffService;

    @RequestMapping("/part01/content/staff-composition.html")
    public String staffCompositionReportView(Model model, Integer orgId) {
        List<String> allOrgName = organizationService.getAllOrgName();
        model.addAttribute("allOrgName",allOrgName);
        return "part01/content/staff-composition.html";
    }

    @RequestMapping("/part01/content/staff/composition.html")
    public String staffCompositionReport(String orgName,Model model) {
        List<String> allOrgName = organizationService.getAllOrgName();
        model.addAttribute("allOrgName",allOrgName);
        if (orgName.equals("请选择")){
            orgName = null;
        }
        StuffComposition stuffComposition = new StuffComposition();
        stuffComposition.setOrgName(orgName);
        List<StuffComposition> compositionList = stuffService.getStuffComposition(stuffComposition);
        model.addAttribute("compositionList",compositionList);
        return "part01/content/staff-composition.html";
    }
}
