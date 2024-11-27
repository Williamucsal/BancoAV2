package br.ucsal.bancoav2.service;

import br.ucsal.bancoav2.entities.Solicitacao;
import br.ucsal.bancoav2.repository.SolicitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SolicitacaoService {
    @Autowired
    private SolicitacaoRepository solicitacaoRepository;

    public List<Solicitacao> listarTodos() {
        return solicitacaoRepository.findAll();
    }

    public Optional<Solicitacao> buscarPorId(Long id) {
        return solicitacaoRepository.findById(id);
    }

    public Solicitacao salvar(Solicitacao solicitacao) {
        return solicitacaoRepository.save(solicitacao);
    }

    public void excluir(Long id) {
        solicitacaoRepository.deleteById(id);
    }
}
