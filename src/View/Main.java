/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cliente;
import Model.Pessoa;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author tiago
 */
public class Main {
    
    
    public static void main(String[] args){
      
        String nome = "tiago";
        System.out.println(nome);
        
        Servico servico = new Servico(1, "corte", 30);
        
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
        
        Usuario tiago = new Usuario(1, "tiago", 'M', "09/05/1996", "92408407", "tiagoluz.h607@gmail.com", "24578874", "123456", "administrador");
        System.out.println(tiago.getNome());
        System.out.println(tiago.getDataNascimento()); //debugar aqui
        
        Cliente link = new Cliente(1, "tiago", 'M', "09/05/1996", "92408407", "tiagoluz.h607@gmail.com", "24578874","Rua teste 654 canudos", "95478452");
        System.out.println(link.getNome());
        System.out.println(link.getDataNascimento()); //debugar aqui
        
        Pessoa pessoinha = new Pessoa(1, "capirotin");
        System.out.println(pessoinha.getNome());
        
   }
    
    
}
