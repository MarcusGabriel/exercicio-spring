package com.example.backend.model;

import com.example.backend.enums.VotoVotacao;

import javax.persistence.*;

@Table(name = "PAUTA")
@Entity
public class Pauta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private VotoVotacao resultadoVotacao = VotoVotacao.AGUARDANDO_APURACAO;

    public Pauta(String descricao) {
        this.descricao = descricao;
    }

    public VotoVotacao getResultadoVotacao() {
        return resultadoVotacao;
    }

    public void setResultadoVotacao(VotoVotacao resultadoVotacao) {
        this.resultadoVotacao = resultadoVotacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}