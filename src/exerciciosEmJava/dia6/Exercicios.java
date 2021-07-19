package exerciciosEmJava.dia6;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args){
        exercicio1();       //imprima 20 números de trás para frente
        sortGrupo4();       //ordenador de números - atividade em grupo
        sortString();       //ordenador de palavras por ordem alfabética
    }

    public static void exercicio1() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] arrayInverso = new int[20];
        for (int i = 0; i < array.length; i++) {
            arrayInverso[i] = array[array.length - (i + 1)];
        }
        System.out.println(Arrays.toString(arrayInverso));
        System.out.println();

    }

    public static void sortGrupo4() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite quantos números deseja ordenar: ");
        int tamanho = entrada.nextInt();
        int vetor[] = new int[tamanho];
        int aux;
        int a = 0;
        while (a < vetor.length) {
            System.out.print("Digite o " + (a + 1) + "º número: ");
            vetor[a] = entrada.nextInt();
            a++;
        }
        for (int i = 1; i < vetor.length; i++) {
            for (int j = 0; j < i; j++) {
                if (vetor[i] < vetor[j]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        System.out.println("\n Números ordenados: ");
        for (int k = 0; k < vetor.length; k++) {
            System.out.printf("%d ", vetor[k]);
        }
        System.out.println();
        entrada.close();
    }

    public static void sortString() {
        String[] palavras = {"azul", "rosa", "vermelho", "amarelo", "verde"};

        Arrays.sort(palavras);

        System.out.println(Arrays.toString(palavras));
    }

}