
import GerenciaSuperMercado.GerenciaPessoaFisica;
import GerenciaSuperMercado.GerenciaProduto;
import GerenciaSuperMercado.GerenciaVendas;
import GerenciaSuperMercado.Relatorios;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        GerenciaPessoaFisica pf = new GerenciaPessoaFisica();
        GerenciaProduto produtos = new GerenciaProduto();
        GerenciaVendas vendas = new GerenciaVendas();
        Relatorios relatorios = new Relatorios();

        int op;

        do {
            System.out.println("--------Escolha uma opção--------");
            System.out.println("1 - Cadastro de produtos");
            System.out.println("2 - Cadastro de clientes");
            System.out.println("3 - Cadastro de vendas");
            System.out.println("4 - Relatórios");
            System.out.println("5 - Fechar Sistema");

            op = scan.nextInt();

            switch (op) {
                case 1:
                    produtos.escolherOpcoes();
                    break;
                case 2:
                    pf.escolherOpcoes();
                    break;
                case 3:
                    vendas.escolherOpcoes(produtos, pf);
                    break;
                case 4:
                    relatorios.escolherOpcoes(produtos, pf, vendas);
                    break;
            }

        } while (op != 5);

    }
}
