package Flyweight__MusicFactory;

public class Principal {
    public static void main(String[] args) {
        ListaDeReproducao playlist = new ListaDeReproducao();

        Musica musica01 = playlist.getMusica("Epitaph for My Heart");
        musica01.setArtista("The Magnetic Fields");
        musica01.setGenero("Indie pop");

        Musica musica02 = playlist.getMusica("Musta Katu");
        musica02.setArtista("Paavorhaju");
        musica02.setGenero("Folk Psicodélico");

        Musica musica03 = playlist.getMusica("1539 N. Calvert");
        musica03.setArtista("JPEGMAFIA");
        musica03.setGenero("Rap");

        Musica musica04 = playlist.getMusica("The Maid We Messed");
        musica04.setArtista("Matt Elliott");
        musica04.setGenero("Folk Contemporâneo");

        //playlist.removerMusica(musica01.getNome());

        playlist.getPlaylist();
        playlist.getMusica(musica01.getNome());
        playlist.getMusica(musica02.getNome());
        playlist.getMusica(musica03.getNome());
        playlist.getMusica(musica04.getNome());

    }
}
