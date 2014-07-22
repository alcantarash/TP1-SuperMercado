/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GerenciaSuperMercado;

import Model.PessoaJuridica;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciaPessoaJuridica {

    private Scanner input = new Scanner(System.in);
    public static ArrayList<PessoaJuridica> empresa = new ArrayList<PessoaJuridica>();
    public static PessoaJuridica pJuridica;
    int posicao = 0;

    public void escolherOpcoes() {

        int opSubMenu;
        do {
            System.out.println("\nGereciamento Pessoa Juridica");
            System.out.println("1 - Cadastrar Pessoa Juridica");
            System.out.println("2 - Editar Pessoa Juridica");
            System.out.println("3 - Pesquisar Pessoa Juridica");
            System.out.println("4 - Deletar Pessoa Juridica");
            System.out.println("5 - Listar Pessoa Juridica");
            System.out.println("6 - Sair");
            opSubMenu = input.nextInt();
            input.skip("\n");

            switch (opSubMenu) {
                case 1: {
                    cadastrarPessoaJuridica();
                    break;
                }

                case 2: {
                    editarPessoaJuridica();
                    break;
                }

                case 3: {
                    pesquisarPessoaJuridica();
                    break;
                }

                case 4: {
                    deletarPessoaJuridica();
                    break;
                }

                case 5: {
                    listarPessoaJuridica();
                    break;
                }

                default: {
                    System.out.println("Sair: Gerencia Pessoa Juridica!");
                }
            }
        } while (opSubMenu != 6);
    }

    public void cadastrarPessoaJuridica() {
        System.out.println("Informe o nome: ");
        String nome = input.next();

        System.out.println("Informe o CNPJ: ");
        String cnpj = input.next();

        System.out.println("Informe a Razao Social: ");
        String razaoSocial = input.next();

        System.out.println("Informe o Telefone: ");
        String telefone = input.next();

        System.out.println("Informe o Endereco: ");
        String endereco = input.next();

        System.out.println("Informe o Bairro: ");
        String bairro = input.next();

        System.out.println("Informe o CEP: ");
        String cep = input.next();

        System.out.println("Informe o Cidade: ");
        String cidade = input.next();

        System.out.println("Informe o Estado: ");
        String estado = input.next();

        pJuridica = new PessoaJuridica(cnpj, razaoSocial, nome, telefone, endereco, bairro, cep, cidade, estado);
        empresa.add(pJuridica);
}

    public void editarPessoaJuridica() {
        String cnpjPesquisa;
        int opcao;

        System.out.println("Informe o cnpj: ");
        cnpjPesquisa = input.next();

        for (int i = 0; i < empresa.size(); i++) {
            if (empresa.get(i) != null) {
                if (cnpjPesquisa.equals(empresa.get(i).getCnpj())) {
                    do {
                        System.out.println("Escolha uma das opcoes:");
                        System.out.println("1 - Editar Nome");
                        System.out.println("2 - Editar CNPJ");
                        System.out.println("3 - Editar Razao Social");
                        System.out.println("4 - Editar Telefone");
                        System.out.println("5 - Editar Endereco");
                        System.out.println("6 - Editar Bairro");
                        System.out.println("7 - Editar CEP");
                        System.out.println("8 - Editar Cidade");
                        System.out.println("9 - Editar Estado");
                        System.out.println("10 - Sair");
                        System.out.println("Digite a opcao desejada:");
                        opcao = input.nextInt();

                        switch (opcao) {
                            case 1: {
                                System.out.println("Informe o nome: ");
                                String nome = input.next();
                                empresa.set(i, pJuridica).setNome(nome);
                                break;
                            }


                            case 2: {
                                System.out.println("Informe o CNPJ:");
                                String cnpj = input.next();
                                empresa.set(i, pJuridica).setCnpj(cnpj);
                                break;
                            }

                            case 3: {
                                System.out.println("Informe a Razao Social:");
                                String razaoSocial = input.next();
                                empresa.set(i, pJuridica).setRazaoSocial(razaoSocial);
                                break;
                            }

                            case 4: {
                                System.out.println("Informe o Telefone:");
                                String telefone = input.next();
                                empresa.set(i, pJuridica).setTelefone(telefone);
                                break;
                            }

                            case 5: {
                                System.out.println("Informe o Endereco:");
                                String endereco = input.next();
                                empresa.set(i, pJuridica).getEndereco();
                                break;
                            }

                            case 6: {
                                System.out.println("Informe o Bairro:");
                                String bairro = input.next();
                                empresa.set(i, pJuridica).setBairro(bairro);
                                break;
                            }

                            case 7: {
                                System.out.println("Informe o CEP:");
                                String cep = input.next();
                                empresa.set(i, pJuridica).setCep(cep);
                                break;
                            }

                            case 8: {
                                System.out.println("Informe a Cidade:");
                                String cidade = input.next();
                                empresa.set(i, pJuridica).setCidade(cidade);
                                break;
                            }

                            case 9: {
                                System.out.println("Informe o Estado:");
                                String estado = input.next();
                                empresa.set(i, pJuridica).setEstado(estado);
                                break;
                            }

                            default: {
                                System.out.println("Sair!");
                            }
                        }
                    } while (opcao != 10);
                } else {
                    System.out.println("Empresa nao encontrada!");
                }
            }
        }
    }

    public void pesquisarPessoaJuridica() {

        System.out.println("Informe o CNPJ:");
        String cnpjPesquisa = input.next();

        for (int i = 0; i < empresa.size(); i++) {
            if (empresa.get(i) != null) {
                if (cnpjPesquisa.equals(empresa.get(i).getCnpj())) {
                    System.out.println("Cliente Encontrado!\n");
                    System.out.println("Nome: " + empresa.get(i).getNome());
                    System.out.println("CNPJ: " + empresa.get(i).getCnpj());
                    System.out.println("Razao Social: " + empresa.get(i).getRazaoSocial());
                    System.out.println("Telefone: " + empresa.get(i).getTelefone());
                    System.out.println("Endereco: " + empresa.get(i).getEndereco());
                    System.out.println("Bairro: " + empresa.get(i).getBairro());
                    System.out.println("CEP: " + empresa.get(i).getCep());
                    System.out.println("Cidade: " + empresa.get(i).getCidade());
                    System.out.println("Estado: " + empresa.get(i).getEstado());
                } else {
                    System.out.println("Empresa nao encotrada!");
                }
            } else {
                System.out.println("Nao existem Empresas Cadastradas!");
            }
        }
    }

    public PessoaJuridica retornaPessoaJuridica(String cnpj) {

        for (int i = 0; i < empresa.size(); i++) {
            if (empresa.get(i) != null) {
                if (cnpj.equals(empresa.get(i).getCnpj())) {
                    return empresa.get(i);
                }
            }
        }
        return null;
    }

    public void deletarPessoaJuridica() {

        System.out.println("Informe o CNPJ:");
        String cnpjDeleta = input.next();

        for (int i = 0; i < empresa.size(); i++) {
            if (empresa.get(i) != null) {
                if (cnpjDeleta.equals(empresa.get(i).getCnpj())) {
                    empresa.remove(i);
                    System.out.println("cliente removido com sucesso...");
                }
            }
        }
    }

    public void listarPessoaJuridica() {
        for (int i = 0; i < empresa.size(); i++) {
            if (empresa.get(i) != null) {
                System.out.println("Cliente Encontrado!\n");
                System.out.println("Nome: " + empresa.get(i).getNome());
                System.out.println("CNPJ: " + empresa.get(i).getCnpj());
                System.out.println("Razao Social: " + empresa.get(i).getRazaoSocial());
                System.out.println("Telefone: " + empresa.get(i).getTelefone());
                System.out.println("Endereco: " + empresa.get(i).getEndereco());
                System.out.println("Bairro: " + empresa.get(i).getBairro());
                System.out.println("CEP: " + empresa.get(i).getCep());
                System.out.println("Cidade: " + empresa.get(i).getCidade());
                System.out.println("Estado: " + empresa.get(i).getEstado());
            } else {
                System.out.println("Nao existem Empresas Cadastradas!");
            }
        }
    }
}
