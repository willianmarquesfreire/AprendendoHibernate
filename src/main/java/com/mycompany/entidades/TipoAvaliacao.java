package com.mycompany.entidades;

public enum TipoAvaliacao {

    PROVA("Prova"),
    TRABALHO("Trabalho"),
    APRESENTACAO("Apresentacao");

    private final String descricao;

    TipoAvaliacao(String descricao) {
        this.descricao = descricao;

    }

    public String getDescricao() {
        return descricao;
    }
}
