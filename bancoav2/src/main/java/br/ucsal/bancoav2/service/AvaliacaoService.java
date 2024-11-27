package br.ucsal.bancoav2.service;

import br.ucsal.bancoav2.entities.Avaliacao;
import br.ucsal.bancoav2.repository.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AvaliacaoService {
    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    public List<Avaliacao> listarTodos() {
        return avaliacaoRepository.findAll();
    }

    public Optional<Avaliacao> buscarPorId(Long id) {
        return avaliacaoRepository.findById(id);
    }

    public Avaliacao salvar(Avaliacao avaliacao) {
        return avaliacaoRepository.save(avaliacao);
    }

    public void excluir(Long id) {
        avaliacaoRepository.deleteById(id);
    }
}
