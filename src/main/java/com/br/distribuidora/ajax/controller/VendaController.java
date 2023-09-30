package com.br.distribuidora.ajax.controller;

import com.br.distribuidora.ajax.entity.Venda;
import com.br.distribuidora.ajax.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venda")
public class VendaController {
    @Autowired
    VendaService service;

    @GetMapping("/listar-todos/{idUsuario}")
    @ResponseStatus(HttpStatus.OK)
    public List<Venda> listaVendaUsuario(@PathVariable Long idUsuario) {
        return service.listaVendaUsuario(idUsuario);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Venda> create(@RequestBody Venda venda) {
        Venda vendaCreated = service.create(venda);
        return ResponseEntity.status(201).body(vendaCreated);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Venda> update(@RequestBody Venda venda) {
        Venda vendaCreated = service.create(venda);

        return ResponseEntity.status(201).body(vendaCreated);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
