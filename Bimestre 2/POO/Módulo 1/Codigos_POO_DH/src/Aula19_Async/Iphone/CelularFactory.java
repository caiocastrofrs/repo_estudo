package Aula19_Async.Iphone;

public class CelularFactory {
    public static Celular fazerCelular(String modelo) {
        if(modelo.equals("11")) {
            return new Iphone11();
        } else if(modelo.equals("X")){
            return new IphoneX();
        }else return null;
    }
}
