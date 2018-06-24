package com.formatoWebGx.tpv.controller;

import com.formatoWebGx.tpv.constantes.Constantes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TpvController {
    @GetMapping("/")
    public String getRemap(){
        return "redirect:/inicio";
    }

    @GetMapping("/inicio")
    public String getInicio(){
        return Constantes.inicio;
    }
}
