package cn.edu.hrbeu.group15.controller.part01.content;

import cn.edu.hrbeu.group15.service.OrganizationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-17-15:05
 */
@Controller
public class StaffEntrustContoller {

    @Autowired
    private OrganizationServiceImpl organizationService;

    /**
     * 人员授权界面
     * @param model
     * @param orgId
     * @return
     */
    @RequestMapping("/part01/content/staff-entrust.html")
    public String staffEntrustView(Model model, Integer orgId) {
        List<String> allOrgName = organizationService.getAllOrgName();
        model.addAttribute("allOrgName",allOrgName);
        return "part01/content/staff-entrust.html";
    }

    /**
     * 被授权人确认界面
     * @param model
     * @param orgId
     * @return
     */
    @RequestMapping("/part01/content/staff-entrust2.html")
    public String staffEntrust2View(Model model, Integer orgId) {
        List<String> allOrgName = organizationService.getAllOrgName();
        model.addAttribute("allOrgName",allOrgName);
        return "part01/content/staff-entrust2.html";
    }
}
