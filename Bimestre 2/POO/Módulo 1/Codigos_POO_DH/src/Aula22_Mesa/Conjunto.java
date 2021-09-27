package Aula22_Mesa;

import java.util.ArrayList;

public class Conjunto implements Trem{

    ArrayList<Trem> conjuntos;

    public Conjunto() {
        this.conjuntos = new ArrayList<>();
    }

    @Override
    public double calcularArea() {
        double areaTotal = 0;
        for (Trem t : this.conjuntos) {
            areaTotal += t.calcularArea();
        }
            return areaTotal;
    }

    public void addConjunto(Trem t) {
        this.conjuntos.add(t);
    }
}
