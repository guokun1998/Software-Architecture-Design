package cn.edu.hrbeu.group15.controller.part01.content;

import cn.edu.hrbeu.group15.po.Fund;
import cn.edu.hrbeu.group15.po.Leader;
import cn.edu.hrbeu.group15.po.Organization;
import cn.edu.hrbeu.group15.po.Orgattached;
import cn.edu.hrbeu.group15.service.LeaderService;
import cn.edu.hrbeu.group15.service.LeaderServiceImpl;
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

    @RequestMapping("/part01/content/leadership-list.html")
    public String InstitutionView(Model model, Integer orgId) {
        return "part01/content/leadership-list.html";
    }

    @RequestMapping("/part01/content/leadership-list/year")
    public String InstitutionViewByYear(Model model, String year) {
        System.out.println(year);
        List<Leader> leaderList = leaderService.findLeaderByYear(year);
        model.addAttribute("leaderList",leaderList);
        return "part01/content/leadership-list.html";
    }
}
