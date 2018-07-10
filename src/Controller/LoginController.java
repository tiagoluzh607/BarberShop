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
    
    
    public void FizTendeu(){
        
        //Vou fazer a Logica que preciso aqui
        System.out.println("Busquei do banco fiz tendeu.");
        
        //Retornando feedback ao usuario
        this.view.exibeMensagem("Executei o FizTendeu");
        
    }
    
}
