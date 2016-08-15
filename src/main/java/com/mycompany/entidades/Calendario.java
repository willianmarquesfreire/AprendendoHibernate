package com.mycompany.entidades;

public class Calendario {
    
    private Long id;
    private Integer ano;

    public Calendario(Long id, Integer ano) {
        this.id = id;
        this.ano = ano;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}
