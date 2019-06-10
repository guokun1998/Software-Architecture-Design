package cn.edu.hrbeu.group15.controller.part01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author guokun
 * @create 2019-06-03-15:55
 */

@Controller
public class Part01IndexController {
    @RequestMapping({"/part01/index","/part01/index.html"})
    public String indexOfPart01() {
        return "part01/index";
    }

    @RequestMapping("/part01/inc-nav.html")
    public String incNav() {
        return "part01/inc-nav";
    }

    @RequestMapping("/part01/inc-header.html")
    public String incHeader() {
        return "part01/inc-header";
    }
}
