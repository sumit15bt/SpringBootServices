package com.example.springSecurity.WebControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginLogoutController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
