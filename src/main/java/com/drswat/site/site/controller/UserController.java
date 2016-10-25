package com.drswat.site.site.controller;

import javax.validation.Valid;

import com.drswat.site.site.model.Property;
import com.drswat.site.site.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.drswat.site.site.model.User;
import com.drswat.site.site.repository.UserRepository;

@Controller
@RequestMapping(path = "user")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PropertyRepository propertyRepository;

    @PostMapping("")
    public String createUser(@Valid User user, BindingResult result, Model model) {
        if (result.hasErrors())
            return "user/create";
        userRepository.save(user);
        return "redirect:/user/"+user.getId();
    }

    @PostMapping("{user}/property")
    public String createProperty(User user, @Valid Property property, BindingResult result, Model model) {
        if (user != null && result.hasErrors()) {
            model.addAttribute("type", Property.TypeDwelling.values());
            return "user/property";
        }
        property.setOwner(user);
        propertyRepository.save(property);
        return "redirect:/user/"+user.getId();
    }

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("user", new User());
        return "user/create";
    }

    @GetMapping("{user}")
    public String get(User user, Model model) {
        model.addAttribute("user", user);
        return "user/home";
    }

    @GetMapping("{user}/property")
    public String getProperty(User user, Model model) {
        model.addAttribute("user", user);
        model.addAttribute("property", new Property());
        model.addAttribute("type", Property.TypeDwelling.values());
        return "user/property";
    }
}