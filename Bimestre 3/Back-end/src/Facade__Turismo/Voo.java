package Facade__Turismo;

public class Voo {
    private String origem = "Brasil";
    private String dataPartida;
    private String dataRetorno;
    private String destino;

    public Voo() {}

    public void setDataPartida(String dataPartida) {
        this.dataPartida = dataPartida;
    }

    public void setDataRetorno(String dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Voo para " + destino + "\nPartida: " + dataPartida + "\nRetorno: " + dataRetorno;
    }
}
