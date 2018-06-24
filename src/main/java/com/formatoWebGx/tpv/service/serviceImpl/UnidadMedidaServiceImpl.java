package com.formatoWebGx.tpv.service.serviceImpl;

import com.formatoWebGx.tpv.converter.TpvConverter;
import com.formatoWebGx.tpv.entity.UnidadMedida;
import com.formatoWebGx.tpv.model.UnidadMedidaModel;
import com.formatoWebGx.tpv.repository.UnidadMedidaRepository;
import com.formatoWebGx.tpv.service.UnidadMedidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnidadMedidaServiceImpl implements UnidadMedidaService {
    @Autowired
    private UnidadMedidaRepository unidadMedidaRepository;

    @Autowired
    private TpvConverter tpvConverter;

    @Override
    public Integer insertaUnidadMedida(UnidadMedidaModel unidadMedidaModel) {
        UnidadMedida unidadMedida = tpvConverter.UnidadMedidaModelToEntity(unidadMedidaModel);
        unidadMedidaRepository.save(unidadMedida);
        return null;
    }

    @Override
    public List<UnidadMedidaModel> obtenerUnidadMedida() {
        List<UnidadMedidaModel> unidadMedidaModel = tpvConverter.unidadMedidaEntityToModels(unidadMedidaRepository.findAll());
        return unidadMedidaModel;
    }

}
