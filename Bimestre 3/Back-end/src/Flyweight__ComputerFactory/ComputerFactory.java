package Flyweight__ComputerFactory;

import java.util.HashMap;

public class ComputerFactory {

    private static final HashMap<String, Computer> MAP_FLYWEIGHT = new HashMap<>();

    public Computer getComputer(int ram, int disco) {
        String id = "id: " + ram + ":" + disco;
        System.out.println(id);

        if(!MAP_FLYWEIGHT.containsKey(id)) {
            MAP_FLYWEIGHT.put(id, new Computer(ram, disco));
            System.out.println("PC criado!");
            return MAP_FLYWEIGHT.get(id);
        }
        System.out.println("PC obtido");
        return MAP_FLYWEIGHT.get(id);
    }
    public void getComputerList() {
        for(String key : MAP_FLYWEIGHT.keySet()) {
            System.out.println(key);
        }
    }

}
