/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cliente;
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
        
        
        Usuario tiago = new Usuario(1, "tiago", "123456", "administrador", 'M', "09/05/1996", "992408406", "tiagoluz.h6607@gmail.com", "95412547845");
        System.out.println(tiago.getNome());
        System.out.println(tiago.getDataNascimento()); //debugar aqui
        
        Cliente link = new Cliente(1, "link", 'M', "09/05/1996", "92408407", "zelda@zelda.com", "9254785", "Rua 345 palmeiras, NH", "9330000000");
        
        
   }
    
    
}
