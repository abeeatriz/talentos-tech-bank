package java.dia7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Forca {
    // simule um jogo da forca simples em que se pode errar até 10 vezes

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in).useDelimiter("\n");

        System.out.println
                ("Jogador 1, escolha uma palavra");
        String palavraParaSerAdivinhadaInput = in.next();

        System.out.println
                ("Jogador 1, dê uma dica sobre essa palavra");
        String dicaDaPalavraParaSerAdivinhada = in.next();

        palavraParaSerAdivinhadaInput = palavraParaSerAdivinhadaInput.trim();

        int maximoDeChutes = 11;

        char[] palavraParaSerAdivinhada = palavraParaSerAdivinhadaInput.toCharArray();


        List<Boolean> listaDeLetrasAcertadas = new ArrayList<>(Collections.nCopies(
                palavraParaSerAdivinhada.length, false)
        );


        System.out.println
                ("Agora é a vez do jogador 2...");
        System.out.printf
                ("A dica é %s\n", dicaDaPalavraParaSerAdivinhada);

        while (maximoDeChutes > 0 && listaDeLetrasAcertadas.contains(false)) {
            System.out.println
                    ("Jogador 2, escolha uma letra");
            char chute = in.next().charAt(0);

            boolean errouOhChute = true;
            for (int i = 0; i < palavraParaSerAdivinhada.length; i++) {
                if (chute == palavraParaSerAdivinhada[i]) {
                    listaDeLetrasAcertadas.set(i, true);
                    errouOhChute = false;
                }
            }

            if (errouOhChute) {
                maximoDeChutes--;
                if (maximoDeChutes > 2) {
                    System.out.printf
                            ("A palavra não contém essa letra,\nmas você ainda pode errar mais %s vezes.\n", maximoDeChutes - 1);
                } else if (maximoDeChutes == 2) {
                    System.out.print
                            ("A palavra não contém essa letra,\npara conseguir vencer você só pode errar mais uma vez.\n");
                } else if (maximoDeChutes == 1) {
                    System.out.print
                            ("A palavra não contém essa letra,\npara conseguir vencer você não pode errar mais nenhuma vez.\n");
                }
            }

            for (int i = 0; i < palavraParaSerAdivinhada.length; i++) {
                if (listaDeLetrasAcertadas.get(i)) {
                    System.out.printf("%s ", palavraParaSerAdivinhada[i]);
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();

        }

        System.out.println("------------------------------");
        if (!listaDeLetrasAcertadas.contains(false)) {
            System.out.println
                    ("A palavra foi descoberta!");
            System.out.println
                    ("O jogador 2 venceu o jogo");
        } else {
            System.out.println
                    ("A palavra não foi descoberta!");
            System.out.println
                    ("O jogador 1 venceu o jogo");
        }

        in.close();
    }
}