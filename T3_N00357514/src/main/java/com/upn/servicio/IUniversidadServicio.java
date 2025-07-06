package com.upn.servicio;

import com.upn.datos.Universidad;
import java.util.List;

public interface IUniversidadServicio {
    Universidad obtenerPorId(Long id);
    List<Universidad> obtenerTodas();
    Universidad guardar(Universidad u);
    Universidad actualizar(Universidad u);
    void eliminar(Long id);
}
