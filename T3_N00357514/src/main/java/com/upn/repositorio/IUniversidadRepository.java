package com.upn.repositorio;

import com.upn.datos.Universidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUniversidadRepository extends JpaRepository<Universidad, Long> {
}
