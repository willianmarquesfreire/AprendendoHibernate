package com.mycompany.entidades;

import java.util.Date;

public class Dia {

    private Long id;
    private Date referencia;
    private String descricao;
    private Calendario calendario;

    public Dia(Long id, Date referencia, String descricao, Calendario calendario) {
        this.id = id;
        this.referencia = referencia;
        this.descricao = descricao;
        this.calendario = calendario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getReferencia() {
        return referencia;
    }

    public void setReferencia(Date referencia) {
        this.referencia = referencia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Calendario getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendario calendario) {
        this.calendario = calendario;
    }

}
