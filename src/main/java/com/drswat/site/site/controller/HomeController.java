package com.drswat.site.site.controller;

import com.drswat.site.site.model.Client;
import com.drswat.site.site.model.Meeting;
import com.drswat.site.site.model.Property;
import com.drswat.site.site.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "")
public class HomeController {

    @GetMapping("")
    public String home(Model model) {
        model.addAttribute("client", new Client());
        model.addAttribute("user", new User());
        return "home";
    }
}