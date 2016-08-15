package com.mycompany.JpaPuro;

import java.util.List;
import java.util.Set;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author wmfsystem
 */
@Entity
@DiscriminatorValue("PessoaJuridica")
public class PessoaJuridica extends Pessoa {

    public PessoaJuridica() {
    }

    private String CNPJ;

    public PessoaJuridica(String CNPJ, String nome, Endereco enderecoPessoal, Endereco enderecoTrabalho, PapelUsuario papelUsuario, List<PerfiDoUsuario> perfis, Set<String> emails, List<Telefone> telefones, List<Trabalho> trabalhos) {
        super(nome, enderecoPessoal, enderecoTrabalho, papelUsuario, perfis, emails, telefones, trabalhos);
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

}
