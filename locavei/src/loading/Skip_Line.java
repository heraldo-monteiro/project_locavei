/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loading;

public class Skip_Line {    
    // o  trecho de código tem afunção de saltar uma determinada quantidade de linhas determinada pelo desenvolvedor  
    public void pularLinhas(int num_linhas){
        for(int lin = 0; lin <= num_linhas; lin++){
            System.out.println("");            
        }          
    }
    
}
