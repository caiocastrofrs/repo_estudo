import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Cachorro> cachorros = new ArrayList<>();

        Cachorro dog1 = new Cachorro();
        dog1.setNome("Hamster");
        dog1.setIdade(5);
        Cachorro dog2 = new Cachorro();
        dog1.setNome("Pato");
        dog1.setIdade(3);
        Cachorro dog3 = new Cachorro();
        dog1.setNome("Avestruz");
        dog1.setIdade(4);

        cachorros.add(dog1);
        cachorros.add(dog2);
        cachorros.add(dog3);

        FileOutputStream fo = null;
        try {
            fo = new FileOutputStream("OutputFile.txt");
            ObjectOutputStream dos = new ObjectOutputStream(fo);
            dos.writeObject(cachorros);
        } catch(FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch(Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        List<Cachorro> cachorros2 = null;
        FileInputStream fi = null;
        try {
            fi = new FileInputStream("OutputFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            cachorros2 = (ArrayList) ois.readObject();
        } catch(FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch(Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
