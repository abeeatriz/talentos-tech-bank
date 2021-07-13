package dia7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        //  insira números lidos em um arraylist e mostre
        //   todos os valores
        //   a quantidade de números negativos
        //   a quantidade de números pares
        //   o maior valor

        Scanner in = new Scanner(System.in);

        List<Integer> valores = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um valor");
            valores.add(in.nextInt());
        }
        System.out.println("Os valores são: " + valores);

        int negativos = 0;
        for (Integer numero : valores) {
            if (numero < 0) {
                negativos++;
            }
        }
        System.out.println("Quantidade de valores negativos: " + negativos);

        int pares = 0;
        for (Integer numero : valores) {
            if (numero % 2 == 0) {
                pares++;
            }
        }
        System.out.println("Quantidade de valores pares: " + pares);

        int maior = valores.get(0);
        for (Integer numero : valores) {
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("O maior valor é: "+ maior);

        in.close();
    }

}