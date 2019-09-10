package ch.ms.controller;


import ch.ms.model.Angestellter;
import ch.ms.model.User;
import ch.ms.service.AngestellterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PublicController {

    private AngestellterService angestellterService;

    @GetMapping("/")
    public String getMessage(){
        return "login";
    }

    public PublicController(AngestellterService angestellterService){
        this.angestellterService = angestellterService;
    }

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("toVerify", new Angestellter());
        return "login";
    }

    @PostMapping("/checkLogin")
    public String validate(@ModelAttribute Angestellter toVerify){

        return angestellterService.validate(toVerify);
    }

}
