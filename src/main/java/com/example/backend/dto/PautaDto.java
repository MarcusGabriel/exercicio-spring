package com.example.backend.dto;

import com.example.backend.enums.VotoVotacao;
import com.example.backend.model.Pauta;

public class PautaDto {
    private Long id;
    private String descricao;
    private VotoVotacao resultadoVotacao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public VotoVotacao getResultadoVotacao() {
        return resultadoVotacao;
    }

    public void setResultadoVotacao(VotoVotacao resultadoVotacao) {
        this.resultadoVotacao = resultadoVotacao;
    }

    public PautaDto(Pauta pauta) {
        this.id = pauta.getId();
        this.descricao = pauta.getDescricao();
        this.resultadoVotacao = pauta.getResultadoVotacao();
    }
}
