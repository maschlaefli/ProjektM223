package ch.ms.controller;

import ch.ms.model.Kunde;
import ch.ms.service.AngestellterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userlist")
public class AngestellterController {

    private AngestellterService angestellterService;

    public AngestellterController(AngestellterService angestellterService){
        this.angestellterService = angestellterService;
    }

    @GetMapping
    public void getKunde(){
        //ToDo Get Kunde
    }

    @GetMapping
    public void getKunden(){

    }

    @PostMapping
    public void updateKunde(){}

    @DeleteMapping
    public void deleteKunde(){}

    @PostMapping
    public void createUser(){}

    @PostMapping
    public void logout(){}
}
