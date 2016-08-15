package com.mycompany.entidades;

import java.util.Date;

public class GradeCurricular {

    private Long id;
    private String descricao;
    private Date inicio;
    private Date fim;
    private Curso curso;

    public GradeCurricular(Long id, String descricao, Date inicio, Date fim, Curso curso) {
        this.id = id;
        this.descricao = descricao;
        this.inicio = inicio;
        this.fim = fim;
        this.curso = curso;
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

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}
