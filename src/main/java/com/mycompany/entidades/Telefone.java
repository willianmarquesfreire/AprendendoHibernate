package com.mycompany.entidades;

class Telefone {

    private Long id;
    private String ddd;
    private String numero;
    private Boolean mensagem;
    private Pessoa pessoa;
    private TipoTelefone tipoTelefone;

    public Telefone(Long id, String ddd, String numero, Boolean mensagem, Pessoa pessoa, TipoTelefone tipoTelefone) {
        this.id = id;
        this.ddd = ddd;
        this.numero = numero;
        this.mensagem = mensagem;
        this.pessoa = pessoa;
        this.tipoTelefone = tipoTelefone;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public TipoTelefone getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(TipoTelefone tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Boolean getMensagem() {
        return mensagem;
    }

    public void setMensagem(Boolean mensagem) {
        this.mensagem = mensagem;
    }

}
