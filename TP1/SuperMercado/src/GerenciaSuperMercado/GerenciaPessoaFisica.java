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
    }
    
    public void editarPessoaFisica(){ 
    }
    
    public void pesquisarPessoaFisica(){ 
    }
    
    public void deletarPessoaFisica(){ 
    }
    
}
