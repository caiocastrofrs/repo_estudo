package Chain__QualidadeProduto;

public class Main {
    public static void main(String[] args) {
        CheckQuality check = new CheckQuality();
        check.verificar(new Artigo(1100,1250,"saudavel"));
        check.verificar(new Artigo(1100,1200,"quase saudavel"));
        check.verificar(new Artigo(3000,1200,"nada saudavel"));
    }
}
