    
/** Os Valores estão determinados como tipo inteiro (não usar outros tipos de valores)   
    [num_linhas] - Insere um de terminado números de linhas
    [num_simbolo] - Insere um de terminado números de símbolos
    [num_seconds] - Insere o tempo em segundos entre cada lina
    (quanto maior o valor informado, maior será o tempo de execução entre as linhas)      
    */
package loading;
import java.util.concurrent.TimeUnit;


public class Loading {    

     
    public Loading (){ }  // construtor da classe
 
    //----- LOADING ------------------------------------------------------------
    public void loading(int num_linhas, int num_simbolo, int num_seconds){ //process data: este metodo recebe os dados do metodos (pausa e pontilhar);      
        for(int  lin = 0; lin < num_linhas; lin++){              
            simbolo(num_simbolo); //Quanto maior o 'num_simbolo' maior o numero de pontpos multiplos  irá ser  inser inserido.     
            pause_entre_line(num_seconds);// Tempo de execulçao em segundos quanto maior o valor em segundos maior será o tempo de resposta entre as linhas.         
        }
    }
    
    //----- INSERT SYMBOL ------------------------------------------------------
    public void simbolo(int num_linhas){ // esta linha irá iseri um caractere na execução do codigo em determinado local.  
        for(int lin = 0; lin < num_linhas; lin++){
            System.out.print("_");            
        }          
    }
    
    //----- PAUSE IN BETWEEN LINE ----------------------------------------------
    public void pause_entre_line(int num_seg){ // este trecho de código tem a função de pausar a execução por um determinado tempo especificado pelo desenvolverdor.     
        try { 
            
            TimeUnit.MILLISECONDS.sleep(num_seg);
            // TimeUnit.SECONDS.sleep(num_seg);
            } catch (InterruptedException ex){           
        }       
    }  
    
    
    
    
}
