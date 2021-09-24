package Aula19_Async.Refri;

public abstract class Refrigerante {
    private String nome;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void abrir() {
        System.out.println("Você abriu uma lata de" + getNome());
    }
}
