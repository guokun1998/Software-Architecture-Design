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
public class StaffTechnicistContoller {

    @Autowired
    private OrganizationServiceImpl organizationService;

    /**
     * 专业技术人员基本情况表界面
     * @param model
     * @param orgId
     * @return
     */
    @RequestMapping("/part01/content/member-technicist.html")
    public String staffTechnicistView(Model model, Integer orgId) {
        List<String> allOrgName = organizationService.getAllOrgName();
        model.addAttribute("allOrgName",allOrgName);
        return "part01/content/member-technicist.html";
    }
}
