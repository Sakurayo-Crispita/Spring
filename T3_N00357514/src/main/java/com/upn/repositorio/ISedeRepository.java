package com.upn.repositorio;

import com.upn.datos.Sede;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISedeRepository extends JpaRepository<Sede, Long> {
}
