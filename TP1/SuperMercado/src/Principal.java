
import GerenciaSuperMercado.GerenciaPessoaFisica;
import GerenciaSuperMercado.GerenciaPessoaJuridica;
import GerenciaSuperMercado.GerenciaProduto;
import GerenciaSuperMercado.GerenciaVendas;
import GerenciaSuperMercado.Relatorios;
import java.util.Scanner;

public class Principal {
    
    public static void escolherCliente(){
        Scanner input = new Scanner(System.in);
        int opcao;
        GerenciaPessoaFisica pf = new GerenciaPessoaFisica();
        GerenciaPessoaJuridica pj = new GerenciaPessoaJuridica();
       
        do{
            System.out.println("\nSelecione o tipo de Cliente");
            System.out.println("1 - Pessoa Fisica");
            System.out.println("2 - Pessoa Juridica");
            System.out.println("3 - Sair");
            System.out.println("\n\nDigite a opcao desejada:");
            opcao = input.nextInt();
            input.skip("\n");
        
            switch(opcao){
                case 1:
                    pf.escolherOpcoes();
                    break;
                    
                case 2:
                    pj.escolherOpcoes();
                    break;
                    
                default: {
                    System.out.println("Sair: Tipo Cliente!");
                }       
            }
        }while(opcao != 3);
    }

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
            System.out.println("2 - Gerenciar Clientes");
            System.out.println("3 - Cadastro de vendas");
            System.out.println("4 - Relatórios");
            System.out.println("5 - Fechar Sistema");

            op = scan.nextInt();

            switch (op) {
                case 1:
                    produtos.escolherOpcoes();
                    break;
                case 2:
                    escolherCliente();
                    break;
                case 3:
                    vendas.escolherOpcoes(produtos);
                    break;
                case 4:
                    relatorios.escolherOpcoes(produtos, pf, vendas);
                    break;
            }

        } while (op != 5);

    }
}
