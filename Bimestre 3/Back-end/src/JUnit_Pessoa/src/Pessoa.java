import java.time.LocalDate;

public class Pessoa {

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
        //Número de caracteres do nome
//        return this.nome.length();
        return sobrenome + ", " + nome;
    }

    public boolean checarMaioridade() {
        //O ano de hoje
        int aux = LocalDate.now().getYear();
        //O ano de nascimento da pessoa
        int res = aux - this.idade.getYear();
        //Validação da maioridade
        if(res > 18) {
            return true;
        }
        return false;
    }

//    public static void main(String[] args) {
//        Pessoa pessoa = new Pessoa("caio","castro");
//        pessoa.setIdade(LocalDate.of(1999,10,12));
//        System.out.println(pessoa.getNomeLength());
//    }
}
