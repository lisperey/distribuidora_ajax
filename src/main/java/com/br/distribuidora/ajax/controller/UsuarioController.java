package com.br.distribuidora.ajax.controller;

import com.br.distribuidora.ajax.dto.CadastroUsuario;
import com.br.distribuidora.ajax.entity.Usuario;
import com.br.distribuidora.ajax.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
@PreAuthorize("hasRole('ROLE_DIRETOR')")
public class UsuarioController {
    @Autowired
    UsuarioService service;

    @GetMapping("/listar-todos")
    @ResponseStatus(HttpStatus.OK)
    public List<Usuario> findAll() {
        return service.listaTodos();
    }


    @GetMapping("/login/{email}/{senha}")
    @ResponseStatus(HttpStatus.OK)
    public Usuario listarAlunoDiciplina(@PathVariable String email, @PathVariable String senha) {
        return service.login(email, senha);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<CadastroUsuario> create(@RequestBody Usuario usuario) {
        CadastroUsuario usuarioCreated = service.createUsuario(usuario);
        return ResponseEntity.status(201).body(usuarioCreated);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Usuario> update(@RequestBody Usuario usuario) {
        Usuario usuarioCreated = service.create(usuario);

        return ResponseEntity.status(201).body(usuarioCreated);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Usuario> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
