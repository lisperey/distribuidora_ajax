package com.br.distribuidora.ajax.controller;

import com.br.distribuidora.ajax.entity.Produto;
import com.br.distribuidora.ajax.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    ProdutoService service;

    @GetMapping("/listar-todos")
    @ResponseStatus(HttpStatus.OK)
    public List<Produto> findAll() {
        return service.listaTodos();
    }


    @GetMapping("/login/{idTipo}")
    @ResponseStatus(HttpStatus.OK)
    public List<Produto> listaProdutoTipo(@PathVariable long idTipo) {
        return service.listaProdutoTipo(idTipo);
    }
}
