package desafioBanco;

import netscape.security.UserTarget;

import java.util.*;

public class Conta extends Cliente {

    private int numeroConta;
    private int contaRecebedora;
    private String tipoConta;
    private double saldo = 0;
    private double credito = 500;
    private String senha;


    static HashSet<Conta> contas = new HashSet<>();
    Conta conta;
    Scanner in = new Scanner(System.in).useDelimiter("\n");
    Random random = new Random();

    //METODOS SETTERS
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    //METODOS GETTERS
    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;

    }


    public String getSenha(){
        return senha;
    }

    public double getSaldo(){
        return saldo;
    }

    @Override
    public String toString() {

        return "Conta " +
                "NOME = " + nome +
                ", CPF = " + cpf +
                ", NUMERO DA CONTA = " + numeroConta +
                ", TIPO DA CONTA = " + tipoConta +
                ", SALDO CONTA = " + saldo + "\n";
    }

    public void armazenaConta(int tipoConta) {


        conta = new Conta();

        switch (tipoConta) {

            case 1:
                conta.tipoConta = "Corrente";
                break;

            case 2:
                conta.tipoConta = "Poupança";
                break;

            default:
                System.out.println("Por favor digite uma opção valida !!!");
                break;

        }

        conta.numeroConta = random.nextInt(9999);

        System.out.print("Digite o nome do cliente: ");
        String nome = in.next();
        conta.nome = nome;

        System.out.print("Digite o CPF do Cliente: ");
        String cpf = in.next();
        conta.cpf = cpf;

        System.out.print("Digite uma senha: ");
        String senha = in.next();

        System.out.print("Por favor confirme a senha: ");
        String confirmaSenha = in.next();

        if (!senha.equals(confirmaSenha)) {
            System.out.println("As senhas não conferem, por favor tente outra vez");
        } else {
            conta.senha = senha;
            contas.add(conta);
            System.out.println("Cliente Cadastrado com sucesso!!!");
            System.out.print(conta.toString());
        }


    }

    public void depositar(int valor, int numeroConta) {

        if (valor > 0) {

            for (Conta c : Conta.contas) {

                if (c.getNumeroConta() == numeroConta) {

                    System.out.println("Você deseja depositar R$" + valor + " para " + c.nome + " ? S/N");
                    char escolha = in.next().charAt(0);

                    if (escolha == 's' || escolha == 'S') {

                        c.setSaldo(this.saldo + valor);

                    } else {

                        System.out.println("Operação Cancelada Com Sucesso !!");

                    }


                }

            }

        }


    }

    public void transferencia(double valor, int numeroConta, int contaRecebedora){
        boolean excecao = false;

        for(Conta a: Conta.contas){

            if(a.getNumeroConta() == numeroConta) {

                System.out.print("Por Favor Digite sua Senha: ");
                String senha = in.next();

                if (a.senha.equals(senha)){

                    if (valor < (a.getSaldo() + a.credito)) {

                        for (Conta b : Conta.contas) {

                            if (b.getNumeroConta() == contaRecebedora) {

                                a.setSaldo(a.saldo - valor);
                                b.setSaldo(b.saldo + valor);
                                System.out.println("Transferecia Concluida");
                                excecao = true;
                            }

                        }

                    }
                }

            }
        }

        if(excecao == false){

            System.out.println("Operação cancelada, verifique suas informações");

        }

    }

    public void exibirMinhaConta(int numeroConta){
        boolean excecao = false;

        System.out.print("Por favor digite sua senha: ");
        String senha = in.next();

        for (Conta a : Conta.contas) {

            if (a.getSenha().equals(senha)) {

                System.out.println(a.toString());
                excecao = true;
            }

        }


        if(excecao == false){

            System.out.println("Operação cancelada, verifique suas informações");

        }



    }

    public void sacar(double valor, int numeroConta){
        boolean excecao = false;
        for(Conta b: Conta.contas){

            if(b.getNumeroConta() == numeroConta){

                System.out.print("Por Favor Digite sua Senha: ");
                String senha = in.next();

                if(b.senha.equals(senha)){

                    if(valor < (b.getSaldo() + b.credito)){

                        b.saldo = b.saldo - valor;

                        if(b.saldo < 0 && b.saldo > -500){

                            b.credito = b.credito - Math.abs(b.saldo);
                            b.saldo = 0;
                            excecao = true;
                            System.out.println("Saque concluido com sucesso");
                        }

                    }

                }

            }

        }

        if(excecao == false){

            System.out.println("Operação cancelada, verifique suas informações");

        }

    }

    public void creditoDisponivel(int numeroConta){

        for(Conta a: Conta.contas){

            if(a.getNumeroConta() == numeroConta){

                System.out.print("Por favor digite sua senha: ");
                String s = in.next();

                if(a.senha.equals(s)){

                    System.out.println("Credito Disponivel: " + a.credito);

                }else{

                    System.out.println("Senha Incorreta !!");

                }
            }

        }

    }

    public void alterarSenha(int numeroConta, String senhaAtual, String novaSenha){

        boolean excecao = false;

        for(Conta a: Conta.contas){

            if(a.getNumeroConta() == numeroConta) {

                if(a.getSenha().equals(senhaAtual)){

                    System.out.print("Por favor confirme sua nova senha: ");
                    String confirmaSenha = in.next();

                    if (novaSenha.equals(confirmaSenha)) {

                        a.setSenha(confirmaSenha);
                        excecao = true;
                        System.out.println("Senha alterada com sucesso !!!");

                    }

                }
            }

        }

        if(excecao == false){

            System.out.println("Operação cancelada, verifique suas informações");

        }


    }

}
