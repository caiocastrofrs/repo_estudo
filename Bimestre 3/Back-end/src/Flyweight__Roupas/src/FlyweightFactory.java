import java.util.HashMap;

public class FlyweightFactory {
    public static final HashMap<String, Roupa> ROUPA_MAP = new HashMap<>();

    public static Roupa obterRoupa(String tipo) {
        Roupa roupa = ROUPA_MAP.get(tipo);
        if(roupa == null) {
            roupa = new Roupa(tipo);
            ROUPA_MAP.put(tipo, roupa);
            System.out.println("Roupa criada");
            return roupa;
        }
        System.out.println("Roupa já existente!");
        return roupa;
    }
}
