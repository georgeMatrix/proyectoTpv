package com.formatoWebGx.tpv.service;

import com.formatoWebGx.tpv.model.CategoriaModel;
import com.formatoWebGx.tpv.model.ProvedorModel;

import java.util.List;

public interface CategoriaService {
    Integer insertaCategoria(CategoriaModel categoriaModel);
    List<CategoriaModel> obtenerCategoria();
}
