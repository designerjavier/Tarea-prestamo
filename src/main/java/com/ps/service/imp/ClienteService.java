package com.ps.service.imp;

import com.ps.model.Cliente;
import com.ps.repository.ClienteRepository;
import com.ps.service.IClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service

public class ClienteService implements IClienteService {

    private final ClienteRepository clienteRepository;
    ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository=clienteRepository;
    }
    @Override
    public Cliente getClienteById(Long id) {
        return clienteRepository.getReferenceById(id);
    }

    @Override
    public Cliente createCliente(Cliente cliente) {

        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente updateCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
