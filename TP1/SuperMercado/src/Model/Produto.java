/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ps0474
 */
public class Produto {

    private  int codProd;
    private String nome;
    private String descricao;
    private String validade;
    private double preco;
    private static int cod = 0;
    

    public Produto(String nome, String descricao, String validade, double preco){
    	this.nome = nome;
    	this.descricao = descricao;
    	this.validade = validade;
    	this.preco = preco;
    	setCod(1);
    	setCodProd(getCod());
    
    }
    
    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

	public static int getCod() {
		return cod;
	}

	public static void setCod(int cod) {
		Produto.cod += cod;
	}
}
