package ch.ms.controller;

import ch.ms.model.Kunde;
import ch.ms.service.KundeService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class KundeController {

    private KundeService kundeService;

    @GetMapping
    public String getProfile(int id, Model model){
        model.addAttribute("myProfile", kundeService.getKunde(id));
        return "profile";
    }

    @PostMapping
    public void updateProfile(){}

    @PostMapping
    public void logout(){}
}
