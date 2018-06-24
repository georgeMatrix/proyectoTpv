package com.formatoWebGx.tpv.service.serviceImpl;

import com.formatoWebGx.tpv.converter.TpvConverter;
import com.formatoWebGx.tpv.entity.Producto;
import com.formatoWebGx.tpv.model.ProductoModel;
import com.formatoWebGx.tpv.repository.ProductoRepository;
import com.formatoWebGx.tpv.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private TpvConverter tpvConverter;

    @Override
    public Integer insertaProvedor(ProductoModel productoModel) {
        Producto producto = tpvConverter.ProductoModelToEntity(productoModel);
        productoRepository.save(producto);
        return null;
    }

    @Override
    public List<ProductoModel> obtenerProducto() {
        List<ProductoModel> productoModel = tpvConverter.productoEntityToModels(productoRepository.findAll());
        return productoModel;
    }
}
