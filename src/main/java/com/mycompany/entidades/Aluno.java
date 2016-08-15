package com.mycompany.entidades;

public class Aluno extends PessoaFisica{
    
    private String registroAcademico;
    private Turma turma;

    public Aluno(String registroAcademico, Turma turma) {
        this.registroAcademico = registroAcademico;
        this.turma = turma;
    }

    public String getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(String registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
