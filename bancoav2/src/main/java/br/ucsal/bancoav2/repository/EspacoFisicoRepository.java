package br.ucsal.bancoav2.repository;

import br.ucsal.bancoav2.entities.EspacoFisico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspacoFisicoRepository extends JpaRepository<EspacoFisico, Long> {
}
