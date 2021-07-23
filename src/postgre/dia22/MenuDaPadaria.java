package postgre.dia22;

import postgre.dia22.Dao.ItemVendaDao;
import postgre.dia22.Dao.ProdutoDao;
import postgre.dia22.Dao.VendaDao;
import postgre.dia22.models.ItemVenda;
import postgre.dia22.models.Produto;
import postgre.dia22.models.Venda;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class MenuDaPadaria {


    public static void main(String[] args) throws SQLException {

        DatabaseConnection databaseConnection = new DatabaseConnection();

        Connection conn = databaseConnection.getConnection();


        ProdutoDao produtoDao = new ProdutoDao(conn);
        VendaDao vendaDao = new VendaDao(conn);
        ItemVendaDao itemVendaDao = new ItemVendaDao(conn);


        boolean loop = true;
        Scanner in = new Scanner(System.in).useDelimiter("\n");

        while (loop == true) {

            System.out.println("***************************");
            System.out.println("**Padaria Quinta Pá Sexta**");
            System.out.println("**************************");
            System.out.println("1 - Cadastrar novo produto");
            System.out.println("2 - Inicializar nova venda");
            System.out.println("0 - Finalizar");


            System.out.println("____________________________");
            System.out.println();
            System.out.print("Opção: ");
            int opc = in.nextInt();

            switch (opc) {

                case 1:

                    System.out.print("Insira a descrição do novo produto:");
                    String descricao = in.next();

                    System.out.println("Insira o peso unitario do novo produto:");
                    BigDecimal peso_unitario = BigDecimal.valueOf(in.nextDouble());

                    System.out.println("Insira a unidade medida peso do novo produto:");
                    String unidade_medida_peso = in.next();

                    System.out.println("Insira o codigo de barras do novo produto:");
                    String codigo_barras = in.next();

                    System.out.print("Insira o valor de custo do novo produto:");
                    BigDecimal valor_custo = BigDecimal.valueOf(in.nextDouble());

                    System.out.println("Insira o valor de venda do novo produto:");
                    BigDecimal valor_venda = BigDecimal.valueOf(in.nextDouble());



                    // Cadastrei um novo produto
                    Produto p = new Produto(descricao,
                            valor_custo,
                            peso_unitario,
                            unidade_medida_peso,
                            codigo_barras,
                            valor_venda
                    );
                    p.cadastrarNovoProduto(produtoDao);
                    break;

                case 2:

                    // Inicializei uma nova venda
                    Venda v = Venda.inicializarVenda(vendaDao);

                    int finalizar_compra = 0;

                    do {
                        System.out.println("Insira o código de barras ou a descrição do produto: ");
                        codigo_barras = in.next();

                        System.out.println("Insira a quantidade de produtos: ");
                        int quantidade_de_produto = Integer.parseInt(in.next());

                        // Busquei um produto por código de barras
                        List<Produto> resultadoBuscaProdutos = Produto.buscarProdutos(produtoDao, codigo_barras);
                        Produto produtoEncontrado = resultadoBuscaProdutos.get(0);

                        // Criei um novo item venda
                        ItemVenda item = new ItemVenda();
                        item.setProduto(produtoEncontrado);
                        item.setQuantidade(BigDecimal.valueOf(quantidade_de_produto));

                        v.adicionarItemNaVenda(itemVendaDao, item);

                        System.out.println("Finalizar  compra? S/N ");
                        char escolha = in.next().charAt(0);
                        if (escolha == 's' || escolha == 'S') {
                            finalizar_compra++;
                        }
                    }
                    while (finalizar_compra == 0);


                    v.concluirVenda(vendaDao);


                    break;


                case 0:
                    loop = false;
                    break;

                default:
                    System.out.println("Por favor, digite uma opção válida!\n");
                    break;
            }


        }

    }
}

