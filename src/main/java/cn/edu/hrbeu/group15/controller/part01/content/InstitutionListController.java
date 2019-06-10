package cn.edu.hrbeu.group15.controller.part01.content;

import cn.edu.hrbeu.group15.mapper.OrganizationMapper;
import cn.edu.hrbeu.group15.po.Organization;
import cn.edu.hrbeu.group15.po.Orgattached;
import cn.edu.hrbeu.group15.service.OrganizationService;
import cn.edu.hrbeu.group15.service.OrganizationServiceImpl;
import cn.edu.hrbeu.group15.service.OrgattachedServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @author guokun
 * @create 2019-06-03-17:35
 */

@Controller
public class InstitutionListController {

    @Autowired
    private OrganizationServiceImpl organizationService;

    @Autowired
    private OrgattachedServiceImpl orgattachedService;

    /**
     * 机构列表页，展示所有机构，分页
     * @param page
     * @param model
     * @return
     */
    @RequestMapping("/part01/content/institution-list.html")
    public String InstitutionList(@RequestParam(required=true,defaultValue="1") Integer page, Model model) {
        PageHelper.startPage(page,10);

        List<Organization> all = organizationService.getAll();
        PageInfo<Organization> organizationPageInfo = new PageInfo<>(all);
        model.addAttribute("organizationPageInfo",organizationPageInfo);
        model.addAttribute("all",all);
        return "part01/content/institution-list.html";
    }

    /**
     * 展示创建机构的页面
     * @return
     */
    @RequestMapping("/part01/content/institution-creat.html")
    public String InstitutionCreateListView() {
        return "part01/content/institution-creat.html";
    }

    /**
     * 提交创建机构的表单到数据库
     * @param orgattached
     * @param organization
     * @return
     */
    @RequestMapping("/part01/content/institution/creat.html")
    public String InstitutionCreateList(Orgattached orgattached,Organization organization) {
//        System.out.println(organization);
//        System.out.println(orgattached);

        organizationService.insertOneOrgnization(organization);
        orgattached.setOrgId(organization.getId());
        orgattached.setYearLy("2019");
        orgattachedService.insertOneOrgattached(orgattached);
        return "/part01/welcome";
    }



}
