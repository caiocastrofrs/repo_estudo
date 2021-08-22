package NumerosPrimos;
import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número e retornaremos os primeiros n numeros.");
        int numeroUsuario = scanner.nextInt();

        for(int i = 2;i <= numeroUsuario; ++i) {
            boolean primo = true;

            for(int j = 2; j < i; ++j) {
                if(i%j == 0){
                    primo = false;
                }
            }
            if(primo) {
                System.out.println(i);
            }
        }

    }
}
