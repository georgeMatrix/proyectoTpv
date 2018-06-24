package com.formatoWebGx.tpv.repository;

import com.formatoWebGx.tpv.entity.UnidadMedida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository
public interface UnidadMedidaRepository extends JpaRepository<UnidadMedida, Serializable> {
}