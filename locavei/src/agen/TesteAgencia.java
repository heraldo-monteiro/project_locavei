/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agen;

import agen.Agencia;

/**
 *
 * @author Heraldo
 */
public class TesteAgencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agencia ag = new Agencia(0,0); 
        ag.consultarAgencia(); 
        System.out.println(ag.toString());
        
        
    }
    
}
