package br.com.dh.odontologia;

import br.com.dh.odontologia.dao.impl.DentistaDaoH2;
import br.com.dh.odontologia.model.Dentista;
import br.com.dh.odontologia.service.DentistaService;

public class Principal {
    public static void main(String[] args) {


        Dentista dentista1,dentista2,dentista3,dentista4,dentista5;
        DentistaService dentistaService = new DentistaService(new DentistaDaoH2());

        dentista1 = new Dentista("123456","Caio","Castro");
        dentista2 = new Dentista("234567","Icaro","Castro");
        dentista3 = new Dentista("345678","Adso","Castro");
        dentista4 = new Dentista("456789","Diego","Castro");
        dentista5 = new Dentista("567890","Jefferson","Castro");

        System.out.println(dentistaService.salvar(dentista1));
        System.out.println(dentistaService.salvar(dentista2));
        System.out.println(dentistaService.salvar(dentista3));
        System.out.println(dentistaService.salvar(dentista4));
        System.out.println(dentistaService.salvar(dentista5));

        for(Dentista dentista : dentistaService.listarTodos()) {
            System.out.println(dentista.getNome());
        }

    }

}
