package com.formatoWebGx.tpv.service;

import com.formatoWebGx.tpv.model.ProductoModel;

import java.util.List;

public interface ProductoService {
    Integer insertaProvedor(ProductoModel productoModel);
    List<ProductoModel> obtenerProducto();
}
