package com.lenovo.graduation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping("/")
    public ModelAndView index(){
        System.out.println("--------------------------------------------");
        ModelAndView mv = new ModelAndView("/index");
        return mv;
    }

    @RequestMapping("/index")
    public ModelAndView queryAll() throws Exception {
        System.out.println("--------------------------------------------");
        ModelAndView mv = new ModelAndView("/index");
        return mv;
    }
}
