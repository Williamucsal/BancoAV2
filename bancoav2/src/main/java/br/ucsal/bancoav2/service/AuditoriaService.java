package br.ucsal.bancoav2.service;

import br.ucsal.bancoav2.entities.Auditoria;
import br.ucsal.bancoav2.repository.AuditoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuditoriaService {
    @Autowired
    private AuditoriaRepository auditoriaRepository;

    public List<Auditoria> listarTodos() {
        return auditoriaRepository.findAll();
    }

    public Optional<Auditoria> buscarPorId(Long id) {
        return auditoriaRepository.findById(id);
    }

    public Auditoria salvar(Auditoria auditoria) {
        return auditoriaRepository.save(auditoria);
    }

    public void excluir(Long id) {
        auditoriaRepository.deleteById(id);
    }
}
