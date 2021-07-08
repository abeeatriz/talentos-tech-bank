package dia5;

public class Exercicio2 {

    public static void main(String[] args) {
        exercicio2I();       // 4 linha de ****
        exercicio2II();      // triangulo justificado a esquerda
        exercicio2III();     // triangulo justificado a direita
        exercicio2IV();      // triangulo centralizado
        exercicio2V();       // triangulo de números incrementados do topo para a base
        exercicio2VI();      // triangulo de números incrementados do centro para os lados
    }


    public static void exercicio2I() {
        int i = 0;
        while (i < 4) {
            System.out.println("**********");
            i++;
        }

        System.out.println("");
    }

    public static void exercicio2II() {

        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void exercicio2III() {

        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {

            int k = linhas - i;

            while (k > 0) {
                System.out.print("  ");
                k--;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }


    public static void exercicio2IV() {
        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {

            int espacos = linhas - i;

            while (espacos > 0) {
                System.out.print("  ");
                espacos--;
            }

            int k = 0;
            while (k != 2 * i - 1) {
                System.out.print("* ");
                k++;
            }

            System.out.print("\n");
        }
    }

    public static void exercicio2V() {
        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {

            int espacos = linhas - i;

            while (espacos > 0) {
                System.out.print("  ");
                espacos--;
            }

            int k = 0;
            while (k != 2 * i - 1) {
                System.out.printf("%d ", i);
                k++;
            }

            System.out.print("\n");
        }
    }

    public static void exercicio2VI() {
        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {

            int espacos = linhas - i;

            while (espacos > 0) {
                System.out.print("  ");
                espacos--;
            }

            int k = 0;
            int l = i;
            boolean estaDecrementando = true;
            while (k != 2 * i - 1) {

                System.out.printf("%d ", l);
                k++;
                if (l > 1 && estaDecrementando) {
                    l--;
                } else {
                    estaDecrementando = false;
                    l++;
                }
            }

            System.out.print("\n");
        }
    }


}