package Turismo_Professor;

public class HotelApi {
    // Procurar os hoteis de acordo com uma cidade pre definida
    public void buscarHoteis(String dataEntrada, String dataSaida, String cidade) {
        System.out.println("===================================");
        System.out.println("Hoteis encontrados: " + cidade);
        System.out.println("Entrada: " + dataEntrada + "\nSaida: " + dataSaida);
    }
}
