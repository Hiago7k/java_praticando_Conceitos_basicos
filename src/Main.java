import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    static void main(String[] args) {
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
        /*
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
        */

        /*
           Crie um menu que oferece duas opções ao usuário:
           "1. Calcular área do quadrado" e "
           2. Calcular área do círculo".
           Solicite a escolha do usuário e realize o cálculo da área com
           base na opção selecionada.
         */


        Scanner teclado = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("-- Quadrado X Circuclo --");
        System.out.println(" Digite uma opção abaixo: ");
        System.out.println("1. Calcular área do quadrado | 2. Calcular área do círculo: ");
        int opcao = teclado.nextInt();
        System.out.println("=============================");

        switch (opcao){
            case 1:
                System.out.println("Calculando areá do quadrado");
                System.out.println("Digite a base do quadrado: ");
                float baseQuadrado = teclado.nextFloat();
                System.out.println("Digite a altura do quadrado: ");
                float alturaQuadrado = teclado.nextFloat();
                float base = baseQuadrado * alturaQuadrado;
                System.out.println("A área do seu quadrado é " + base);

                break;
            case 2:
                System.out.println("Calculando areá do círculo");
                System.out.println("Digite o diametro do seu circulo: ");
                float diamentroCirculo = teclado.nextFloat();
                float raio = diamentroCirculo / 2;
                double pi = 3.14;
                double area = pi * Math.pow(raio, 2);
                System.out.println("A area do ciruclo é " + area);
                break;
            default:
                System.out.println("Por gentileza digite uma opção valida! 1 ou 2");
                break;
        }

    }
}