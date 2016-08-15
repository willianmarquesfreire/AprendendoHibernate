package com.mycompany.entidades;

public class Instituicao {

    private String nome;
    private Calendario calendario;
    private TipoInstituicao tipoInstituicao;

    public Instituicao(String nome, Calendario calendario, TipoInstituicao tipoInstituicao) {
        this.nome = nome;
        this.calendario = calendario;
        this.tipoInstituicao = tipoInstituicao;
    }

    public Calendario getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendario calendario) {
        this.calendario = calendario;
    }

    public TipoInstituicao getTipoInstituicao() {
        return tipoInstituicao;
    }

    public void setTipoInstituicao(TipoInstituicao tipoInstituicao) {
        this.tipoInstituicao = tipoInstituicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
