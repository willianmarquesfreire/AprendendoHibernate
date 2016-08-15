package com.mycompany.entidades;

import java.util.Date;

class Periodo {

    private Long id;
    private String descricao;
    private Date inicio;
    private Date fim;
    private GradeCurricular gradeCurricular;
    private TipoPeriodo tipoPeriodo;

    public Periodo(Long id, String descricao, Date inicio, Date fim, GradeCurricular gradeCurricular, TipoPeriodo tipoPeriodo) {
        this.id = id;
        this.descricao = descricao;
        this.inicio = inicio;
        this.fim = fim;
        this.gradeCurricular = gradeCurricular;
        this.tipoPeriodo = tipoPeriodo;
    }

    public TipoPeriodo getTipoPeriodo() {
        return tipoPeriodo;
    }

    public void setTipoPeriodo(TipoPeriodo tipoPeriodo) {
        this.tipoPeriodo = tipoPeriodo;
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

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    public GradeCurricular getGradeCurricular() {
        return gradeCurricular;
    }

    public void setGradeCurricular(GradeCurricular gradeCurricular) {
        this.gradeCurricular = gradeCurricular;
    }

}
