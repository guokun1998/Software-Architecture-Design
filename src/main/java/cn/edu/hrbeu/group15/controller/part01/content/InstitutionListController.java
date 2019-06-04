package cn.edu.hrbeu.group15.controller.part01.content;

import cn.edu.hrbeu.group15.mapper.OrganizationMapper;
import cn.edu.hrbeu.group15.po.Organization;
import cn.edu.hrbeu.group15.service.OrganizationService;
import cn.edu.hrbeu.group15.service.OrganizationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author guokun
 * @create 2019-06-03-17:35
 */

@Controller
public class InstitutionListController {

    @Autowired
    private OrganizationServiceImpl organizationService;


    @RequestMapping("/part01/content/institution-list.html")
    public String InstitutionList(Model model) {
        List<Organization> all = organizationService.getAll();

        model.addAttribute("all",all);
        return "part01/content/institution-list.html";
    }
}
