package com.mycompany.entidades;

class Professor extends PessoaFisica {

    private String titulo;

    public Professor(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
