package com.formatoWebGx.tpv.controller;

import com.formatoWebGx.tpv.constantes.Constantes;
import com.formatoWebGx.tpv.model.ProvedorModel;
import com.formatoWebGx.tpv.service.ProvedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProvedorController {

    @Autowired
    private ProvedorService provedorService;

    @GetMapping("/getProvedor")
    public String getProvedor(Model model){
        model.addAttribute("modelGetProvedor", new ProvedorModel());
        return Constantes.provedor;
    }

    @PostMapping("/postProvedor")
    public String postProvedor(@ModelAttribute ProvedorModel provedorModel){
        provedorService.insertaProvedor(provedorModel);
    return "redirect:/getProvedorTable";
    }

    @GetMapping("/getProvedorTable")
    public String getProvedorTable(Model model){
        model.addAttribute("modelGetProvedorTable", provedorService.obtenerProvedor());
        return Constantes.provedorTable;
    }
}
