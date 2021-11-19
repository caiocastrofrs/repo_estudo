package br.com.dh.odontologia.test;

import br.com.dh.odontologia.dao.impl.DentistaDaoH2;
import br.com.dh.odontologia.model.Dentista;
import br.com.dh.odontologia.service.DentistaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DentistaServiceTest {
    Dentista dentista1,dentista2,dentista3,dentista4,dentista5;
    DentistaService dentistaService = new DentistaService(new DentistaDaoH2());

    @BeforeEach
    void setUp() {
        dentista1 = new Dentista("123456","Caio","Castro");
        dentista2 = new Dentista("234567","Icaro","Castro");
        dentista3 = new Dentista("345678","Adso","Castro");
        dentista4 = new Dentista("456789","Diego","Castro");
        dentista5 = new Dentista("567890","Jefferson","Castro");
    }

    @Test
    void salvar() {
        Assertions.assertNotNull(dentistaService.salvar(dentista1));
        Assertions.assertNotNull(dentistaService.salvar(dentista2));
        Assertions.assertNotNull(dentistaService.salvar(dentista3));
        Assertions.assertNotNull(dentistaService.salvar(dentista4));
        Assertions.assertNotNull(dentistaService.salvar(dentista5));
    }

    @Test
    void buscar() {
        Assertions.assertNotNull(dentistaService.buscar(dentista1.getId()));
        Assertions.assertNotNull(dentistaService.buscar(dentista2.getId()));
        Assertions.assertNotNull(dentistaService.buscar(dentista3.getId()));
        Assertions.assertNotNull(dentistaService.buscar(dentista4.getId()));
    }

    @Test
    void excluir() {
        dentistaService.excluir(dentista5.getId());
        Assertions.assertNull(dentistaService.buscar(dentista5.getId()));
    }

    @Test
    void listarTodos() {
        Assertions.assertNotNull(dentistaService.listarTodos());
    }
}