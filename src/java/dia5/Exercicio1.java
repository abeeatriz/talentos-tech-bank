package java.dia5;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        exercicio1();          // Calcula o exponencial a partir da base e da potencia
    }

    public static void exercicio1() {

        Scanner entrada = new Scanner(System.in);

        int base;
        int expoente;
        int saida = 1;

        System.out.println("Insira o valor da base");
        base = entrada.nextInt();

        System.out.println("A que expoente deseja que essa base seja elevada?");
        expoente = entrada.nextInt();

        for (int i = 1; i <= expoente; i++) {
            saida *= base;
        }

       System.out.println(base+" elevado a "+expoente+" é igual a " + saida +".");

        entrada.close();


    }


}