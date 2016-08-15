/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.JpaPuro;

import com.mycompany.JpaPuro.Pessoa;
import com.mycompany.JpaPuro.PessoaDAO;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author wmfsystem
 */
public class JpaSpyke {

    public static void main(String[] args) {
        
        ConnectionFilter cf = new ConnectionFilter();
        
        
        EntityManager entityManager = JpaUtil.getEntityManager();

        try {
            entityManager.getTransaction().begin();
            PessoaDAO p = new PessoaDAO();
            p.editarNome(Long.valueOf(3), "wmf");
            
            entityManager.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("0000000000000000      + " + e);
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
        } finally {
            if (entityManager.isOpen()) {
                JpaUtil.closeEntityManagerFactory();
            }
        }

    }

}
