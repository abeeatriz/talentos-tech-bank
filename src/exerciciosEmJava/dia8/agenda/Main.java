package exerciciosEmJava.dia8.agenda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useDelimiter("\n");

       Agenda agenda = new Agenda();

        System.out.println("**********AGENDA**********");

        Boolean programaEmExecucao = true;

        while (programaEmExecucao) {

            System.out.println("Selecione uma das opções");
            System.out.println("(1) - Adicionar novo contato");
            System.out.println("(2) - Remover contato");
            System.out.println("(3) - Buscar contato pelo nome");
            System.out.println("(4) - Mostrar todos os contatos");
            System.out.println("(0) - Fechar agenda");

            Short opcao = in.nextShort();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do contato");
                    String nome = in.next();

                    System.out.println("Digite o ano de nascimento");
                    Integer ano = in.nextInt();

                    System.out.println("Digite a altura");
                    Double altura = in.nextDouble();

                    System.out.println("Digite o número de celular");
                    String numeroDeCelular = in.next();

                    System.out.println("-----------------------");
                    agenda.armazenaPessoa(nome, ano, altura, numeroDeCelular);
                    System.out.println("-----------------------");
                    break;
                case 2:
                    System.out.println("Digite o nome do contato para remover");
                    String nomeParaRemover = in.next();

                    System.out.println("Digite o celular da pessoa pra remover");
                    String numeroDeCelularParaRemover = in.next();
                    agenda.removePessoa(nomeParaRemover, numeroDeCelularParaRemover);
                    break;
                case 3:
                    System.out.println("Digite o nome do contato para buscar");
                    String nomeParaBuscar = in.next();


                    System.out.println("-----------------------");
                    agenda.listaBuscaDePessoasPeloNome(nomeParaBuscar);
                    System.out.println("-----------------------");


                    break;
                case 4:
                    System.out.println("-----------------------");
                    agenda.imprimeAgenda();
                    System.out.println("-----------------------");

                    break;

                case 0:
                    programaEmExecucao = false;
                    break;
            }


        }

        in.close();

    }

}