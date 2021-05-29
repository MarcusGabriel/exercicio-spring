package com.example.backend.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class VotacaoKey implements Serializable {
    @Column(name = "pauta_id")
    Long idPauta;

    @Column(name = "associado_id")
    Long idAssociado;

    public Long getIdPauta() {
        return idPauta;
    }

    public void setIdPauta(Long idPauta) {
        this.idPauta = idPauta;
    }

    public Long getIdAssociado() {
        return idAssociado;
    }

    public void setIdAssociado(Long idAssociado) {
        this.idAssociado = idAssociado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VotacaoKey votacao = (VotacaoKey) o;
        return Objects.equals(idPauta, votacao.idPauta) &&
                Objects.equals(idAssociado, votacao.idAssociado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPauta, idAssociado);
    }
}