package com.formatoWebGx.tpv.repository;

import com.formatoWebGx.tpv.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Serializable> {
}
