package br.ucsal.bancoav2.service;

import br.ucsal.bancoav2.entities.EspacoFisico;
import br.ucsal.bancoav2.repository.EspacoFisicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EspacoFisicoService {
    @Autowired
    private EspacoFisicoRepository espacoFisicoRepository;

    public List<EspacoFisico> listarTodos() {
        return espacoFisicoRepository.findAll();
    }

    public Optional<EspacoFisico> buscarPorId(Long id) {
        return espacoFisicoRepository.findById(id);
    }

    public EspacoFisico salvar(EspacoFisico espacoFisico) {
        return espacoFisicoRepository.save(espacoFisico);
    }

    public void excluir(Long id) {
        espacoFisicoRepository.deleteById(id);
    }
}
