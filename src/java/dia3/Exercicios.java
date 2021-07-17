package java.dia3;

import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
//        exercicio1();              //Par ou impar
//        exercicio2();              //Categorias de natação por idade
//        exercicio3a();             //Qual dos valores é menor
//        exercicio3b();             //Qual dos valores é maior
//        exercicio4();              //Maior, menor e média de um conjunto de 10 valores
//        exercicio5();              //Operações aritméticas entre valores previamente inseridos
        exercicio6();              //Jokempô

    }

    public static void exercicio1() {
        Scanner in = new Scanner(System.in);

        System.out.println("Cite um número:");
        int x = in.nextInt();
        int y = x % 2;
        if (y == 0)
            System.out.println("par");
        else
            System.out.println("impar");
        in.close();
    }

    public static void exercicio2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual a idade do nadador?");
        int idade = in.nextInt();
        if (idade >= 5 && idade <= 7)
            System.out.println("Infantil A");
        else if (idade >= 8 && idade <= 11)
            System.out.println("Infantil B");
        else if (idade >= 12 && idade <= 13)
            System.out.println("Juvenil A");
        else if (idade >= 14 && idade <= 17)
            System.out.println("Juvenil B");
        else System.out.println("Idade não permitida.");
        in.close();
    }

    public static void exercicio3a() {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira primeiro valor");
        int primeiro = in.nextInt();
        System.out.println("Insira segundo valor");
        int segundo = in.nextInt();
        if (primeiro < segundo)
            System.out.println("O primeiro valor inserido(" + primeiro + ") é menor que o segundo valor inserido(" + segundo + ").");
        else if (primeiro > segundo)
            System.out.println("O segundo valor inserido(" + segundo + ") é menor que o primeiro valor inserido(" + primeiro + ").");
        else System.out.println("Os valores são iguais.");
        in.close();
    }

    public static void exercicio3b() {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira primeiro valor");
        int primeiro = in.nextInt();
        System.out.println("Insira segundo valor");
        int segundo = in.nextInt();
        if (primeiro < segundo)
            System.out.println("O segundo valor inserido(" + segundo + ") é maior que o primeiro valor inserido(" + primeiro + ").");
        else if (primeiro > segundo)
            System.out.println("O primeiro valor inserido(" + primeiro + ") é maior que o segundo valor inserido(" + segundo + ").");
        else System.out.println("Os valores são iguais.");
        in.close();
    }


    public static void exercicio4() {
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

    public static void exercicio5() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int x = in.nextInt();
        System.out.println("Digite o segundo número");
        int y = in.nextInt();
        System.out.println("Digite 1 para somar, 2 para subtrair, 3 para multiplicar ou 4 para dividir");
        int operação = in.nextInt();
        if (operação == 1) {
            System.out.println("A soma dos valores é " + (x + y));
        } else if (operação == 2) {
            System.out.println("A subtração do primeiro valor pelo segundo é " + (x - y));
        } else if (operação == 3) {
            System.out.println("O produto dos valores é " + (x * y));
        } else if (operação == 4) {
            System.out.println("A divisão do primeiro valor pelo segundo resulta em " + (x / y));
        } else {
            System.out.println("Valor inválido");
        }   //validação da entrada de dados
        in.close();
    }

    public static void exercicio6() {
        Scanner in = new Scanner(System.in);
        System.out.println("Primeiro jogador digite 1 para pedra,2 para papel e 3 para tesoura");
        int ppt1 = in.nextInt();
        System.out.println("Segundo jogador digite 1 para pedra,2 para papel e 3 para tesoura");
        int ppt2 = in.nextInt();
        if (ppt1 == ppt2) {
            System.out.println("Empate");
        } else if ((ppt1 == 1 && ppt2 == 3) || (ppt1 == 2 && ppt2 == 1) || (ppt1 == 3 && ppt2 == 2)) {
            System.out.println("O primeiro a jogar venceu!");
        } else if ((ppt1 == 1 && ppt2 == 2) || (ppt1 == 2 && ppt2 == 3) || (ppt1 == 3 && ppt2 == 1)) {
            System.out.println("O segundo a jogar venceu!");
        } else {
            System.out.println("Jogada invalida");
        }
        in.close();

    }
}



