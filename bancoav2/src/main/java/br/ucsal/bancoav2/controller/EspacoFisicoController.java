package br.ucsal.bancoav2.controller;

import br.ucsal.bancoav2.entities.EspacoFisico;
import br.ucsal.bancoav2.service.EspacoFisicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/espacos-fisicos")
public class EspacoFisicoController {

    @Autowired
    private EspacoFisicoService espacoFisicoService;

    @GetMapping
    public ResponseEntity<List<EspacoFisico>> listarTodos() {
        return ResponseEntity.ok(espacoFisicoService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EspacoFisico> buscarPorId(@PathVariable Long id) {
        Optional<EspacoFisico> espaco = espacoFisicoService.buscarPorId(id);
        return espaco.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<EspacoFisico> salvar(@RequestBody EspacoFisico espacoFisico) {
        return ResponseEntity.ok(espacoFisicoService.salvar(espacoFisico));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        espacoFisicoService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
