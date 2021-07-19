package exerciciosEmJava.dia2;

import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
         exercicio1();                  //Troca de valores entre variaveis
//         exercicio2();                //Armazenar número e retornar seu antecessor
//         exercicio3();                //Área do retangulo
//         exercicio4();                //Calculos de dados de eleição
    }

    public static void exercicio1() {
        short y = 99, z = 11, x;
        System.out.println("Antes da troca o valor armazenado em y é " + y + " e o valor armazenado em z é " + z + ".");
        x = z;        z = y;        y = x;
        System.out.println("Depois da troca o valor armazenado em y passa a ser " + y + " e o valor armazenado em z passa a ser " + z + ".\n");
    }

    public static void exercicio2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor para receber o antecessor dele");
        int valor = in.nextInt();
        System.out.println("O antecessor de " + valor + " é " + --valor + ".\n");
        in.close();
    }

    public static void exercicio3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual a base do retângulo?");
        double base = in.nextDouble();
        System.out.println("Qual a altura do retângulo?");
        double altura = in.nextDouble();
        double area = base * altura;
        System.out.println("A área desse retângulo corresponde a " + area+" metros quadrados.\n");
        in.close();
    }

    public static void exercicio4() {
        Scanner in = new Scanner(System.in);
        if(!in.hasNextInt()){
            System.out.println("Valor inválido");
            System.exit(1);
                    }   //validação da entrada de dados
        System.out.println("Qual foi o total de votos brancos");
        int votosBrancos = in.nextInt();
        System.out.println("Qual foi o total de votos nulos");
        int votosNulos = in.nextInt();
        System.out.println("Qual foi o total de votos válidos");
        int votosValidos = in.nextInt();

        int totalDeVotos = votosBrancos + votosValidos + votosNulos;

        System.out.println(
                "O total de votos foi: " + totalDeVotos+". \n"
                +votosBrancos+" dos votos foram brancos, "
                + votosNulos +" nulos e "
                + votosValidos+" válidos.");

        double percentualVotosBrancos = votosBrancos * 100 / totalDeVotos,
               percentualVotosNulos = votosNulos * 100 / totalDeVotos,
               percentualVotosValidos= votosValidos * 100 / totalDeVotos;

        System.out.println("----\n"+
                "O percentual total de votos brancos foi de " + percentualVotosBrancos + "%.\n"+
                "O percentual total de votos nulos foi de " + percentualVotosNulos + "%. \n"+
                "O percentual total de votos válidos foi de " + percentualVotosValidos + "%. ");

        in.close();
    }

}