package ch.ms.controller;

import ch.ms.model.Kunde;
import ch.ms.service.AngestellterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AngestellterController {

    private AngestellterService angestellterService;

    public AngestellterController(AngestellterService angestellterService){
        this.angestellterService = angestellterService;
    }

    @GetMapping("/")
    public String getMessage(){
        return "userlist";
    }

    @GetMapping("/userlist")
    public String getKunden(Model model){
        model.addAttribute("kundenliste", angestellterService.getKunden());
        return "userlist";
    }

    @GetMapping("/userlist/createUser")
    public String toCreateUser(Model model){
        model.addAttribute("newKunde", new Kunde());
        return "createUser";
    }

    @PostMapping("/createKunde")
    public String createKunde(@ModelAttribute Kunde newKunde){
        System.out.println(newKunde.getName());
        angestellterService.createKunde(newKunde);
        return "redirect:/userlist";
    }

    @PostMapping("/deleteKunde/{id}")
    public String deleteKunde(@PathVariable int id){
        angestellterService.deleteKunde(id);
        return "redirect:/userlist";
    }

    @GetMapping("/showKunde")
    public String showKunde(@PathVariable int id, Model model){
        model.addAttribute("selectedKunde", angestellterService.getKunde(id));
        return "showUser";
    }
}
