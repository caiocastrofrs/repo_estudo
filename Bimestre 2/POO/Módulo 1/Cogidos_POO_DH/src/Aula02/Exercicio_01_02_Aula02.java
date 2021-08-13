package Aula02;
import java.util.Scanner;

public class Exercicio_01_02_Aula02 {
    //GRUPO 2
    public static boolean ePrimo(int number) {
        for(int i = 2; i <= number/2; i++) {
            if(number%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int maximo(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            return number1;
        }else if (number2 > number1 && number2 > number3) {
            return number2;
        }else {
            return number3;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Verifique se um número é primo!");
        System.out.println("Digite um número:");
        int number = scanner.nextInt();
        if(ePrimo(number)) {
            System.out.println("é primo!");
        }else {
            System.out.println("Não é primo!");
        }
        System.out.println("Digite três números e iremos dizer qual é o maior!");
        System.out.println("Número 1:");
        int n1 = scanner.nextInt();
        System.out.println("Número 2:");
        int n2 = scanner.nextInt();
        System.out.println("Número 3:");
        int n3 = scanner.nextInt();
        System.out.println(maximo(n1,n2,n3));
    }
}
