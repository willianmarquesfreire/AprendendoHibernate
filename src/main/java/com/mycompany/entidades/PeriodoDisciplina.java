package com.mycompany.entidades;

class PeriodoDisciplina {

    private Long id;
    private Integer cargaHoraria;
    private Periodo periodo;
    private Disciplina disciplina;
    private Professor professor;

    public PeriodoDisciplina(Long id, Integer cargaHoraria, Periodo periodo, Disciplina disciplina, Professor professor) {
        this.id = id;
        this.cargaHoraria = cargaHoraria;
        this.periodo = periodo;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

}
