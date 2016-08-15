package com.mycompany.JpaPuro;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author wmfsystem
 */
@Entity
public class RecursosHumanos extends Departamento{

    @Id
    private Long ID;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    @Override
    public void calcularDepesasDoMes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
