package Turismo;

public class Hotel {
    private String nomeHotel = "Hotel Budapeste";
    private String cidadeHotel = "Budapeste";
    private double valorHotel = 1500.50;
    private int qntdEstrelasHotel = 10;

    public Hotel() {}

    public String getCidadeHotel() {
        return cidadeHotel;
    }

    @Override
    public String toString() {
        return "Hotel em " + cidadeHotel + "\nNome: " + nomeHotel +
                "\nValor diário: " + valorHotel +
                "\nHotel " + qntdEstrelasHotel + " estrelas";

    }
}
