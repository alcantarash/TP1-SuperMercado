/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ps0474
 */
public class PessoaFisica extends Cliente {

    private String cpf;
    private String sexo;
    private String dtNascimento;

    public PessoaFisica(String cpf, String sexo, String dtNascimento, String nome, String telefone, String endereco, String bairro, String cep, String cidade, String estado) {
        super(nome, telefone, endereco, bairro, cep, cidade, estado);
        this.cpf = cpf;
        this.sexo = sexo;
        this.dtNascimento = dtNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
}
