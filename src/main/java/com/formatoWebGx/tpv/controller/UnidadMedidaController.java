package com.formatoWebGx.tpv.controller;

import com.formatoWebGx.tpv.constantes.Constantes;
import com.formatoWebGx.tpv.model.UnidadMedidaModel;
import com.formatoWebGx.tpv.service.UnidadMedidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UnidadMedidaController {
    @Autowired
    private UnidadMedidaService unidadMedidaService;

    @GetMapping("/getUnidadMedida")
    public String getUnidadMedida(Model model){
        model.addAttribute("modelGetUnidadMedida", new UnidadMedidaModel());
    return Constantes.unidadMedida;
    }

    @PostMapping("/postUnidadMedida")
    public String postUnidadMedida(@ModelAttribute UnidadMedidaModel unidadMedidaModel){
        unidadMedidaService.insertaUnidadMedida(unidadMedidaModel);
        return "redirect:/getUnidadMedidaTable";
    }

    @GetMapping("/getUnidadMedidaTable")
    public String getUnidadMedidaTable(Model model){
        List<UnidadMedidaModel> unidadMedidaModel = unidadMedidaService.obtenerUnidadMedida();
        model.addAttribute("modelGetUnidadMedidaTable", unidadMedidaModel);
        return Constantes.unidadMedidaTable;
    }
}
