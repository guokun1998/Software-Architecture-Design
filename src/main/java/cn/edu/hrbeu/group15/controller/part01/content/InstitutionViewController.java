package cn.edu.hrbeu.group15.controller.part01.content;

import cn.edu.hrbeu.group15.po.Fund;
import cn.edu.hrbeu.group15.po.Organization;
import cn.edu.hrbeu.group15.po.Orgattached;
import cn.edu.hrbeu.group15.service.FundServiceImpl;
import cn.edu.hrbeu.group15.service.OrganizationServiceImpl;
import cn.edu.hrbeu.group15.service.OrgattachedServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-04-8:27
 */
@Controller
public class InstitutionViewController {
    @Autowired
    private FundServiceImpl fundService;
    @Autowired
    private OrgattachedServiceImpl orgattachedService;
    @Autowired
    private OrganizationServiceImpl organizationService;

    @RequestMapping("/part01/content/institution-view.html")
    public String InstitutionView(Model model,Integer orgId) {
        List<Fund> fundList = fundService.getFundByOrgId(orgId);
        Orgattached orgattached = orgattachedService.getOrgattachedByOrgId(orgId);
        Organization organization = organizationService.getById(orgId);
        model.addAttribute("fundList",fundList);
        model.addAttribute("orgattached",orgattached);
        model.addAttribute("organization",organization);
        return "part01/content/institution-view.html";
    }
}
