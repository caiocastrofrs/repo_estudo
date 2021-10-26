package Flyweight__MusicFactory;

import java.util.HashMap;
import java.util.Objects;

public class ListaDeReproducao {

    private static final HashMap<String, Musica> MUSICA_MAP = new HashMap<>();

    public Musica getMusica(String nome) {
        Musica musica = MUSICA_MAP.get(nome);
        if(Objects.isNull(musica)) {
            musica = new Musica(nome);
            MUSICA_MAP.put(nome, musica);
            System.out.println("Adicionando a música "  + nome + " na lista de reprodução");
            System.out.println("Objeto " + musica.hashCode());
//            System.out.println(MUSICA_MAP);
            return musica;
        }
        System.out.println("Adicionando a música " + nome + " na lista de reprodução");
        System.out.println("Objeto já existe " + musica.hashCode());
//        System.out.println(MUSICA_MAP);
        return musica;
    }

    public void removerMusica(String nome) {
        System.out.println(nome + " removida com sucesso!");
        MUSICA_MAP.remove(nome);
        System.out.println(MUSICA_MAP);
    }

    public void getPlaylist() {
        for(String key : MUSICA_MAP.keySet()) {
            System.out.println(key);
        }
    }
}
