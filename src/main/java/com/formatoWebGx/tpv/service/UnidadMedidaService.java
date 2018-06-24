package com.formatoWebGx.tpv.service;

import com.formatoWebGx.tpv.model.UnidadMedidaModel;

import java.util.List;

public interface UnidadMedidaService {
    Integer insertaUnidadMedida(UnidadMedidaModel unidadMedidaModel);
    List<UnidadMedidaModel> obtenerUnidadMedida();
}
