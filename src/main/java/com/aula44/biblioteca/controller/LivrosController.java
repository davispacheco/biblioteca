package com.aula44.biblioteca.controller;

import com.aula44.biblioteca.model.LivrosModel;
import com.aula44.biblioteca.service.LivrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LivrosController {
    @Autowired
    private LivrosService livrosService;

    @GetMapping(path = "/livros")
    public List<LivrosModel> buscarTodosLivros() {
        return livrosService.buscarTodos();
    }

    @GetMapping(path = "/livros/{codigo}")
    public Optional<LivrosModel> buscarPorId(@PathVariable Long codigo) {
        return livrosService.buscarId(codigo);
    }

    @PostMapping(path = "/livros")
    @ResponseStatus(HttpStatus.CREATED)
    public LivrosModel cadastrarLivros(@RequestBody LivrosModel livrosModel) {
        return livrosService.cadastrar(livrosModel);
    }

    @PutMapping(path = "/livros/{codigo}")
    public LivrosModel alterarLivros(@RequestBody LivrosModel livrosModel) {
        return livrosService.alterar(livrosModel);
    }

    @DeleteMapping(path = "livros/{codigo}")
public void deletarLivros(@PathVariable Long codigo) {
        livrosService.deletar(codigo);
    }
}
