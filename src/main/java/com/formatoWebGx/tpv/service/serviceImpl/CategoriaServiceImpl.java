package com.formatoWebGx.tpv.service.serviceImpl;

import com.formatoWebGx.tpv.converter.TpvConverter;
import com.formatoWebGx.tpv.entity.Categoria;
import com.formatoWebGx.tpv.model.CategoriaModel;
import com.formatoWebGx.tpv.repository.CategoriaRepository;
import com.formatoWebGx.tpv.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private TpvConverter tpvConverter;

    @Override
    public Integer insertaCategoria(CategoriaModel categoriaModel) {
        Categoria Categoria = tpvConverter.CategoriaModelToEntity(categoriaModel);
        categoriaRepository.save(Categoria);
        return null;
    }

    @Override
    public List<CategoriaModel> obtenerCategoria() {
        return tpvConverter.categoriaEntityToModels(categoriaRepository.findAll());
    }
}
