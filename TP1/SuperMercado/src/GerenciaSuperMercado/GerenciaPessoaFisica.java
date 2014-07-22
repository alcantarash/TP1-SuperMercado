package GerenciaSuperMercado;

import Model.PessoaFisica;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciaPessoaFisica {

    private Scanner input = new Scanner(System.in);
    public static ArrayList<PessoaFisica> pessoa = new ArrayList<PessoaFisica>();
    public static PessoaFisica pFisica;
    int posicao = 0;

    public void escolherOpcoes() {

        int opSubMenu;
        do {
            System.out.println("\nGereciamento Pessoa Fisica");
            System.out.println("1 - Cadastrar Pessoa Fisica");
            System.out.println("2 - Editar Pessoa Fisica");
            System.out.println("3 - Pesquisar Pessoa Fisica");
            System.out.println("4 - Deletar Pessoa Fisica");
            System.out.println("5 - Listar Pessoa Fisica");
            System.out.println("6 - Sair");
            opSubMenu = input.nextInt();
            input.skip("\n");

            switch (opSubMenu) {
                case 1: {
                    cadastrarPessoaFisica();
                    break;
                }

                case 2: {
                    editarPessoaFisica();
                    break;
                }

                case 3: {
                    pesquisarPessoaFisica();
                    break;
                }

                case 4: {
                    deletarPessoaFisica();
                    break;
                }

                case 5: {
                    listarPessoaFisica();
                    break;
                }

                default: {
                    System.out.println("Sair: Gerencia Pessoa Fisica!");
                }
            }
        } while (opSubMenu != 6);
    }

    public void cadastrarPessoaFisica() {
        System.out.println("Informe o nome: ");
        String nome = input.next();

        System.out.println("Informe o Sexo (ex: Masculino ou Feminino): ");
        String sexo = input.next().toUpperCase();

        System.out.println("Informe a Data de Nascimento: ");
        String dtNascimento = input.next();

        System.out.println("Informe o CPF: ");
        String cpf = input.next();

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

        pFisica = new PessoaFisica(cpf, sexo, dtNascimento, nome, telefone, endereco, bairro, cep, cidade, estado);
        pessoa.add(posicao, pFisica);
    }

    public void editarPessoaFisica() {
        String cpfPesquisa;
        int opcao;

        System.out.println("Informe o cpf: ");
        cpfPesquisa = input.next();

        for (int i = 0; i < pessoa.size(); i++) {
            if (pessoa.get(i) != null) {
                if (cpfPesquisa.equals(pessoa.get(i).getCpf())) {
                    do {
                        System.out.println("Escolha uma das opcoes:");
                        System.out.println("1 - Editar Nome");
                        System.out.println("2 - Editar Sexo");
                        System.out.println("3 - Editar Data de Nascimento");
                        System.out.println("4 - Editar CPF");
                        System.out.println("5 - Editar Telefone");
                        System.out.println("6 - Editar Endereco");
                        System.out.println("7 - Editar Bairro");
                        System.out.println("8 - Editar CEP");
                        System.out.println("9 - Editar Cidade");
                        System.out.println("10 - Editar Estado");
                        System.out.println("11 - Sair");
                        System.out.println("Digite a opcao desejada:");
                        opcao = input.nextInt();

                        switch (opcao) {
                            case 1: {
                                System.out.println("Informe o nome: ");
                                String nome = input.next();
                                pessoa.set(i, pFisica).setNome(nome);
                                break;
                            }

                            case 2: {
                                System.out.println("Informe o Sexo (ex: Masculino ou Femino):");
                                String sexo = input.next().toUpperCase();
                                pessoa.set(i, pFisica).setSexo(sexo);
                                break;
                            }

                            case 3: {
                                System.out.println("Informe a Data de Nascimento:");
                                String dtNascimento = input.next();
                                pessoa.set(i, pFisica).setDtNascimento(dtNascimento);
                                break;
                            }

                            case 4: {
                                System.out.println("Informe o CPF:");
                                String cpf = input.next();
                                pessoa.set(i, pFisica).setCpf(cpf);
                                break;
                            }

                            case 5: {
                                System.out.println("Informe o Telefone:");
                                String telefone = input.next();
                                pessoa.set(i, pFisica).setTelefone(telefone);
                                break;
                            }

                            case 6: {
                                System.out.println("Informe o Endereco:");
                                String endereco = input.next();
                                pessoa.set(i, pFisica).getEndereco();
                                break;
                            }

                            case 7: {
                                System.out.println("Informe o Bairro:");
                                String bairro = input.next();
                                pessoa.set(i, pFisica).setBairro(bairro);
                                break;
                            }

                            case 8: {
                                System.out.println("Informe o CEP:");
                                String cep = input.next();
                                pessoa.set(i, pFisica).setCep(cep);
                                break;
                            }

                            case 9: {
                                System.out.println("Informe a Cidade:");
                                String cidade = input.next();
                                pessoa.set(i, pFisica).setCidade(cidade);
                                break;
                            }

                            case 10: {
                                System.out.println("Informe o Estado:");
                                String estado = input.next();
                                pessoa.set(i, pFisica).setEstado(estado);
                                break;
                            }

                            default: {
                                System.out.println("Sair!");
                            }
                        }
                    } while (opcao != 11);
                } else {
                    System.out.println("Cliente nao Encontrado!");
                }
            }
        }
    }

    public void pesquisarPessoaFisica() {

        System.out.println("Informe o CPF:");
        String cpfPesquisa = input.next();

        for (int i = 0; i < pessoa.size(); i++) {
            if (pessoa.get(i) != null) {
                if (cpfPesquisa.equals(pessoa.get(i).getCpf())) {
                    System.out.println("Cliente Encontrado!\n");
                    System.out.println("Nome: " + pessoa.get(i).getNome());
                    System.out.println("Sexo: " + pessoa.get(i).getSexo());
                    System.out.println("Data de Nascimento: " + pessoa.get(i).getDtNascimento());
                    System.out.println("CPF: " + pessoa.get(i).getCpf());
                    System.out.println("Telefone: " + pessoa.get(i).getTelefone());
                    System.out.println("Endereco: " + pessoa.get(i).getEndereco());
                    System.out.println("Bairro: " + pessoa.get(i).getBairro());
                    System.out.println("CEP: " + pessoa.get(i).getCep());
                    System.out.println("Cidade: " + pessoa.get(i).getCidade());
                    System.out.println("Estado: " + pessoa.get(i).getEstado());
                } else {
                    System.out.println("Cliente nao Cadastrado!");
                }
            } else {
                System.out.println("Não existem Clientes Cadastrados!");
            }
        }
    }

    public PessoaFisica retornaPessoaFisica(String cpf) {

        for (int i = 0; i < pessoa.size(); i++) {
            if (pessoa.get(i) != null) {
                if (cpf.equals(pessoa.get(i).getCpf())) {
                    return pessoa.get(i);
                }
            }
        }
        return null;
    }

    public void deletarPessoaFisica() {

        System.out.println("Informe o CPF:");
        String cpfDeleta = input.next();

        for (int i = 0; i < pessoa.size(); i++) {
            if (pessoa.get(i) != null) {
                if (cpfDeleta.equals(pessoa.get(i).getCpf())) {
                    pessoa.remove(i);
                    System.out.println("cliente removido com sucesso...");
                }
            }
        }
    }

    public void listarPessoaFisica() {
        for (int i = 0; i < pessoa.size(); i++) {
            if (pessoa.get(i) != null) {
                System.out.println("Nome: " + pessoa.get(i).getNome());
                System.out.println("Sexo: " + pessoa.get(i).getSexo());
                System.out.println("Data de Nascimento: " + pessoa.get(i).getDtNascimento());
                System.out.println("CPF: " + pessoa.get(i).getCpf());
                System.out.println("Telefone: " + pessoa.get(i).getTelefone());
                System.out.println("Endereco: " + pessoa.get(i).getEndereco());
                System.out.println("Bairro: " + pessoa.get(i).getBairro());
                System.out.println("CEP: " + pessoa.get(i).getCep());
                System.out.println("Cidade: " + pessoa.get(i).getCidade());
                System.out.println("Estado: " + pessoa.get(i).getEstado());
            } else {
                System.out.println("Não existem Clientes Cadastrados!");
            }
        }
    }
}
