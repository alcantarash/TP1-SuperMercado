/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GerenciaSuperMercado;

import Model.PessoaFisica;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciaPessoaFisica {

   private Scanner input = new Scanner(System.in);
   public static ArrayList<PessoaFisica> pessoa = new ArrayList<PessoaFisica>();
   public static PessoaFisica pFisica;
   int posicao = 0;
   
   public void escolherOpcoes(){
   
       int opSubMenu;
       do{
           System.out.println("\nGereciamento Pessoa Fisica");
           System.out.println("1 - Cadastras Pessoa Fisica");
           System.out.println("2 - Editar Pessoa Fisica");
           System.out.println("3 - Pesquisar Pessoa Fisica");
           System.out.println("4 - Deletar Pessoa Fisica");
           System.out.println("5 - Sair");
           opSubMenu = input.nextInt();
           input.skip("\n");
           
           switch(opSubMenu){
               case 1:{
                    cadastrarPessoaFisica();
                    break;
               }
               
               case 2:{
                   editarPessoaFisica();
                   break;
               }
               
               case 3:{
                   pesquisarPessoaFisica();
                   break;
               }
               
               case 4:{
                   deletarPessoaFisica();
                   break;
               }
               
               default:{
                   System.out.println("Sair: Gerencia Pessoa Fisica!");
               }
           }
       }while(opSubMenu != 5);
   }
    
    
    public void cadastrarPessoaFisica(){
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
                
                pFisica = new PessoaFisica(cpf,sexo, dtNascimento, nome, telefone, endereco, bairro, cep, cidade, estado);
                pessoa.add(posicao, pFisica);              
    }
    
    public void editarPessoaFisica(){ 
    }
    
    public void pesquisarPessoaFisica(){ 
    }
    
    public void deletarPessoaFisica(){ 
    }
    
}
