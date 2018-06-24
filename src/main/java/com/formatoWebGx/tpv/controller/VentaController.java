package com.formatoWebGx.tpv.controller;

import com.formatoWebGx.tpv.constantes.Constantes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VentaController {
    @GetMapping("getVenta")
    public String getVenta(){
        return Constantes.venta;
    }
}
