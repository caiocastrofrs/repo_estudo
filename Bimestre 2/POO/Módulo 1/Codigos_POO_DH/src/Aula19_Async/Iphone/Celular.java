package Aula19_Async.Iphone;

public abstract class Celular {
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void ligar() {
        System.out.println(getModelo() + " está ligado!");
    }
}
