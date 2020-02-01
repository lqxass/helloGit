package com.grape.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.SQLOutput;

/**
 * helloGit
 *
 * @author RuntimeException
 */
@Controller
public class IndexController {
    @GetMapping({"/", "/index"})
    public String index(Model model) {
        model.addAttribute("hello","hello git");
        return "index";
    }
    @GetMapping("/login")
    public String login(){
        System.out.println("git once");
        return "login";
    }


}
