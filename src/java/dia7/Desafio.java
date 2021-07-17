package java.dia7;

public class Desafio {
    // encontre o valor mais próximo de zero em um array de valores inteiros negativos e positivos
    // *critério de desempate: valor positivo

    public static void main(String[] args) {

        int[] vetor =  {2, -3, 5, -7, 11, -13, 17, -19, 23, -23, 19, -17, 13, -11, 7, -5, 3, -2};

        int indiceDoMenorValor = 0;

        for (int i = 0; i < vetor.length; i++) {
            boolean oValorEMaisPertoDeZero = Math.abs(vetor[i]) < Math.abs(vetor[indiceDoMenorValor]);
            boolean oValorEMaisPertoDeZeroEPositivo = Math.abs(vetor[i])
                    == Math.abs(vetor[indiceDoMenorValor]) && vetor[i] > vetor[indiceDoMenorValor];

            //critério de desempate
            if (oValorEMaisPertoDeZero || oValorEMaisPertoDeZeroEPositivo) {
                indiceDoMenorValor = i;
            }
        }
        System.out.printf("O valor mais próximo de zero é : %d", vetor[indiceDoMenorValor]);
    }
}