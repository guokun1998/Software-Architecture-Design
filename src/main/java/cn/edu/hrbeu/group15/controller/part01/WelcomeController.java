package cn.edu.hrbeu.group15.controller.part01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author guokun
 * @create 2019-06-03-15:56
 */
@Controller
public class WelcomeController {


    @RequestMapping("/part01/welcome.html")
    public String indexOfPart01() {
        return "part01/welcome";
    }
}
