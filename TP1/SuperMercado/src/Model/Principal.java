import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Principal {
	
	public static void ordena(ArrayList<Produto> list){
		Produto aux;
		
		for(int i = 0; i<list.size() ; i++){
			for(int j = i ; j<list.size();j++){
				if(list.get(j).getPreco() < list.get(i).getPreco()){
					aux = list.get(i);
					list.add(i, list.get(j));
					list.add(j,aux);
				}
					
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList <Produto> produtos = new ArrayList<Produto>();
		Produto item;
		int op;
		
		do{
			System.out.println("--------Escolha uma opção--------");
			System.out.println("1 - Cadastrar produtos");
			System.out.println("2 - Ver produtos");
			System.out.println("3 - Cadastrar clientes");
			System.out.println("4 - Vender produtos");
			System.out.println("5 - Relatório de vendas");
			System.out.println("6 - Cancelar uma venda");
			System.out.println("7 - Fechar Sistema");
			
			op = scan.nextInt();
			
			switch(op){
				
			case 1 : String nome;
					 String descricao;
					 String validade;
					 double preco;
					 int estoque;				
					 
					 System.out.println("Digite o nome do produto: ");
					 nome = scan.next();
					 System.out.println("Digite a descrição do produto: ");
					 descricao = scan.next();
					 System.out.println("Digite a validade do produto: ");
					 validade = scan.nextLine();
					 validade = scan.nextLine();					 					 
					 System.out.println("Digite o preço do produto: ");
					 preco = scan.nextDouble();
					 System.out.println("Digite o estoque do produto: ");
					 estoque = scan.nextInt();
					 
					 produtos.add(item = new Produto(nome,descricao, validade, preco,estoque));					 
					 System.out.println("Produto cadastrado com sucesso! \n"); break;
					 
			case 2: 
				
					System.out.println("\n--------Escolha uma opção--------");
					System.out.println("1 - Listar produtos a partir dos mais baratos");
					System.out.println("2 - Listar produtos a partir dos mais caros ");
					System.out.println("3 - Listar produtos com maior estoque");
					System.out.println("4 - Listar produtos mais vendidos");
					System.out.println("5 - Listar preço médio de todos os produtos");
					System.out.println("6 - Voltar a tela anterior");
					
					int opc;
					
					opc = scan.nextInt();
					switch(opc){
					
					case 1 :// ordena(produtos);
					
							System.out.println(produtos.get(0).getPreco());
							System.out.println(produtos.get(1).getPreco());
							System.out.println(produtos.get(2).getPreco());
							 /*for(int i = 0;i<produtos.size();i++)
								 System.out.println(produtos.get(i).getNome()+"\n"+produtos.get(i).getDescricao()+"\n"+produtos.get(i).getPreco());*/
							 
								 
						
					}
						 
			}
			
			
		}while(op != 7);

	}

}
