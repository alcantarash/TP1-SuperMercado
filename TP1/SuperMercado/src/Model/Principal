import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

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
					 
					 System.out.println("Digite o nome do produto: ");
					 nome = scan.next();
					 System.out.println("Digite a descrição do produto: ");
					 descricao = scan.next();
					 System.out.println("Digite a validade do produto: ");
					 validade = scan.next();
					 validade = scan.next();
					 System.out.println("Digite preço do produto: ");
					 preco = scan.nextDouble();
					 
					 produtos.add(item = new Produto(nome,descricao, validade, preco));					 
					 System.out.println("Produto cadastrado com sucesso"); 
					 System.out.println(produtos.get(0).getCodProd()); break;
					 
			
			}
			
			
		}while(op != 7);

	}

}
