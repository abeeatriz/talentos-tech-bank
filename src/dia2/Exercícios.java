package dia2;

import java.util.Scanner;

public class Exercícios {

    public static void main(String[] args) {
        exercicio1();              //par ou impar
        exercicio2();              //Categorias de natação por idade
         exercicio3a();           //Qual dos valores é menor
        exercicio3b();         //Qual dos valores é menor
      //   exercicio4();
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
    }

    public static void exercicio2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual a idade do nadador?");
        int idade = in.nextInt();
        if (idade >=5 && idade <=7)
        System.out.println("Infantil A");
        else if (idade >=8 && idade <=11)
        System.out.println("Infantil B");
        else if (idade >=12 && idade <=13)
        System.out.println("Juvenil A");
        else if (idade >=14 && idade <=17)
        System.out.println("Juvenil B");
        else System.out.println("Idade não permitida.");

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
    }

    public static void exercicio3b() {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira primeiro valor");
        int primeiro = in.nextInt();
        System.out.println("Insira segundo valor");
        int segundo = in.nextInt();
        if (primeiro<segundo)
            System.out.println("O segundo valor inserido("+segundo+") é maior que o primeiro valor inserido("+primeiro+").");
        else if (primeiro>segundo)
            System.out.println("O primeiro valor inserido("+primeiro+") é maior que o segundo valor inserido("+segundo+").");
        else System.out.println("Os valores são iguais.");

    }

        public static void exercicio4() {
            Scanner in = new Scanner(System.in);
            System.out.println("Digite 1 para somar, 2 para subtrair, 3 para multiplicar e 4 para dividir");
            int operação = in.nextInt();
            if( operação = 1)
             //   sout



        }




}