package GerenciaSuperMercado;

import Model.PessoaFisica;
import Model.Produto;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciaProduto {

    private Scanner input = new Scanner(System.in);
    public static ArrayList<Produto> produtos = new ArrayList<Produto>();
    public static Produto produto;
    int posicao = 0;

    public void escolherOpcoes() {

        int opSubMenu;
        do {
            System.out.println("\nGereciamento Produto");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produto");
            System.out.println("3 - Pesquisar Produto");
            System.out.println("4 - Deletar Produto");
            System.out.println("5 - Sair");
            opSubMenu = input.nextInt();
            input.skip("\n");

            switch (opSubMenu) {
                case 1: {
                    cadastrarProduto();
                    break;
                }
                case 2: {
                    listarProdutos();
                    break;
                }

                case 3: {
                    pesquisarProduto();
                    break;
                }

                case 4: {
                    deletarProduto();
                    break;
                }

                default: {
                    System.out.println("Sair: Gerencia Produtos!");
                }
            }
        } while (opSubMenu != 5);
    }

    public void cadastrarProduto() {

        try{
        System.out.println("Digite o nome do produto: ");
        String nome = input.next();
        
        System.out.println("Digite a descrição do produto: ");
        String descricao = input.next();
        
        System.out.println("Digite a validade do produto: ");
        String validade = input.next();

        System.out.println("Digite o preço do produto: ");
        double preco = input.nextDouble();
        
        System.out.println("Digite o estoque do produto: ");
        int estoque = input.nextInt();

        produtos.add(new Produto(nome, descricao, validade, preco, estoque));
        System.out.println("Produto cadastrado com sucesso! \n");
        }catch(NumberFormatException e){
            System.out.println("Formato de preco invalido!");
            System.out.println("Digite o preço do produto: ");
            double preco = input.nextDouble();
        }
    }

    public void listarProdutos() {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i) != null) {
                System.out.println("Produto " + produtos.get(i).getCodProd() + ":\n");
                System.out.println("Nome: " + produtos.get(i).getNome());
                System.out.println("Descrição: " + produtos.get(i).getDescricao());
                System.out.println("Validade: " + produtos.get(i).getValidade());
                System.out.println("Estoque: " + produtos.get(i).getEstoque());
                System.out.println("Preço: " + produtos.get(i).getPreco() + "\n\n");

            }
        }

    }

    public void pesquisarProduto() {

        System.out.println("Informe o cod do produto:");
        int codPesquisa = input.nextInt();

        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i) != null) {
                if (codPesquisa == produtos.get(i).getCodProd()) {
                    System.out.println("Produto Encontrado:\n");
                    System.out.println("Cod: " + produtos.get(i).getCodProd());
                    System.out.println("Nome: " + produtos.get(i).getNome());
                    System.out.println("Descrição: " + produtos.get(i).getDescricao());
                    System.out.println("Validade: " + produtos.get(i).getValidade());
                    System.out.println("Estoque: " + produtos.get(i).getEstoque());
                    System.out.println("Preço: " + produtos.get(i).getPreco());
                }
            }
        }

    }

    public Produto retornaProduto(int cod) {

        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i) != null && cod == produtos.get(i).getCodProd()) {
                return produtos.get(i);
            }
        }
        return null;
    }

    public void deletarProduto() {

        System.out.println("Informe o Cod do produto:");
        int codDeleta = input.nextInt();

        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i) != null) {
                if (codDeleta == produtos.get(i).getCodProd()) {
                    produtos.remove(i);
                    System.out.println("produto removido com sucesso...");
                }
            }
        }
    }
}
