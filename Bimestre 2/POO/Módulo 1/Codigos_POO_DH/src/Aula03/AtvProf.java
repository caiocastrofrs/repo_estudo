package Aula03;

import java.util.Scanner;

public class AtvProf {

    public static int quantosPacotes(float quant, Scanner entrada) {

        float kilo = 0.0f;
        int cont = 0;
        while(kilo< quant){
            System.out.println("Digite o peso do pacote da ração: ");
            String entradaAux = entrada.nextLine();
            float aux = Float.parseFloat(entradaAux);

            kilo+=aux;
            cont++;
        }
        return cont;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do cachorro: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a quantidade de ração: ");
        String qntdAux = scanner.nextLine();
        float qntd = Float.parseFloat(qntdAux);
        System.out.println("O " + nome + " precisa de " + quantosPacotes(qntd, scanner) + " pacotes");
    }
}
