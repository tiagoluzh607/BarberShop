/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Login;

/**
 *
 * @author tiago
 */
public class LoginController {
    
    private Login view;

    public LoginController(Login view) {
        this.view = view;
    }
    
    public void entrarNoSistema(){
    
        //Pegar Usuario da View
        //Pesquisa Usuario no Banco
        //Se o usuario da view tiver mesmo usuario e senha que o usuario vindo do banco direcionar para menu principal
        //Senão mostrar uma mensagem ao usuario "Usuario e senha invalidos"
    }
    
    public void FizTendeu(){
        
        //Vou fazer a Logica que preciso aqui
        System.out.println("Busquei do banco fiz tendeu.");
        
        //Retornando feedback ao usuario
        this.view.exibeMensagem("Executei o FizTendeu");
        
    }
    
}
