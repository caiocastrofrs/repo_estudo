package br.com.dh.odontologia.test;


import br.com.dh.odontologia.dao.impl.DentistaDaoH2;
import br.com.dh.odontologia.model.Dentista;
import br.com.dh.odontologia.service.DentistaService;
import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DentistaTest {
    Dentista dentista1,dentista2,dentista3,dentista4,dentista5;
    DentistaService dentistaService = new DentistaService(new DentistaDaoH2());
    @BeforeEach
    void doBefore() {
        dentista1 = new Dentista("123456","Caio","Castro");
        dentista2 = new Dentista("234567","Icaro","Castro");
        dentista3 = new Dentista("345678","Adso","Castro");
        dentista4 = new Dentista("456789","Diego","Castro");
        dentista5 = new Dentista("567890","Jefferson","Castro");
    }
    @Test
    public void salvarDentista() {
        Assert.isNonEmpty(dentistaService.salvar(dentista1));
        Assert.isNonEmpty(dentistaService.salvar(dentista2));
        Assert.isNonEmpty(dentistaService.salvar(dentista3));
        Assert.isNonEmpty(dentistaService.salvar(dentista4));
        Assert.isNonEmpty(dentistaService.salvar(dentista5));
    }

    @Test
    public void listarDentistas() {
        Assert.isNonEmpty(dentistaService.listarTodos());
    }
}
