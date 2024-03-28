package com.ps.service;

import com.ps.model.Cliente;
import com.ps.model.Prestamo;

import java.util.List;

public interface IPrestamoService {

    List<Prestamo> getPrestamo();

    public Prestamo getPrestamo(Long id);

    public Prestamo createPrestamo(Prestamo prestamo);

    public Prestamo savePrestamo(Prestamo prestamo);
    public  Prestamo updatePrestamo(Prestamo prestamo);

    public void deletePrestamo(Long id);


}
