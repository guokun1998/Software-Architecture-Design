package cn.edu.hrbeu.group15.controller.part01.content;

import cn.edu.hrbeu.group15.po.Orgattached;
import cn.edu.hrbeu.group15.service.OrganizationServiceImpl;
import cn.edu.hrbeu.group15.service.OrgattachedServiceImpl;
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
public class InstitutionEquipmentInfoController {

    @Autowired
    private OrganizationServiceImpl organizationService;

    @Autowired
    private OrgattachedServiceImpl orgattachedService;

    @RequestMapping("/part01/content/institution-equipmentInfo.html")
    public String equipmentInfoView(Model model) {
        List<String> allOrgName = organizationService.getAllOrgName();
        model.addAttribute("allOrgName",allOrgName);
        return "/part01/content/institution-equipmentInfo.html";
    }

    @RequestMapping("/part01/content/institution/equipmentInfo.html")
    public String equipmentInfo(@RequestParam(required=true,name = "orgName") String orgName,
                                Model model) {
        List<String> allOrgName = organizationService.getAllOrgName();
        model.addAttribute("allOrgName",allOrgName);
        if (orgName.equals("请选择")) {
            orgName = null;
        }
        Orgattached orgattached = new Orgattached();
        orgattached.setOrgName(orgName);
        List<Orgattached> orgattachedList = orgattachedService.getEquipment(orgattached);
        model.addAttribute("orgattachedList",orgattachedList);

        return "/part01/content/institution-equipmentInfo.html";
    }
}
