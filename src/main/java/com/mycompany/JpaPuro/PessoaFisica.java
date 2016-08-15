package com.mycompany.JpaPuro;

import java.util.List;
import java.util.Set;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import org.hibernate.annotations.DiscriminatorOptions;

/**
 * @author wmfsystem
 */
@Entity
@DiscriminatorValue("PessoaFisica")
public class PessoaFisica extends Pessoa {

    private String CPF;

    public PessoaFisica() {
    }

    public PessoaFisica(String CPF, String nome, Endereco enderecoPessoal, Endereco enderecoTrabalho, PapelUsuario papelUsuario, List<PerfiDoUsuario> perfis, Set<String> emails, List<Telefone> telefones, List<Trabalho> trabalhos) {
        super(nome, enderecoPessoal, enderecoTrabalho, papelUsuario, perfis, emails, telefones, trabalhos);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}
