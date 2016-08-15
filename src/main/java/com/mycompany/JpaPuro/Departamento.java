package com.mycompany.JpaPuro;

import javax.persistence.MappedSuperclass;

/**
 * @author wmfsystem
 */
@MappedSuperclass
public abstract class Departamento {
    
    private String nome;
    
    public abstract void calcularDepesasDoMes();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
