package com.etranger.web.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.*;

@Controller
public class loginController {

    @RequestMapping( value = "/loginpage" )
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/firstPage")
    public String firstPage(){
        return "main";
    }
    @RequestMapping( value = "/signin" )
    public String signin(@RequestParam( value = "email" ) String email, @RequestParam( value = "password" ) String password, Model model) {
        System.out.println(email + password);
        boolean state = false;
        //登录验证
        if ("tom@a".equals(email)) {
            state = true;
            return "main";
        }
        model.addAttribute("state", state);
        return "login";
    }

}
