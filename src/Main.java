import java.util.Scanner;

class Main {
    static void main() {
        // 1
        /* Crie um programa que solicite ao usuário digitar um número.
        Se o número for positivo, exiba "Número positivo", caso contrário,
        exiba "Número negativo".
        */

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();

        if(numero > 0){
            System.out.println("Número positivo " + numero);
        }else {
            System.out.println("Número negativo " + numero);
        }
    }
}