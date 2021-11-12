package Facade__Turismo_Professor;

public class CheckFacade {
    // Armazenar a instância de cada API na memória
    private VooApi vooApi;
    private HotelApi hotelApi;
    // Construtor que cria as intâncias
    public CheckFacade() {
        this.vooApi = new VooApi();
        this.hotelApi = new HotelApi();
    }
    // Centralizar as buscas de voos e hotéis
    public void buscar(String dataPartida, String dataRetorno, String origem, String destino) {
        vooApi.buscarVoos(dataPartida, dataRetorno, origem, destino);
        hotelApi.buscarHoteis(dataPartida, dataRetorno, destino);
    }
}
