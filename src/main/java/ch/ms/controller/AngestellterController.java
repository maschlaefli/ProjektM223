package ch.ms.controller;

import ch.ms.model.Kunde;
import ch.ms.service.AngestellterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AngestellterController {

    //Zugriff auf Servide
    private AngestellterService angestellterService;

    //Konstruktor
    public AngestellterController(AngestellterService angestellterService){
        this.angestellterService = angestellterService;
    }

    //Lade alle Kunden in Liste kundenliste
    @GetMapping("/userlist")
    public String getKunden(Model model){
        model.addAttribute("kundenliste", angestellterService.getKunden());
        return "userlist";
    }

    //Leerer Kunde in Model hinzufügen
    @GetMapping("/userlist/createUser")
    public String toCreateUser(Model model){
        model.addAttribute("newKunde", new Kunde());
        return "createUser";
    }

    //Kunde aus model an Service übergeben und in DB eintragen
    @PostMapping("/createKunde")
    public String createKunde(@ModelAttribute Kunde newKunde){
        System.out.println(newKunde.getName());
        angestellterService.createKunde(newKunde);
        return "redirect:/userlist";
    }

    //Kunde anhand id von Pathvariabel löschen indem Id an Service weitergegeben wird
    @PostMapping("/deleteKunde/{id}")
    public String deleteKunde(@PathVariable int id){
        angestellterService.deleteKunde(id);
        return "redirect:/userlist";
    }

    //Den ausgewählten Kunden ins Model hinzufügen
    @GetMapping("/showKunde")
    public String showKunde(@PathVariable int id, Model model){
        model.addAttribute("selectedKunde", angestellterService.getKunde(id));
        return "showUser";
    }
}
