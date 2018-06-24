package com.formatoWebGx.tpv.controller;

import com.formatoWebGx.tpv.constantes.Constantes;
import com.formatoWebGx.tpv.model.CategoriaModel;
import com.formatoWebGx.tpv.model.ProductoModel;
import com.formatoWebGx.tpv.model.ProvedorModel;
import com.formatoWebGx.tpv.model.UnidadMedidaModel;
import com.formatoWebGx.tpv.service.CategoriaService;
import com.formatoWebGx.tpv.service.ProductoService;
import com.formatoWebGx.tpv.service.ProvedorService;
import com.formatoWebGx.tpv.service.UnidadMedidaService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @Autowired
    private ProvedorService provedorService;

    @Autowired
    private CategoriaService categoriaService;

    @Autowired
    private UnidadMedidaService unidadMedidaService;

    private Log LOG = LogFactory.getLog(ProductoController.class);

    @GetMapping("/getProducto")
    public String getProducto(Model model){
        model.addAttribute("modelGetProducto", new ProductoModel());
        model.addAttribute("modelGetProvedorAgregars", new ProvedorModel());
        model.addAttribute("modelGetProvedorObteners", provedorService.obtenerProvedor());
        model.addAttribute("modelGetCategoriaAgregars", new CategoriaModel());
        model.addAttribute("modelGetCategoriaObteners", categoriaService.obtenerCategoria());
        model.addAttribute("modelGetUnidadMedidaAgregars", new UnidadMedidaModel());
        model.addAttribute("modelGetUnidadMedidaObteners", unidadMedidaService.obtenerUnidadMedida());
        return Constantes.producto;
    }

    @PostMapping("/postProducto")
    public String postProducto(@ModelAttribute ProductoModel productoModel, ProvedorModel provedorModel, CategoriaModel categoriaModel, UnidadMedidaModel unidadMedidaModel){
        productoModel.setProvedorId(provedorModel.getIdProvedor());
        productoModel.setCategoriaId(categoriaModel.getIdCategoria());
        productoModel.setUnidadMedidaId(unidadMedidaModel.getIdUnidadMedida());
        productoService.insertaProvedor(productoModel);
        return "redirect:/getProductoTable";
    }

    @GetMapping("/getProductoTable")
    public String getCategoriaTable(Model model){
        List<ProductoModel> productoModel = productoService.obtenerProducto();
        model.addAttribute("modelGetProductoTable", productoModel);
        return Constantes.productoTable;
    }
}
