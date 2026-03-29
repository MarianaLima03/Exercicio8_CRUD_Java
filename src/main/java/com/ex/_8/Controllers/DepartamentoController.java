package com.ex._8.Controllers;

import com.ex._8.Models.DepartamentoModel;
import com.ex._8.Services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/departamento")
public class DepartamentoController {

    @Autowired
    private DepartamentoService departamentoService;

    @PostMapping
    public ResponseEntity<DepartamentoModel> criarDepartamento(@RequestBody DepartamentoModel departamentoModel) {
        DepartamentoModel request = departamentoService.criarDepartamento(departamentoModel);

        URI uri = URI.create("/departamento/" + request.getId());
        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping
    public ResponseEntity<List<DepartamentoModel>> listarDepartamento() {
        List<DepartamentoModel> request = departamentoService.findAll();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<DepartamentoModel>> buscarIdDepartamento(@PathVariable Long id) {
        Optional<DepartamentoModel> request = departamentoService.buscarIdDepartamento(id);
        return ResponseEntity.ok().body(request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarDepartamento(@PathVariable Long id) {
        departamentoService.deletarDepartamento(id);
        return ResponseEntity.noContent().build();
    }
}