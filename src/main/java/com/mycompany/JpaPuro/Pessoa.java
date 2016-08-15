package com.mycompany.JpaPuro;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 * @author wmfsystem
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "pessoa_type")
public abstract class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    private String nome;

    @Embedded
    private Endereco enderecoPessoal;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(
                name = "rua",
                column = @Column(name = "end_trabalho")
        ),
        @AttributeOverride(
                name = "bairro",
                column = @Column(name = "end_bairro_trabalho")
        ),
        @AttributeOverride(
                name = "numero",
                column = @Column(name = "end_numero_trabalho")
        )
    })
    private Endereco enderecoTrabalho;

    @Enumerated(EnumType.STRING)
    private PapelUsuario papelUsuario;

    @ElementCollection(targetClass = PerfiDoUsuario.class)
    @Enumerated(EnumType.STRING)
    private List<PerfiDoUsuario> perfis;

    @ElementCollection
    @CollectionTable(name = "pessoa_emails")
    private Set<String> emails;

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<Telefone> telefones;

    @ManyToMany
    private List<Trabalho> trabalhos;

    public Pessoa() {
    }

    public Pessoa(String nome, Endereco enderecoPessoal, Endereco enderecoTrabalho, PapelUsuario papelUsuario, List<PerfiDoUsuario> perfis, Set<String> emails, List<Telefone> telefones, List<Trabalho> trabalhos) {
        this.nome = nome;
        this.enderecoPessoal = enderecoPessoal;
        this.enderecoTrabalho = enderecoTrabalho;
        this.papelUsuario = papelUsuario;
        this.perfis = perfis;
        this.emails = emails;
        this.telefones = telefones;
        this.trabalhos = trabalhos;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEnderecoPessoal() {
        return enderecoPessoal;
    }

    public void setEnderecoPessoal(Endereco enderecoPessoal) {
        this.enderecoPessoal = enderecoPessoal;
    }

    public Endereco getEnderecoTrabalho() {
        return enderecoTrabalho;
    }

    public void setEnderecoTrabalho(Endereco enderecoTrabalho) {
        this.enderecoTrabalho = enderecoTrabalho;
    }

    public PapelUsuario getPapelUsuario() {
        return papelUsuario;
    }

    public void setPapelUsuario(PapelUsuario papelUsuario) {
        this.papelUsuario = papelUsuario;
    }

    public List<PerfiDoUsuario> getPerfis() {
        return perfis;
    }

    public void setPerfis(List<PerfiDoUsuario> perfis) {
        this.perfis = perfis;
    }

    public Set<String> getEmails() {
        return emails;
    }

    public void setEmails(Set<String> emails) {
        this.emails = emails;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public List<Trabalho> getTrabalhos() {
        return trabalhos;
    }

    public void setTrabalhos(List<Trabalho> trabalhos) {
        this.trabalhos = trabalhos;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "ID=" + ID + ", nome=" + nome + ", enderecoPessoal=" + enderecoPessoal + ", enderecoTrabalho=" + enderecoTrabalho + ", papelUsuario=" + papelUsuario + ", perfis=" + perfis + ", emails=" + emails + ", telefones=" + telefones + ", trabalhos=" + trabalhos + '}';
    }
    
    

}
