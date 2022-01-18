package com.example.atividadejpateste.service;

import com.example.atividadejpateste.entity.Endereco;
import com.example.atividadejpateste.repository.EnderecoRepository;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    private EnderecoRepository enderecoRepository;

    public EnderecoService(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    public void salvar(Endereco endereco) {
        enderecoRepository.save(endereco);
    }

}
