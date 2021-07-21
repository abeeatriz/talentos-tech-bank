package exerciciosEmJava.dia8.modificadoresDeAcesso;

public class Venda {

    private double valorDaVenda;

    protected double valorDaVendaParaFilhos;

    public double getValorDaVenda() {
        return this.valorDaVenda;
    }

}