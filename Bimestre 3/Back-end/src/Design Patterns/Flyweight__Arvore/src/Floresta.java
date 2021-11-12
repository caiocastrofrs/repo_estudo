package Flyweight__Arvore.src;

import java.util.HashMap;
import java.util.Objects;

public class Floresta {

    private static final HashMap<Integer, Arvore> ARVORE_MAP = new HashMap<>();

    public Arvore plantarArvore(int id,String tipo) {
        ArvoreFactory ArvFac = new ArvoreFactory();
        Arvore arvore = ARVORE_MAP.get(id);
        if(Objects.isNull(arvore)){
            arvore = (Arvore) ArvFac.criarArvore(tipo);
            ARVORE_MAP.put(id,arvore);
            System.out.println("Árvore plantada");
            return arvore;
        }
        System.out.println("Árvore com id " + id + " já existente");
        return arvore;
    }

    public void getFloresta() {
        for(Integer key : ARVORE_MAP.keySet()) {
            System.out.println(key);
        }
    }
}
