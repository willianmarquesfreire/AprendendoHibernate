package com.mycompany.entidades;

class Avaliacao {

    private Long id;
    private String descricao;
    private PeriodoDisciplina periodoDisciplina;
    private TipoAvaliacao tipoAvaliacao;

    public Avaliacao(Long id, String descricao, PeriodoDisciplina periodoDisciplina, TipoAvaliacao tipoAvaliacao) {
        this.id = id;
        this.descricao = descricao;
        this.periodoDisciplina = periodoDisciplina;
        this.tipoAvaliacao = tipoAvaliacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public PeriodoDisciplina getPeriodoDisciplina() {
        return periodoDisciplina;
    }

    public void setPeriodoDisciplina(PeriodoDisciplina periodoDisciplina) {
        this.periodoDisciplina = periodoDisciplina;
    }

    public TipoAvaliacao getTipoAvaliacao() {
        return tipoAvaliacao;
    }

    public void setTipoAvaliacao(TipoAvaliacao tipoAvaliacao) {
        this.tipoAvaliacao = tipoAvaliacao;
    }
}
