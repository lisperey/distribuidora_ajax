package com.br.distribuidora.ajax.controller;

import com.br.distribuidora.ajax.entity.DadosCartoes;
import com.br.distribuidora.ajax.service.DadosCartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dados")
public class DadosCartaoController {
    @Autowired
    DadosCartaoService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<DadosCartoes> create(@RequestBody DadosCartoes dadosCartoes) {
        DadosCartoes dadosCartoesCreated = service.create(dadosCartoes);
        return ResponseEntity.status(201).body(dadosCartoesCreated);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<DadosCartoes> update(@RequestBody DadosCartoes dadosCartoes) {
        DadosCartoes dadosCartoesCreated = service.create(dadosCartoes);

        return ResponseEntity.status(201).body(dadosCartoesCreated);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
