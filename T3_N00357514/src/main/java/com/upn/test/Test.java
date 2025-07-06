package com.upn.test;

import com.upn.datos.Sede;
import com.upn.datos.Universidad;
import com.upn.servicio.IUniversidadServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;

@Component
public class Test implements CommandLineRunner {

    @Autowired
    private IUniversidadServicio servicio;

    @Override
    public void run(String... args) {
        ejecutar();
    }

    public void ejecutar() {
        Universidad u1 = new Universidad();
        u1.setNombre("Universidad Nacional de Trujillo");
        u1.setFechaCreacion(LocalDate.of(1824, 5, 10));

        Sede s1 = new Sede();
        s1.setCiudad("Trujillo");
        s1.setPoblacionEstudiantes(12000);
        s1.setUniversidad(u1);

        Sede s2 = new Sede();
        s2.setCiudad("Chimbote");
        s2.setPoblacionEstudiantes(6000);
        s2.setUniversidad(u1);

        u1.setSedes(Arrays.asList(s1, s2));

        Universidad u2 = new Universidad();
        u2.setNombre("Universidad Privada del Norte");
        u2.setFechaCreacion(LocalDate.of(1994, 11, 20));

        Sede s3 = new Sede();
        s3.setCiudad("Lima");
        s3.setPoblacionEstudiantes(25000);
        s3.setUniversidad(u2);
        
        Sede s4 = new Sede();
        s4.setCiudad("Cajamarca");
        s4.setPoblacionEstudiantes(15000);
        s4.setUniversidad(u2);

        u2.setSedes(Arrays.asList(s3, s4));

        servicio.guardar(u1);
        servicio.guardar(u2);

        servicio.obtenerTodas().forEach(System.out::println);
    }
}

