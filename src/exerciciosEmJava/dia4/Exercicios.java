package exerciciosEmJava.dia4;

import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        exercicio1();                 //Maior, menor e média de um conjunto de 10 valores
//        exercicio2();                 //Calcular o fatorial
    }

    public static void exercicio1() {
        Scanner in = new Scanner(System.in);

        int soma = 0;
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;

        for (int i = 1; i < 11; i++) {
            System.out.println("Informe o " + i + "º número.");
            int num = in.nextInt();

            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
            soma += num;
        }

        System.out.println("O maior valor digitado foi: " + maior + "\n" +
                "O menor valor digitado foi: " + menor + "\n" +
                "A média dos valores é: " + soma / 10.0);

        in.close();
    }


    public static void exercicio2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira um valor para descobrir seu fatorial");
        int x = in.nextInt();
        int fatorial = 1;

        for (int i = x; i > 1; i--) {
            fatorial = fatorial * i;
        }
        System.out.println("Seu fatorial é: " + fatorial);
        in.close();
    }

}



