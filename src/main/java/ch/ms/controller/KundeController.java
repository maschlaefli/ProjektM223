package ch.ms.controller;

import ch.ms.model.Kunde;
import ch.ms.service.KundeService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KundeController {
    //Zugriff auf Servide
    private KundeService kundeService;

    //Eigenes Profil ins Model hinzufügen
    @GetMapping("/profile")
    public String getProfile(int id, Model model){
        model.addAttribute("myProfile", kundeService.getKunde(id));
        return "profile";
    }

    //Update Profile
    @PostMapping("/updateProfile")
    public void updateProfile(){}

}
