package com.upn.servicio;

import com.upn.datos.Universidad;
import com.upn.repositorio.IUniversidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversidadServicioImpl implements IUniversidadServicio {

    @Autowired
    private IUniversidadRepository repo;

    @Override
    public Universidad obtenerPorId(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Universidad> obtenerTodas() {
        return repo.findAll();
    }

    @Override
    public Universidad guardar(Universidad universidad) {
        return repo.save(universidad);
    }

    @Override
    public Universidad actualizar(Universidad universidad) {
        return repo.save(universidad);
    }

    @Override
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
