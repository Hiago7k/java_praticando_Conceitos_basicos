import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    static void main() {
        // 1
        /* Crie um programa que solicite ao usuário digitar um número.
        Se o número for positivo, exiba "Número positivo", caso contrário,
        exiba "Número negativo".


        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();

        if(numero > 0){
            System.out.println("Número positivo " + numero);
        }else {
            System.out.println("Número negativo " + numero);
        }

         */

        // 2
        /*
         Peça ao usuário para inserir dois números inteiros.
         Compare os números e imprima uma mensagem indicando
         se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
         */

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro exp: 1,2,3..: ");
        int numUm = leitor.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int numDois = leitor.nextInt();


        if (numUm >= numDois){
            System.out.println("O número "+  numUm + " " + " é maior ou igual ao segundo numero que voce digitou : " + numDois );
        } else if (numUm == numDois) {

        } else {
            System.out.println("O número "+  numDois + " " + " é maior que o primeiro numero que voce digitou  "  + numUm);
        }
        
        if(numUm == numDois){
            System.out.println("Os números são iguais " + numUm + " | " + numDois);
        }else {
            System.out.println("os números são diferentes " + numUm + " | " + numDois);
        }

    }
}