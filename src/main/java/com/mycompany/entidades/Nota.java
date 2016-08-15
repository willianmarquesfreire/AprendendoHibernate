package com.mycompany.entidades;

import java.math.BigDecimal;

public class Nota {

    private Long id;
    private BigDecimal valor;
    private AlunoPeriodoDisciplina alunoPeriodoDisciplina;
    private Avaliacao avaliacao;

    public Nota(Long id, BigDecimal valor, AlunoPeriodoDisciplina alunoPeriodoDisciplina, Avaliacao avaliacao) {
        this.id = id;
        this.valor = valor;
        this.alunoPeriodoDisciplina = alunoPeriodoDisciplina;
        this.avaliacao = avaliacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public AlunoPeriodoDisciplina getAlunoPeriodoDisciplina() {
        return alunoPeriodoDisciplina;
    }

    public void setAlunoPeriodoDisciplina(AlunoPeriodoDisciplina alunoPeriodoDisciplina) {
        this.alunoPeriodoDisciplina = alunoPeriodoDisciplina;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

}
