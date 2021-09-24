package Aula19_Async.Refri;

public class RefrigeranteFactory {
    public static Refrigerante fazerRefrigerante(String tipo) {
//        Refrigerante refri = null;
        if (tipo.equals("K")){
            return new RefriCola();
        } else if (tipo.equals("P")){
            return new RefriLaranja();
        }else return null;
    }

}
