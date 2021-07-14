package desafioBanco;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean loop = true;
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        Conta conta;
        boolean encontrada = true;
        String senhaAdmin = "321";


        while (loop != false) {

            System.out.println("___________ MENU ___________");
            System.out.println("1- Cadastrar Cliente");
            System.out.println("2- Exibir Minha Conta");
            System.out.println("3- Depositar");
            System.out.println("4- Sacar");
            System.out.println("5- Crédito Disponível");
            System.out.println("6- Alterar Senha");
            System.out.println("7- Transferência");
            System.out.println("8- Extrato");
            System.out.println("0- Sair");
            System.out.println("____________________________");
            System.out.println();
            System.out.print("Opção: ");
            int opc = in.nextInt();

            switch (opc) {

                case 1:
                    conta = new Conta();
                    conta.armazenaConta();

                    break;

                case 2:

                    System.out.print("Digite o número da sua conta: ");
                    int numeroConta = in.nextInt();

                    conta = new Conta();
                    conta.exibirMinhaConta(numeroConta);

                    break;

                case 3:

                    System.out.print("Digite o número da conta para quem deseja depositar: ");
                    numeroConta = in.nextInt();

                    System.out.print("Digite quanto deseja depositar: ");
                    int valor = in.nextInt();

                    for (Conta a : Conta.contas) {

                        if (a.getNumeroConta() == numeroConta) {
                            a.depositar(valor, numeroConta);
                        }


                    }

                    break;

                case 4:

                    System.out.print("Digite o número da conta para quem deseja Sacar: ");
                    numeroConta = in.nextInt();

                    System.out.print("Digite o valor que deseja sacar: ");
                    valor = in.nextInt();

                    for (Conta a : Conta.contas) {

                        if (a.getNumeroConta() == numeroConta) {
                            a.sacar(valor, numeroConta);
                        }

                    }

                    break;

                case 5:

                    System.out.print("Digite o numero da conta que deseja saber o credito disponível: ");
                    numeroConta = in.nextInt();

                    for (Conta a : Conta.contas) {

                        if (a.getNumeroConta() == numeroConta) {

                            a.creditoDisponivel(a.getNumeroConta());

                        }

                    }


                    break;

                case 6:

                    conta = new Conta();

                    System.out.print("Digite o número da conta que deseja alterar a senha: ");
                    numeroConta = in.nextInt();

                    System.out.print("Digite sua senha atual: ");
                    String senhaAtual = in.next();

                    System.out.print("Digite sua nova senha: ");
                    String novaSenha = in.next();

                    conta.alterarSenha(numeroConta, senhaAtual, novaSenha);


                    break;

                case 7:

                    conta = new Conta();

                    System.out.print("Digite o número da sua  conta: ");
                    numeroConta = in.nextInt();

                    System.out.print("Digite o número da conta para qual deseja transferir: ");
                    int contaRecebedora = in.nextInt();

                    System.out.print("Digite o valor que deseja transferir: ");
                    valor = in.nextInt();

                    conta.transferencia(valor, numeroConta, contaRecebedora);

                    break;

                case 8:

                    conta = new Conta();

                    System.out.print("Digite o número da sua  conta: ");
                    numeroConta = in.nextInt();

                    System.out.print("Por favor digite sua senha: ");
                    String senha = in.next();

                    for (Conta a : Conta.contas) {

                        if (a.getSenha().equals(senha)) {

                        //    System.out.print()
                          //  excecao = true;
                        }

                    }



                    break;

                case 9:

                    System.out.print("Por favor digite a senha de administrador: ");
                    senha = in.next();

                    if (senha.equals(senhaAdmin)) {

                        for (Conta c : Conta.contas) {

                            System.out.println();
                            System.out.println(c.toString());
                            System.out.println("____________________________________________________________________________");

                        }

                    } else {

                        System.out.println("Senha de administrador incorreta");

                    }
                    break;

                case 0:
                    loop = false;
                    break;

                default:
                    System.out.println("Por favor Digite uma opção valida");
                    break;
            }


        }

    }

}