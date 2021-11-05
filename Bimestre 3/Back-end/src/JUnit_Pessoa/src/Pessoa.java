package JUnit_Pessoa.src;
import java.time.LocalDate;
import org.apache.log4j.Logger;
public class Pessoa {

    private static final Logger logger = Logger.getLogger(Pessoa.class);

    private String nome;
    private String sobrenome;
    private LocalDate idade;
    private String email;

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeLength() {
        logger.info("método getNomeLength usado, nome e sobrenome retornado");
        //Número de caracteres do nome
//        return this.nome.length();
        return sobrenome + ", " + nome;
    }

    public boolean checarMaioridade() {
        logger.info("Maioridade checada");
        //O ano de hoje
        int aux = LocalDate.now().getYear();
        //O ano de nascimento da pessoa
        int res = aux - this.idade.getYear();
        //Validação da maioridade
        if(res > 18) {
            logger.info("Idade maior que 18");
            return true;
        }
        logger.info("Idade menor que 18");
        return false;
    }

//    public static void main(String[] args) {
//        Pessoa pessoa = new Pessoa("caio","castro");
//        pessoa.setIdade(LocalDate.of(1999,10,12));
//        System.out.println(pessoa.getNomeLength());
//    }
}
