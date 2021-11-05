package BD_h2__ExercicioPratica;

public class Funcionario {
    private int id;
    private String nome;
    private int idade;
    private String empresa;
    private String data;

    public Funcionario( int id, String nome, int idade, String empresa, String data) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.empresa = empresa;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
