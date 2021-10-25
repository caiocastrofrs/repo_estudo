package Turismo;

public class Turismo implements ITurismo{
    private Voo voo;
    private Hotel hotel;

    public Turismo() {
        this.voo = new Voo();
        this.hotel = new Hotel();
    }

    public void buscarViagem(String cidadeHotel, String dataPartida, String dataRetorno) {
        if(hotel.getCidadeHotel().equals(cidadeHotel)) {
            voo.setDataPartida(dataPartida);
            voo.setDataRetorno(dataRetorno);
            voo.setDestino(cidadeHotel);
            System.out.println("-----Viagem recomendada-----\n" + voo.toString() + "\n" + hotel.toString());
        } else {
            System.out.println("Viagens para a cidade " + cidadeHotel + " não encontrada");
        }

    }
}
