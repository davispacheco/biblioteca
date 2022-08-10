package com.aula44.biblioteca.service;

import com.aula44.biblioteca.model.LivrosModel;
import com.aula44.biblioteca.repository.LivrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivrosService {

    @Autowired
    private LivrosRepository livrosRepository;

    public List<LivrosModel> buscarTodos() {
        return livrosRepository.findAll();
    }

    public Optional<LivrosModel> buscarId(Long codigo) {
        return livrosRepository.findById(codigo);
    }

    public LivrosModel cadastrar(LivrosModel livrosModel) {

        livrosModel.getCodigo();
        livrosModel.getNome();
        livrosModel.getAutor();
        livrosModel.getDataLancamento();

        return livrosRepository.save(livrosModel);
    }

    public LivrosModel alterar(LivrosModel livrosModel) {

        livrosModel.getCodigo();
        livrosModel.getNome();
        livrosModel.getAutor();
        livrosModel.getDataLancamento();

        return livrosRepository.save(livrosModel);
    }

    public void deletar(Long codigo) {
        livrosRepository.deleteById(codigo);
    }
}
