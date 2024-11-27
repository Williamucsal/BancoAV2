package br.ucsal.bancoav2.service;

import br.ucsal.bancoav2.entities.Equipamento;
import br.ucsal.bancoav2.repository.EquipamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipamentoService {
    @Autowired
    private EquipamentoRepository equipamentoRepository;

    public List<Equipamento> listarTodos() {
        return equipamentoRepository.findAll();
    }

    public Optional<Equipamento> buscarPorId(Long id) {
        return equipamentoRepository.findById(id);
    }

    public Equipamento salvar(Equipamento equipamento) {
        return equipamentoRepository.save(equipamento);
    }

    public void excluir(Long id) {
        equipamentoRepository.deleteById(id);
    }
}
