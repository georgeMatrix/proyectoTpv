package com.formatoWebGx.tpv.service;

import com.formatoWebGx.tpv.model.ProvedorModel;
import com.formatoWebGx.tpv.model.UnidadMedidaModel;

import java.util.List;

public interface ProvedorService {
    Integer insertaProvedor(ProvedorModel provedorModel);
    List<ProvedorModel> obtenerProvedor();
}
