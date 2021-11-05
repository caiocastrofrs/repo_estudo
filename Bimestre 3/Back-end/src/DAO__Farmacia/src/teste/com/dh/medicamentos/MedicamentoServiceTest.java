package teste.com.dh.medicamentos;

import com.dh.medicamentos.dao.ConfigJDBC;
import com.dh.medicamentos.dao.impl.MedicamentoDaoH2;
import com.dh.medicamentos.model.Medicamento;
import com.dh.medicamentos.service.MedicamentoService;
import org.junit.Test;
public class MedicamentoServiceTest {

    private MedicamentoService medService = new MedicamentoService(new MedicamentoDaoH2(new ConfigJDBC()));
    @Test
    public void guardarMedicamento() {
        Medicamento medicamento = new Medicamento("Ibuprofeno","Lab 3",1000,200.0);
        medService.salvar(medicamento);
    }
}
