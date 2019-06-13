package cn.edu.hrbeu.group15.controller.part01.content;

import cn.edu.hrbeu.group15.service.OrganizationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-13-10:18
 */
@Controller
public class institutionFinancialReportController {

    @Autowired
    private OrganizationServiceImpl organizationService;

    @RequestMapping("/part01/content/institution-financialReport.html")
    public String financialView(Model model) {
        List<String> allOrgName = organizationService.getAllOrgName();
        model.addAttribute("allOrgName",allOrgName);
        return "/part01/content/institution-financialReport.html";
    }
}
