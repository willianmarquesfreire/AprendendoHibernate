package com.mycompany.entidades;

public class AlunoPeriodoDisciplina {

    private Long id;
    private Aluno aluno;
    private PeriodoDisciplina periodoDisciplina;

    public AlunoPeriodoDisciplina(Long id, Aluno aluno, PeriodoDisciplina periodoDisciplina) {
        this.id = id;
        this.aluno = aluno;
        this.periodoDisciplina = periodoDisciplina;
    }

    public PeriodoDisciplina getPeriodoDisciplina() {
        return periodoDisciplina;
    }

    public void setPeriodoDisciplina(PeriodoDisciplina periodoDisciplina) {
        this.periodoDisciplina = periodoDisciplina;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

}
