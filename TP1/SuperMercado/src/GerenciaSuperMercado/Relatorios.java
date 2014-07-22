package GerenciaSuperMercado;

import Model.PessoaFisica;
import Model.Produto;
import java.util.ArrayList;
import java.util.Scanner;

public class Relatorios {

    private Scanner input = new Scanner(System.in);
    public static GerenciaProduto produtos = new GerenciaProduto();
    public static GerenciaPessoaFisica clientes = new GerenciaPessoaFisica();
    public static GerenciaVendas vendas = new GerenciaVendas();
    ArrayList<Produto> list;

    public void escolherOpcoes(GerenciaProduto prod, GerenciaPessoaFisica pf, GerenciaVendas v) {

        this.produtos = prod;
        this.clientes = pf;
        this.vendas = v;

        int opSubMenu;
        do {
            System.out.println("\n--------Escolha uma opção--------");
            System.out.println("1 - Listar produtos a partir dos mais baratos");
            System.out.println("2 - Listar produtos a partir dos mais caros ");
            System.out.println("3 - Listar produtos com maior estoque");
            System.out.println("4 - Listar produtos mais vendidos");
            System.out.println("5 - Listar preço médio de todos os produtos");
            System.out.println("6 - Voltar a tela anterior");
            opSubMenu = input.nextInt();
            input.skip("\n");

            switch (opSubMenu) {
                case 1: {
                    ordenaPrecoAsc();
                    break;
                }
                case 2: {
                    ordenaPrecoAsc();
                    break;
                }

                case 3: {
                    ordenaEstoqueDesc();
                    break;
                }

                case 4: { 
                    System.out.println("Implemetar!");
                    break;
                }
                
                case 5: {
                    precoMedioProdutos();
                    break;
                }

                default: {
                    System.out.println("Sair: Relatorios!");
                }
            }
        } while (opSubMenu != 6);
    }

    public void ordenaPrecoAsc() {
        Produto aux;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(j).getPreco() < list.get(i).getPreco()) {
                    aux = list.get(i);
                    list.add(i, list.get(j));
                    list.add(j, aux);
                }

            }
        }

    }

    public void ordenaPrecoDesc() {
        Produto aux;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i).getPreco() < list.get(j).getPreco()) {
                    aux = list.get(i);
                    list.add(i, list.get(j));
                    list.add(j, aux);
                }
            }
        }
    }

    public void ordenaEstoqueDesc() {
        Produto aux;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i).getEstoque() < list.get(j).getEstoque()) {
                    aux = list.get(i);
                    list.add(i, list.get(j));
                    list.add(j, aux);
                }

            }
        }
    }

    public void precoMedioProdutos() {
        double pTotal = 0.0;
        for (int i = 0; i < list.size(); i++) {
                pTotal = list.get(i).getPreco() + pTotal;
        }
        
        System.out.println("O preco medio = R$ " + pTotal/list.size());
    }
}
