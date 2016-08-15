package com.mycompany.entidades;

public enum TipoInstituicao {

    UNIVERSIDADE("Universidade"),
    FACULDADE("Faculdade");

    private final String descricao;

    private TipoInstituicao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
