package com.mycompany.entidades;

public enum TipoPeriodo {

    SEMESTRAL("semestral"),
    ANUAL("anual");

    private final String descricao;

    private TipoPeriodo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
