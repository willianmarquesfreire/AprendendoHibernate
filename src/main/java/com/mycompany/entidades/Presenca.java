package com.mycompany.entidades;

public class Presenca {

    private Long id;
    private Boolean confirmada;
    private AlunoPeriodoDisciplina alunoPeriodoDisciplina;
    private Dia dia;

    public Presenca(Long id, Boolean confirmada, AlunoPeriodoDisciplina alunoPeriodoDisciplina, Dia dia) {
        this.id = id;
        this.confirmada = confirmada;
        this.alunoPeriodoDisciplina = alunoPeriodoDisciplina;
        this.dia = dia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getConfirmada() {
        return confirmada;
    }

    public void setConfirmada(Boolean confirmada) {
        this.confirmada = confirmada;
    }

    public AlunoPeriodoDisciplina getAlunoPeriodoDisciplina() {
        return alunoPeriodoDisciplina;
    }

    public void setAlunoPeriodoDisciplina(AlunoPeriodoDisciplina alunoPeriodoDisciplina) {
        this.alunoPeriodoDisciplina = alunoPeriodoDisciplina;
    }

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }

}
