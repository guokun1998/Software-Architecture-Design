package cn.edu.hrbeu.group15.controller.part01.content;

import cn.edu.hrbeu.group15.po.Fund;
import cn.edu.hrbeu.group15.po.Organization;
import cn.edu.hrbeu.group15.po.Orgattached;
import cn.edu.hrbeu.group15.service.FundServiceImpl;
import cn.edu.hrbeu.group15.service.OrganizationServiceImpl;
import cn.edu.hrbeu.group15.service.OrgattachedServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    /**
     * 机构详情页，展示机构详情以及相关的资金记录
     * @param orgId
     * @param page
     * @param model
     * @return
     */
    @RequestMapping("/part01/content/institution-view.html")
    public String InstitutionView(@RequestParam(required=true,defaultValue="1",name = "orgId") Integer orgId,@RequestParam(required=true,defaultValue="1",name = "page") Integer page,Model model) {
        PageHelper.startPage(page,5);
        List<Fund> fundList = fundService.getFundByOrgId(orgId);
        PageInfo<Fund> fundPageInfo = new PageInfo<>(fundList);
        Orgattached orgattached = orgattachedService.getOrgattachedByOrgId(orgId);
        Organization organization = organizationService.getById(orgId);
        model.addAttribute("fundList",fundList);
        model.addAttribute("fundPageInfo",fundPageInfo);
        model.addAttribute("orgId",orgId);
        model.addAttribute("orgattached",orgattached);
        model.addAttribute("organization",organization);
        return "part01/content/institution-view.html";
    }

    /**
     * 机构更新页，展示机构详情对之修改
     * @param orgId
     * @param page
     * @param model
     * @return
     */
    @RequestMapping("/part01/content/institution-change.html")
    public String InstitutionViewChange(@RequestParam(required=true,defaultValue="1",name = "orgId") Integer orgId,@RequestParam(required=true,defaultValue="1",name = "page") Integer page,Model model) {
        PageHelper.startPage(page,5);
        List<Fund> fundList = fundService.getFundByOrgId(orgId);
        PageInfo<Fund> fundPageInfo = new PageInfo<>(fundList);
        Orgattached orgattached = orgattachedService.getOrgattachedByOrgId(orgId);
        Organization organization = organizationService.getById(orgId);
        model.addAttribute("fundList",fundList);
        model.addAttribute("fundPageInfo",fundPageInfo);
        model.addAttribute("orgId",orgId);
        model.addAttribute("orgattached",orgattached);
        model.addAttribute("organization",organization);
        return "part01/content/institution-change.html";
    }

    /**
     * 提交机构修改表单，对数据库进行修改
     * 暂时没有对所有数据修改，只开放了orgNo
     * @param orgNo
     * @param id
     * @param orgattached
     * @param model
     * @return
     */
    @RequestMapping("/part01/content/institution/change.html")
    public String InstitutionChange(@RequestParam(required=true,defaultValue="1",name = "orgNo") String orgNo,
            @RequestParam(required=true,defaultValue="1",name = "id") Integer id,
            Orgattached orgattached, Model model) {
        Organization organization = new Organization();
        organization.setId(id);
        organization.setOrgNo(orgNo);
        organizationService.updateOrgNo(organization);
        return "/part01/welcome";
    }
}
