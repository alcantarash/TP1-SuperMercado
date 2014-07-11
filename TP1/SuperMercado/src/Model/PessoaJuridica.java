/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ps0474
 */
public class PessoaJuridica extends Cliente {

    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica(String cnpj, String razaoSocial, String nome, String telefone, String endereco, String bairro, String cep, String cidade, String estado) {
        super(nome, telefone, endereco, bairro, cep, cidade, estado);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}
