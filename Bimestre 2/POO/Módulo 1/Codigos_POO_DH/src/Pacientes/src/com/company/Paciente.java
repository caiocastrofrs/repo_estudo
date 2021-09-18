package com.company;

import java.util.Date;

public class Paciente {
    String nome;
    String sobrenome;
    String historiaClinica;
    Date dataInternacao;
    Date dataAlta;


    Paciente(String nome, String sobrenome, String historiaClinica, Date dataInternacao) throws PacientesException {
        Date hoje= new Date();
        this.nome=nome;
        this.sobrenome=sobrenome;
        dataAlta=null;
        if (dataInternacao.after(hoje)){
            throw new PacientesException("Data de internação inválida!");
        } else
            this.dataInternacao=dataInternacao;
    }
    public Date getDataInternacao() {
        return dataInternacao;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void darAlta(Date dataAlta) throws PacientesException
    {
        if (dataAlta.before(dataInternacao))
            throw new PacientesException("Data de alta inválida!");
        else
            System.out.println("Ok");
    }
    


}
