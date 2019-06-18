package cn.edu.hrbeu.group15.controller.part01.content;

import cn.edu.hrbeu.group15.po.Fund;
import cn.edu.hrbeu.group15.service.FundServiceImpl;
import cn.edu.hrbeu.group15.service.OrganizationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-13-10:18
 */
@Controller
public class institutionFinancialReportController {

    @Autowired
    private OrganizationServiceImpl organizationService;

    @Autowired
    private FundServiceImpl fundService;

    /**
     * financialReport视图
     * @param model
     * @return
     */
    @RequestMapping("/part01/content/institution-financialReport.html")
    public String financialView(Model model) {
        List<String> allOrgName = organizationService.getAllOrgName();
        model.addAttribute("allOrgName",allOrgName);
        return "/part01/content/institution-financialReport.html";
    }

    /**
     * 年度财政拨款情况查询
     * @param orgName
     * @param yearLy
     * @param model
     * @return
     */
    @RequestMapping("/part01/content/institution/financialReport.html")
    public String financial(@RequestParam(required=true,name = "orgName") String orgName,
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
        List<Fund> fundList = fundService.getFinacial(orgName, yearLy);
        model.addAttribute("fundList",fundList);


        return "/part01/content/institution-financialReport.html";
    }
}
