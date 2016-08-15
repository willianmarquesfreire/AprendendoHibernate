package com.mycompany.entidades;

public class Turma {

    private Long id;
    private String nome;
    private GradeCurricular gradeCurricular;

    public Turma(Long id, String nome, GradeCurricular gradeCurricular) {
        this.id = id;
        this.nome = nome;
        this.gradeCurricular = gradeCurricular;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public GradeCurricular getGradeCurricular() {
        return gradeCurricular;
    }

    public void setGradeCurricular(GradeCurricular gradeCurricular) {
        this.gradeCurricular = gradeCurricular;
    }

}
