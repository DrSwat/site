package com.drswat.site.site.controller;

import javax.validation.Valid;

import com.drswat.site.site.model.Meeting;
import com.drswat.site.site.model.Property;
import com.drswat.site.site.repository.MeetingRepository;
import com.drswat.site.site.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.drswat.site.site.model.Client;
import com.drswat.site.site.repository.ClientRepository;
import com.drswat.site.site.util.MeetingValidation;

@Controller
@RequestMapping(path = "client")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private PropertyRepository propertyRepository;
    @Autowired
    private MeetingRepository meetingRepository;
    @Autowired
    private MeetingValidation meetingValidation;

    @PostMapping("")
    public String createClient(@Valid Client client, BindingResult result, Model model) {
        if (result.hasErrors())
            return "client/create";
        clientRepository.save(client);
        return "redirect:/client/" + client.getId();
    }

    @PostMapping("{client}/meeting")
    public String createMeeting(Client client, @Valid Meeting meeting, BindingResult result, Model model) {
        meetingValidation.validate(meeting, result);
        if (client != null && result.hasErrors()) {
            model.addAttribute("properties", propertyRepository.findAll());
            return "client/meeting";
        }
        meeting.setClient(client);
        meetingRepository.save(meeting);
        return "redirect:/client/" + client.getId();
    }

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("client", new Client());
        return "client/create";
    }

    @GetMapping("{client}")
    public String get(Client client, Model model) {
        model.addAttribute("client", client);
        return "client/home";
    }

    @GetMapping("{client}/meeting")
    public String getMeeting(Client client, Model model) {
        model.addAttribute("client", client);
        model.addAttribute("meeting", new Meeting());
        model.addAttribute("properties", propertyRepository.findAll());
        return "client/meeting";
    }
}
