package com.senac.uc6.pacoquinha.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller( "/sobre")
public class SobreController {

    @GetMapping( "/sobre")

    public String sobre(){
        return "sobre";
    }
}
