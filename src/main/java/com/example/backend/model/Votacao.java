package com.example.backend.model;

import com.example.backend.enums.VotoVotacao;

import javax.persistence.*;

@Table(name = "VOTACAO")
@Entity
public class Votacao {
    @EmbeddedId
    private VotacaoKey id;

    @ManyToOne
    @MapsId("pautaId")
    @JoinColumn(name = "pauta_id")
    private Pauta pauta;

    @ManyToOne
    @MapsId("associadoId")
    @JoinColumn(name = "associado_id")
    private Associado associado;

    private VotoVotacao voto;

    public VotacaoKey getId() {
        return id;
    }

    public void setId(VotacaoKey id) {
        this.id = id;
    }

    public Pauta getPauta() {
        return pauta;
    }

    public void setPauta(Pauta pauta) {
        this.pauta = pauta;
    }

    public Associado getAssociado() {
        return associado;
    }

    public void setAssociado(Associado associado) {
        this.associado = associado;
    }

    public VotoVotacao getVoto() {
        return voto;
    }

    public void setVoto(VotoVotacao voto) {
        this.voto = voto;
    }
}