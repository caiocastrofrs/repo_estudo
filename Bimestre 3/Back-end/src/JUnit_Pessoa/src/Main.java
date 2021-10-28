import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import java.time.LocalDate;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        Pessoa pessoa = new Pessoa("Caio","Castro");
        pessoa.setIdade(LocalDate.of(1999,3,12));
        pessoa.setEmail("caiocastrofrs@gmail.com");

        Pessoa pessoa2 = new Pessoa("Icaro","Castro");
        pessoa2.setIdade(LocalDate.of(2000,11,25));
        pessoa2.setEmail("icarocastro@gmail.com");

        try {
            pessoa.checarMaioridade();
        } catch (Exception e) {
            logger.error("incorreto", e);
        }

        try {
            pessoa2.getNomeLength();
        } catch (Exception e) {
            logger.error("incorreto", e);
        }

    }
}
