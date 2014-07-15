package GerenciaSuperMercado;

import Model.PessoaFisica;
import Model.PessoaJuridica;
import Model.Produto;
import Model.Venda;
import com.oracle.jrockit.jfr.Producer;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciaVendas {

    private Scanner input = new Scanner(System.in);
    public static ArrayList<Venda> vendas = new ArrayList<Venda>();
    public static GerenciaProduto produtos = new GerenciaProduto();
    public static GerenciaPessoaFisica clientes = new GerenciaPessoaFisica();
    public static GerenciaPessoaJuridica empresa = new GerenciaPessoaJuridica();
    int posicao = 0;
    private int codVenda = 0;

    public void escolherOpcoes(GerenciaProduto prod) {

        this.produtos = prod;
        //this.clientes = pf;
        int opSubMenu;
        do {
            System.out.println("\nGereciamento de Vendas");
            System.out.println("1 - Cadastrar uma venda");
            System.out.println("2 - Pesquisar uma venda");
            System.out.println("3 - Listar vendas");
            System.out.println("4 - Cancelar venda");
            System.out.println("5 - Sair");
            opSubMenu = input.nextInt();
            input.skip("\n");

            switch (opSubMenu) {
                case 1: {
                    cadastrarVenda();
                    break;
                }

                case 2: {
                    pesquisarVenda();
                    break;
                }

                case 3: {
                    listarVendas();
                    break;
                }
                case 4: {
                    deletarVenda();
                    break;
                }

                default: {
                    System.out.println("Sair: Gerencia Vendas!");
                }
            }
        } while (opSubMenu != 5);
    }

    public void cadastrarVenda(){
        int opcao;           
       
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
                    cadastrarVendaPessoaFisica();
                    break;
                    
                case 2:
                    cadastrarVendaPessoaJuridica();
                    break;
                    
                default: {
                    System.out.println("Sair: Tipo Cliente!");
                }       
            }
        }while(opcao != 3);
    }
    
    public void cadastrarVendaPessoaFisica() {
        System.out.println("Informe CPF do Cliente: ");

        PessoaFisica pf = clientes.retornaPessoaFisica(input.next());
        if (pf == null) {
            System.out.println("Cliente não encontrado!\n");
        } else {
            System.out.println("Informe o Codigo do Produto: ");
            Produto prod = produtos.retornaProduto(input.nextInt());
            if (prod == null) {
                System.out.println("Produto não encontrado!\n");
            } else {
                System.out.println("Informe a quantidade do produto: ");
                int quantidade = input.nextInt();
                if (quantidade > prod.getEstoque()) {
                    System.out.println("Quantidade insuficiente em estoque");
                } else {
                    Venda venda = new Venda();
                    venda.setCliente(pf);
                    venda.setProduto(prod);
                    venda.setQtdeProduto(quantidade);
                    venda.setValorTotal(quantidade * prod.getPreco());
                    venda.setCodVenda(++codVenda);

                    vendas.add(posicao, venda);
                    System.out.println("Venda registrada com sucesso! Codigo da venda:" + (codVenda));
                }

            }
        }
    }
    
    public void cadastrarVendaPessoaJuridica() {
        System.out.println("Informe CNPJ da Empresa: ");

        PessoaJuridica pj = empresa.retornaPessoaJuridica(input.next());
        if (pj == null) {
            System.out.println("Empresa não encontrada!\n");
        } else {
            System.out.println("Informe o Codigo do Produto: ");
            Produto prod = produtos.retornaProduto(input.nextInt());
            if (prod == null) {
                System.out.println("Produto não encontrado!\n");
            } else {
                System.out.println("Informe a quantidade do produto: ");
                int quantidade = input.nextInt();
                if (quantidade > prod.getEstoque()) {
                    System.out.println("Quantidade insuficiente em estoque");
                } else {
                    Venda venda = new Venda();
                    venda.setCliente(pj);
                    venda.setProduto(prod);
                    venda.setQtdeProduto(quantidade);
                    venda.setValorTotal(quantidade * prod.getPreco());
                    venda.setCodVenda(++codVenda);

                    vendas.add(posicao, venda);
                    System.out.println("Venda registrada com sucesso! Codigo da venda:" + (codVenda));
                }
            }
        }
    }

    public void pesquisarVenda() {

        System.out.println("Informe o codigo da venda:");
        int codPesquisa = input.nextInt();

        for (int i = 0; i < vendas.size(); i++) {
            if (vendas.get(i) != null) {
                if (codPesquisa == vendas.get(i).getCodVenda()) {
                    System.out.println("Detalhes da venda:\n");
                    System.out.println("Cliente: " + vendas.get(i).getCliente().getNome());
                    System.out.println("Produto: " + vendas.get(i).getProduto().getNome() + " - Descrição: " + vendas.get(i).getProduto().getDescricao());
                    System.out.println("Quantidade vendida: " + vendas.get(i).getQtdeProduto());
                    System.out.println("Valor da venda: " + vendas.get(i).getValorTotal());
                }
            }
        }

    }

    public void listarVendas() {
        for (int i = 0; i < vendas.size(); i++) {
            if (vendas.get(i) != null) {
                System.out.println("Detalhes da venda " + (vendas.get(i).getCodVenda()) + " :\n");
                System.out.println("Cliente: " + vendas.get(i).getCliente().getNome());
                System.out.println("Produto: " + vendas.get(i).getProduto().getNome() + " - Descrição: " + vendas.get(i).getProduto().getDescricao());
                System.out.println("Quantidade vendida: " + vendas.get(i).getQtdeProduto());
                System.out.println("Valor da venda: " + vendas.get(i).getValorTotal());
            }
        }
    }

    public void deletarVenda() {

        System.out.println("Informe o codigo da venda:");
        int codDeleta = input.nextInt();

        for (int i = 0; i < vendas.size(); i++) {
            if (vendas.get(i) != null) {
                if (codDeleta == vendas.get(i).getCodVenda()) {
                    vendas.remove(i);
                    System.out.println("Venda cancelada com sucesso...");
                }
            }
        }
    }
}
