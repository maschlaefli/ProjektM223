package ch.ms.controller;


import ch.ms.model.Angestellter;
import ch.ms.model.User;
import ch.ms.service.AngestellterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PublicController {
    //Zugriff auf Servide
    private AngestellterService angestellterService;

    //Automatische weiterleitung auf login
    @GetMapping("/")
    public String getMessage(){
        return "login";
    }

    //Konstruktor
    public PublicController(AngestellterService angestellterService){
        this.angestellterService = angestellterService;
    }

    //Leeren Angestellen ins Model hinzufügen
    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("toVerify", new Angestellter());
        return "login";
    }

    //Angestellter aus Model auslesen und an Service weitergeben
    @PostMapping("/checkLogin")
    public String validate(@ModelAttribute Angestellter toVerify){

        return angestellterService.validate(toVerify);
    }

}
