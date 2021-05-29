package com.example.backend.form;

import com.example.backend.model.Pauta;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class PautaForm {

    @NotNull
    @NotEmpty
    private String descricao;


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public Pauta convertToDto() {
        return new Pauta(descricao);
    }
}
