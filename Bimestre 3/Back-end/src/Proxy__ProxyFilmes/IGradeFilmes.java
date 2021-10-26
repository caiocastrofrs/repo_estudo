package Proxy__ProxyFilmes;

public interface IGradeFilmes {

        Filme getFilme(String nomeFilme) throws FilmeNaoHabilitadoException;
}
