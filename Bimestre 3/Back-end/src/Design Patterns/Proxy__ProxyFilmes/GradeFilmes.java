package Proxy__ProxyFilmes;

public class GradeFilmes implements IGradeFilmes{

    @Override
    public Filme getFilme(String nomeFilme) throws FilmeNaoHabilitadoException {
        Filme filme = null;
        switch (nomeFilme) {
            case "Homem Aranha":
                filme = new Filme("Homem Aranha","brasil","www.homemaranha.com.br");
                break;
            case "Colombiano em busca de vingança":
                filme = new Filme("Colombiano em busca de vingança","colombia","www.colombiano.com.co");
                break;
            case "De volta para o futuro":
                filme = new Filme("De volta para o futuro","argentina","www.futuro.com.ar");
                break;
            case "Matrix":
                filme = new Filme("Matrix","brasil","www.matrix.com.br");
                break;
            case "Boneco Assassino":
                filme = new Filme("Boneco Assassino","colombia","www.boneco.com.co");
        }
        return filme;
    }

}
