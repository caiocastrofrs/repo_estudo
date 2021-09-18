package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws PacientesException {

//        try {
//            Paciente paciente=new Paciente("Juan","Perez","12345",new Date(2021,9,13));
//        } catch(PacientesException e)
//        {
//            e.printStackTrace();
//            System.out.println(e.toString());
//        }
        try {
            Paciente paciente=new Paciente("Juan","Perez","12345",new Date(2021,9,17));
            paciente.darAlta(new Date(2021,9,12));
        } catch (PacientesException e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}
