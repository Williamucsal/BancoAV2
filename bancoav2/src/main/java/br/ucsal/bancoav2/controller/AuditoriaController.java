package br.ucsal.bancoav2.controller;

import br.ucsal.bancoav2.entities.Auditoria;
import br.ucsal.bancoav2.service.AuditoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/auditorias")
public class AuditoriaController {

    @Autowired
    private AuditoriaService auditoriaService;

    @GetMapping
    public ResponseEntity<List<Auditoria>> listarTodos() {
        return ResponseEntity.ok(auditoriaService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Auditoria> buscarPorId(@PathVariable Long id) {
        Optional<Auditoria> auditoria = auditoriaService.buscarPorId(id);
        return auditoria.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Auditoria> salvar(@RequestBody Auditoria auditoria) {
        return ResponseEntity.ok(auditoriaService.salvar(auditoria));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        auditoriaService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
