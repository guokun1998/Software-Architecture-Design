package cn.edu.hrbeu.group15.controller.part01.content;

import cn.edu.hrbeu.group15.po.Fund;
import cn.edu.hrbeu.group15.po.Leader;
import cn.edu.hrbeu.group15.po.Organization;
import cn.edu.hrbeu.group15.po.Orgattached;
import cn.edu.hrbeu.group15.service.LeaderService;
import cn.edu.hrbeu.group15.service.LeaderServiceImpl;
import cn.edu.hrbeu.group15.service.OrganizationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-04-11:12
 */
@Controller
public class LeadershipListController {

    @Autowired
    private LeaderServiceImpl leaderService;

    @Autowired
    private OrganizationServiceImpl organizationService;

    /**
     * 所级领导名录管理界面
     * @param model
     * @param orgId
     * @return
     */
    @RequestMapping("/part01/content/leadership-list.html")
    public String InstitutionView(Model model, Integer orgId) {
        List<String> allOrgName = organizationService.getAllOrgName();
        model.addAttribute("allOrgName",allOrgName);
        return "part01/content/leadership-list.html";
    }

    /**
     * 所级领导名录管理查询
     * @param model
     * @param yearLy
     * @param orgName
     * @return
     */
    @RequestMapping("/part01/content/leadership-list/year")
    public String InstitutionViewByYear(Model model, String yearLy,String orgName) {
        List<String> allOrgName = organizationService.getAllOrgName();
        model.addAttribute("allOrgName",allOrgName);
        if (orgName.equals("请选择")) {
            orgName = null;
        }
        if (yearLy.equals("请选择")) {
            yearLy = null;
        }
        List<Leader> leaderList = leaderService.findLeaderByYear(orgName, yearLy);

        model.addAttribute("leaderList",leaderList);
        return "part01/content/leadership-list.html";
    }
}
