package com.formatoWebGx.tpv.service.serviceImpl;

import com.formatoWebGx.tpv.converter.TpvConverter;
import com.formatoWebGx.tpv.entity.Provedor;
import com.formatoWebGx.tpv.model.ProvedorModel;
import com.formatoWebGx.tpv.repository.ProvedorRepository;
import com.formatoWebGx.tpv.service.ProvedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvedorServiceImpl implements ProvedorService {

    @Autowired
    private ProvedorRepository provedorRepository;
    @Autowired
    private TpvConverter tpvConverter;

    @Override
    public Integer insertaProvedor(ProvedorModel provedorModel) {
        Provedor provedor = tpvConverter.ProvedorModelToEntity(provedorModel);
        provedorRepository.save(provedor);
        return null;
    }

    @Override
    public List<ProvedorModel> obtenerProvedor() {
        return tpvConverter.provedorModels(provedorRepository.findAll());
    }
}
