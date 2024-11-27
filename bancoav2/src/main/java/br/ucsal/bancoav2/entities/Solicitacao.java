package br.ucsal.bancoav2.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Solicitacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "espaco_id")
    private EspacoFisico espaco;

    @ManyToOne
    @JoinColumn(name = "solicitante_id")
    private Usuario solicitante;

    private LocalDateTime dataSolicitacao;
    private LocalDateTime dataReserva;
    private String horaFim;
    private String status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EspacoFisico getEspaco() {
        return espaco;
    }

    public void setEspaco(EspacoFisico espaco) {
        this.espaco = espaco;
    }

    public Usuario getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Usuario solicitante) {
        this.solicitante = solicitante;
    }

    public LocalDateTime getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(LocalDateTime dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public LocalDateTime getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDateTime dataReserva) {
        this.dataReserva = dataReserva;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
