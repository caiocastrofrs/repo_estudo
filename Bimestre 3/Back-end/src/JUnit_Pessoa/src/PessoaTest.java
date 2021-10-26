import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

   Pessoa pessoa0;
   Pessoa pessoa1;
   Pessoa pessoa2;

   @BeforeEach
    void doBefore() {
       pessoa0 = new Pessoa("Caio","Castro");
       pessoa0.setIdade(LocalDate.of(1999,10,12));

       pessoa1 = new Pessoa("Icaro","Castro");
       pessoa1.setIdade(LocalDate.of(2000,11,25));

       pessoa2 = new Pessoa("Adso", "Castro");
       pessoa2.setIdade(LocalDate.of(1989,8,21));

   }
    @Test
    public void getQntdNome() {
        assertEquals("Castro, Caio",pessoa0.getNomeLength());
        assertEquals("Castro, Icaro",pessoa1.getNomeLength());
        assertEquals("Castro, Adso",pessoa2.getNomeLength());
        System.out.println("getQntdNome PASS!");
    }
    @Test
    public void getMaiorDeIdade() {
        assertTrue(pessoa0.checarMaioridade());
        assertTrue(pessoa1.checarMaioridade());
        assertTrue(pessoa2.checarMaioridade());
        System.out.println("getMaiorDeIdade PASS!");
    }

}