package com.formatoWebGx.tpv.converter;

import com.formatoWebGx.tpv.entity.Categoria;
import com.formatoWebGx.tpv.entity.Producto;
import com.formatoWebGx.tpv.entity.Provedor;
import com.formatoWebGx.tpv.entity.UnidadMedida;
import com.formatoWebGx.tpv.model.CategoriaModel;
import com.formatoWebGx.tpv.model.ProductoModel;
import com.formatoWebGx.tpv.model.ProvedorModel;
import com.formatoWebGx.tpv.model.UnidadMedidaModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TpvConverter {
    public UnidadMedida UnidadMedidaModelToEntity(UnidadMedidaModel unidadMedidaModel){
        UnidadMedida unidadMedida = new UnidadMedida();
        unidadMedida.setIdUnidadMedida(unidadMedidaModel.getIdUnidadMedida());
        unidadMedida.setNombre(unidadMedidaModel.getNombre());
        unidadMedida.setDescripcion(unidadMedidaModel.getDescripcion());
        unidadMedida.setValorDecimal(unidadMedidaModel.getDecimal());
        return unidadMedida;
    }

    public Provedor ProvedorModelToEntity(ProvedorModel provedorModel){
        Provedor provedor = new Provedor();
        provedor.setIdProvedor(provedorModel.getIdProvedor());
        provedor.setNombre(provedorModel.getNombre());
        provedor.setRazonSocial(provedorModel.getRazonSocial());
        provedor.setRfc(provedorModel.getRfc());
        provedor.setDireccion(provedorModel.getDireccion());
        provedor.setTelefono(provedorModel.getTelefono());
        provedor.setContacto(provedorModel.getContacto());
        return provedor;
    }

    public Categoria CategoriaModelToEntity(CategoriaModel categoriaModel){
        Categoria categoria = new Categoria();
        categoria.setIdCategoria(categoriaModel.getIdCategoria());
        categoria.setNombre(categoriaModel.getNombre());
        categoria.setDescripcion(categoriaModel.getDescripcion());
        return categoria;
    }

    public Producto ProductoModelToEntity(ProductoModel productoModel){
        Producto producto = new Producto();
        UnidadMedida unidadMedida = new UnidadMedida();
        Provedor provedor = new Provedor();
        Categoria categoria = new Categoria();

        producto.setIdProducto(productoModel.getIdProducto());
        producto.setClave(productoModel.getClave());
        producto.setSku(productoModel.getSku());
        producto.setSkuVnpk(productoModel.getSkuVnpk());
        //PROVEDOR
        provedor.setIdProvedor(productoModel.getProvedorId());
        producto.setProvedor(provedor);
        //CATEGORIA
        categoria.setIdCategoria(productoModel.getCategoriaId());
        producto.setCategoria(categoria);
        producto.setDescripcion(productoModel.getDescripcion());
        producto.setDescripcionE(productoModel.getDescripcionE());
        producto.setCosto(productoModel.getCosto());
        producto.setIvaCosto(productoModel.getIvaCosto());
        producto.setIepsCosto(productoModel.getIepsCosto());
        producto.setTotalCosto(productoModel.getTotalCosto());
        producto.setPrecioMay(productoModel.getPrecioMay());
        producto.setIvaPrecioMay(productoModel.getIvaPrecioMay());
        producto.setIepsPrecioMay(productoModel.getIepsPrecioMay());
        producto.setTotalPrecioMay(productoModel.getTotalPrecioMay());
        producto.setPrecioMm(productoModel.getPrecioMm());
        producto.setIvaPrecioMm(productoModel.getIvaPrecioMm());
        producto.setIepsPrecioMm(productoModel.getIepsPrecioMm());
        producto.setTotalPrecioMm(productoModel.getTotalPrecioMm());
        producto.setPrecioRetail(productoModel.getPrecioRetail());
        producto.setIvaPrecioRetail(productoModel.getIvaPrecioRetail());
        producto.setIepsPrecioRetail(productoModel.getIepsPrecioRetail());
        producto.setTotalPrecioRetail(productoModel.getTotalPrecioRetail());
        producto.setExistencia(productoModel.getExistencia());
        producto.setActivoInactivo(productoModel.getActivoInactivo());
        //productoModel.getActivoInactivo();
        //UNIDAD DE MEDIDA
        unidadMedida.setIdUnidadMedida(productoModel.getUnidadMedidaId());
        producto.setUnidadMedida(unidadMedida);
        return producto;
    }

    public UnidadMedidaModel unidadMedidaEntityToModel(UnidadMedida unidadMedida){
        UnidadMedidaModel unidadMedidaModel = new UnidadMedidaModel();
        unidadMedidaModel.setIdUnidadMedida(unidadMedida.getIdUnidadMedida());
        unidadMedidaModel.setNombre(unidadMedida.getNombre());
        unidadMedidaModel.setDescripcion(unidadMedida.getDescripcion());
        unidadMedidaModel.setDecimal(unidadMedida.getValorDecimal());
        return unidadMedidaModel;
    }

    public List<UnidadMedidaModel> unidadMedidaEntityToModels (List<UnidadMedida> unidadMedidas){
        List<UnidadMedidaModel> unidadMedidaModels = new ArrayList<>();
        for (UnidadMedida unidadMedida: unidadMedidas
             ) {
            unidadMedidaModels.add(unidadMedidaEntityToModel(unidadMedida));
        }
        return unidadMedidaModels;
    }

    public CategoriaModel categoriaEntityToModel(Categoria categoria){
        CategoriaModel categoriaModel = new CategoriaModel();
        categoriaModel.setIdCategoria(categoria.getIdCategoria());
        categoriaModel.setNombre(categoria.getNombre());
        categoriaModel.setDescripcion(categoria.getDescripcion());
        return categoriaModel;
    }

    public List<CategoriaModel> categoriaEntityToModels(List<Categoria> categorias){
        List<CategoriaModel> categoriaModels = new ArrayList<>();
        for (Categoria categoria:categorias
             ) {
            categoriaModels.add(categoriaEntityToModel(categoria));
        }
        return categoriaModels;
    }

    public ProvedorModel provedorEntityToModel(Provedor provedor){
        ProvedorModel provedorModel = new ProvedorModel();
        provedorModel.setIdProvedor(provedor.getIdProvedor());
        provedorModel.setNombre(provedor.getNombre());
        provedorModel.setRazonSocial(provedor.getRazonSocial());
        provedorModel.setRfc(provedor.getRfc());
        provedorModel.setDireccion(provedor.getDireccion());
        provedorModel.setTelefono(provedor.getTelefono());
        provedorModel.setContacto(provedor.getContacto());
        return provedorModel;
    }

    public List<ProvedorModel> provedorModels(List<Provedor> provedors){
        List<ProvedorModel> provedorModels = new ArrayList<>();
        for (Provedor provedor: provedors
             ) {
            provedorModels.add(provedorEntityToModel(provedor));
        }
        return provedorModels;
    }

    public ProductoModel productoEntityToModel (Producto producto){
        ProductoModel productoModel = new ProductoModel();

        productoModel.setIdProducto(producto.getIdProducto());
        productoModel.setClave(producto.getClave());
        productoModel.setSku(producto.getSku());
        productoModel.setSkuVnpk(producto.getSkuVnpk());
        //PROVEDOR
        //producto.setIdProvedor(productoModel.getProvedorId());
        //producto.setProvedor(provedor);
        //CATEGORIA
        //categoria.setIdCategoria(productoModel.getCategoriaId());
        //producto.setCategoria(categoria);
        productoModel.setDescripcion(producto.getDescripcion());
        productoModel.setDescripcionE(producto.getDescripcionE());
        productoModel.setCosto(producto.getCosto());
        productoModel.setIvaCosto(producto.getIvaCosto());
        productoModel.setIepsCosto(producto.getIepsCosto());
        productoModel.setTotalCosto(producto.getTotalCosto());
        productoModel.setPrecioMay(producto.getPrecioMay());
        productoModel.setIvaPrecioMay(producto.getIvaPrecioMay());
        productoModel.setIepsPrecioMay(producto.getIepsPrecioMay());
        productoModel.setTotalPrecioMay(producto.getTotalPrecioMay());
        productoModel.setPrecioMm(producto.getPrecioMm());
        productoModel.setIvaPrecioMm(producto.getIvaPrecioMm());
        productoModel.setIepsPrecioMm(producto.getIepsPrecioMm());
        productoModel.setTotalPrecioMm(producto.getTotalPrecioMm());
        productoModel.setPrecioRetail(producto.getPrecioRetail());
        productoModel.setIvaPrecioRetail(producto.getIvaPrecioRetail());
        productoModel.setIepsPrecioRetail(producto.getIepsPrecioRetail());
        productoModel.setTotalPrecioRetail(producto.getTotalPrecioRetail());
        productoModel.setExistencia(producto.getExistencia());
        productoModel.setActivoInactivo(producto.getActivoInactivo());
        //UNIDAD DE MEDIDA
        //unidadMedida.setIdUnidadMedida(productoModel.getUnidadMedidaId());
        //producto.setUnidadMedida(unidadMedida);
        return productoModel;
    }

    public List<ProductoModel> productoEntityToModels(List<Producto> producto){
        List<ProductoModel> ProductoModels = new ArrayList<>();
        for (Producto productoI:producto
             ) {
            ProductoModels.add(productoEntityToModel(productoI));
        }
        return ProductoModels;
    }
}
