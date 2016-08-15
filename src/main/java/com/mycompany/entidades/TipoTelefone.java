package com.mycompany.entidades;

public enum TipoTelefone {

    CELULAR("Celular"),
    RESIDENCIAL("Residencial");

    private final String descricao;

    TipoTelefone(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
