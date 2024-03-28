package com.ps.service.imp;

import com.ps.model.Prestamo;
import com.ps.repository.PrestamoRepository;
import com.ps.service.IPrestamoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PrestamoService implements IPrestamoService {

    private final PrestamoRepository prestamoRepository;

    PrestamoService(PrestamoRepository prestamoRepository) {
        this.prestamoRepository = prestamoRepository;
    }

    @Override
    public List<Prestamo> getPrestamo() {
        return prestamoRepository.findAll();
    }

    @Override
    public Prestamo getPrestamo(Long id) {
        return null;
    }

    @Override
    public Prestamo createPrestamo(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    @Override
    public Prestamo savePrestamo(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    @Override
    public Prestamo updatePrestamo(Prestamo Prestamo) {
        return prestamoRepository.save(Prestamo);
    }

    @Override
    public void deletePrestamo(Long id) {
       prestamoRepository.deleteById(id);
    }

}