package com.formatoWebGx.tpv.controller;

import com.formatoWebGx.tpv.constantes.Constantes;
import com.formatoWebGx.tpv.model.CategoriaModel;
import com.formatoWebGx.tpv.model.UnidadMedidaModel;
import com.formatoWebGx.tpv.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CategoriaController {
    @Autowired
    private CategoriaService sategoriaService;

    @GetMapping("/getCategoria")
    public String getCategoria(Model model){
        model.addAttribute("modelGetCategoria", new CategoriaModel());
        return Constantes.categoria;
    }

    @PostMapping("/postCategoria")
    public String postCategoria(@ModelAttribute CategoriaModel categoriaModel){
        sategoriaService.insertaCategoria(categoriaModel);
        return "redirect:/getCategoriaTable";
    }

    @GetMapping("/getCategoriaTable")
    public String getCategoriaTable(Model model){
        List<CategoriaModel> categoriaModel = sategoriaService.obtenerCategoria();
        model.addAttribute("modelGetCategoriaTable", categoriaModel);
        return Constantes.categoriaTable;
    }

}
