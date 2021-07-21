package exerciciosEmJava.dia8.modificadoresDeAcesso;

public class VendaDireta extends Venda {

    VendaDireta() {
        System.out.println(this.getValorDaVenda());
        this.valorDaVendaParaFilhos = 100;
    }
}