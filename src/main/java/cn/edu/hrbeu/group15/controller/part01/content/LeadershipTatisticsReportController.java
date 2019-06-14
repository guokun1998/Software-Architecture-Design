package cn.edu.hrbeu.group15.controller.part01.content;

import cn.edu.hrbeu.group15.po.Leader;
import cn.edu.hrbeu.group15.service.LeaderServiceImpl;
import cn.edu.hrbeu.group15.service.OrganizationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-14-15:15
 */
@Controller
public class LeadershipTatisticsReportController {
    @Autowired
    private OrganizationServiceImpl organizationService;

    @Autowired
    LeaderServiceImpl leaderService;

    @RequestMapping("/part01/content/leadership-tatisticsReport.html")
    public String tatisticsReportView(Model model, Integer orgId) {
        List<String> allOrgName = organizationService.getAllOrgName();
        model.addAttribute("allOrgName",allOrgName);
        return "part01/content/leadership-tatisticsReport.html";
    }

    @RequestMapping("/part01/content/leadership/tatisticsReport.html")
    public String tatisticsReport(@RequestParam(required=true,name = "orgName") String orgName,
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
        List<Leader> leaderList = leaderService.findTatistics(orgName, yearLy);
        model.addAttribute("leaderList",leaderList);
        return "part01/content/leadership-tatisticsReport.html";
    }
}
