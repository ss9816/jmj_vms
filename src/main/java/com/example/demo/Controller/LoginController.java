package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {


    @RequestMapping("/login")
    public String Login() {
        //System.out.println("Login");
        return "redirect:/index";
    }

    @RequestMapping("/testlogin")
    public String testlogin() {
        return "testlogin";
    }

    @RequestMapping("/Error")
    public String ErrorPage() {
        System.out.println("ERROR");
        return "404test";
    }

}
