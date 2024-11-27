package br.ucsal.bancoav2.controller;

import br.ucsal.bancoav2.entities.Avaliacao;
import br.ucsal.bancoav2.service.AvaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoController {

    @Autowired
    private AvaliacaoService avaliacaoService;

    @GetMapping
    public ResponseEntity<List<Avaliacao>> listarTodos() {
        return ResponseEntity.ok(avaliacaoService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Avaliacao> buscarPorId(@PathVariable Long id) {
        Optional<Avaliacao> avaliacao = avaliacaoService.buscarPorId(id);
        return avaliacao.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Avaliacao> salvar(@RequestBody Avaliacao avaliacao) {
        return ResponseEntity.ok(avaliacaoService.salvar(avaliacao));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        avaliacaoService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
