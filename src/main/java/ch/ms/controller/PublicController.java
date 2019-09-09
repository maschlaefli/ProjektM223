package ch.ms.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class PublicController {

    @GetMapping("/api/public")
    public String getMessage(){
        return "Hello from public API ch.ms.jwt.controller";
    }
}
