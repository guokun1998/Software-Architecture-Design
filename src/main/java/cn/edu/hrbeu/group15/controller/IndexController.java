package cn.edu.hrbeu.group15.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author guokun
 * @create 2019-06-03-15:14
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }



}
