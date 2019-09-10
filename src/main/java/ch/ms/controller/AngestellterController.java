package ch.ms.controller;

import ch.ms.model.Kunde;
import ch.ms.service.AngestellterService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AngestellterController {

    private AngestellterService angestellterService;

    public AngestellterController(AngestellterService angestellterService){
        this.angestellterService = angestellterService;
    }

    @GetMapping("/userlist/getUser")
    public String getKunde(@PathVariable int id, Model model){
        //model.addAttribute("user", angestellterService.getKunde(id));
        return "/profile";
    }

    @GetMapping("/userlist")
    public String getKunden(){
        return null;
    }

    @PostMapping("/userlist/updateUser")
    public String updateKunde(){
        return null;

    }

    @DeleteMapping("/userlist/deleteUser")
    public String deleteKunde(){
        return null;

    }

    @PostMapping("/userlist/createUser")
    public String createUser(){
        return null;

    }

    @PostMapping("/userlist/logout")
    public String logout(){
        return null;
    }
}
