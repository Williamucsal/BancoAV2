package br.ucsal.bancoav2.controller;

import br.ucsal.bancoav2.entities.Solicitacao;
import br.ucsal.bancoav2.service.SolicitacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/solicitacoes")
public class SolicitacaoController {

    @Autowired
    private SolicitacaoService solicitacaoService;

    @GetMapping
    public ResponseEntity<List<Solicitacao>> listarTodos() {
        return ResponseEntity.ok(solicitacaoService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Solicitacao> buscarPorId(@PathVariable Long id) {
        Optional<Solicitacao> solicitacao = solicitacaoService.buscarPorId(id);
        return solicitacao.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Solicitacao> salvar(@RequestBody Solicitacao solicitacao) {
        return ResponseEntity.ok(solicitacaoService.salvar(solicitacao));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        solicitacaoService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
