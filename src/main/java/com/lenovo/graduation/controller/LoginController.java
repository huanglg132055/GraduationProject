package com.lenovo.graduation.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @RequestMapping("/")
    @ResponseBody
    public Map<String,Object> index(){
        System.out.println("--------------------------------------------");
        Map<String,Object> map = new HashMap<>();
        map.put("iccid","111111");
        return map;
    }

}
