public class ArvoreFactory {
    private static ArvoreFactory instance;

    ArvoreFactory(){}

    public static ArvoreFactory getInstance(){
        if (instance == null)
            instance = new ArvoreFactory();
        return instance;
    }

    public Object criarArvore(String tipo) {
        if(tipo == "Ornamental") {
            return new Ornamental(200,400,"Verde");
        }else if(tipo == "Frutifera") {
            return new Frutifera(500,300,"Vermelho");
        }else if(tipo == "Florifera") {
            return new Florifera(100,200,"Azul");
        }
        return "Tipo de árvore não existente!";
    }
}
