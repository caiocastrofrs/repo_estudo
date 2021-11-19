package br.com.dh.odontologia.test;

import br.com.dh.odontologia.dao.impl.EnderecoDaoH2;
import br.com.dh.odontologia.dao.impl.PacienteDaoH2;
import br.com.dh.odontologia.model.Endereco;
import br.com.dh.odontologia.model.Paciente;
import br.com.dh.odontologia.service.PacienteService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

class PacienteServiceTest {

    PacienteService pacienteService = new PacienteService(new PacienteDaoH2(new EnderecoDaoH2()));
    Paciente paciente1, paciente2, paciente3, paciente4, paciente5;
    Endereco endereco1, endereco2, endereco3, endereco4, endereco5;
    @BeforeEach
    void setUp() {
        endereco1 = new Endereco("rua 1","1","Bairro 1", "Cidade 1");
        paciente1 = new Paciente("Caio","Castro","123456",new Date(2021,11,19),endereco1);
        endereco2 = new Endereco("rua 2","2","Bairro 2", "Cidade 2");
        paciente2 = new Paciente("Icaro","Castro","234567",new Date(2021,11,19),endereco1);
        endereco3 = new Endereco("rua 3","3","Bairro 3", "Cidade 3");
        paciente3 = new Paciente("Adso","Castro","345678",new Date(2021,11,19),endereco1);
        endereco4 = new Endereco("rua 4","4","Bairro 4", "Cidade 4");
        paciente4 = new Paciente("Diego","Castro","456789",new Date(2021,11,19),endereco1);
        endereco5 = new Endereco("rua 5","5","Bairro 5", "Cidade 5");
        paciente5 = new Paciente("Jefferson","Castro","567890",new Date(2021,11,19),endereco1);
    }

    @Test
    void salvar() {
        Assertions.assertNotNull(pacienteService.salvar(paciente1));
        Assertions.assertNotNull(pacienteService.salvar(paciente2));
        Assertions.assertNotNull(pacienteService.salvar(paciente3));
        Assertions.assertNotNull(pacienteService.salvar(paciente4));
        Assertions.assertNotNull(pacienteService.salvar(paciente5));
    }

    @Test
    void buscar() {
        Assertions.assertNotNull(pacienteService.buscar(paciente1.getId()));
        Assertions.assertNotNull(pacienteService.buscar(paciente2.getId()));
        Assertions.assertNotNull(pacienteService.buscar(paciente3.getId()));
        Assertions.assertNotNull(pacienteService.buscar(paciente4.getId()));
    }

    @Test
    void buscarTodos() {
        Assertions.assertNotNull(pacienteService.buscarTodos());
    }

    @Test
    void excluir() {
        pacienteService.excluir(paciente5.getId());
        Assertions.assertNull(pacienteService.buscar(paciente5.getId()));
    }
}