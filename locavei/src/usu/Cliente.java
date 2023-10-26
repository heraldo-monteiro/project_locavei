
package usu;
import loading.Skip_Line;
import loading.Loading;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Cliente { // start of class
    private int codCliente;
    private String nome, cpf, telefone;
    
    //--------------------------------------------------------------------------   
    public Cliente(int codCliente){ 
        this.codCliente = codCliente;            
    }
    //--------------------------------------------------------------------------    
    public void verificarClient(){ //verify customer      
        Scanner input = new Scanner(System.in);
        boolean loop = true;  
        while (loop){         
        skip.pularLinhas(2);  // Salta a quantidade de linha informada.
        System.out.println("VERIFICAÇÃO DO CLIENTE"); 
        System.out.println("as informações do cliente conssiste da seginte maneira");
        System.out.println("número de redistro do cliente [ 1010 , 2020 , 3030...  até 9090 ]");
        System.out.println("- - - - - - - - - - - - - - -"); 
        System.out.print("Nº de Registro: ");        
        setCodCliente(input.nextInt());
        
        load.loading(15,5,280);//process data: [num_linas, num_pontos, segundos] número de linhas, número de pontos por lonhas, segungos entre cada linha.      
           
        if(getCodCliente() == 1010 || getCodCliente() == 2020
            || getCodCliente() == 3030 || getCodCliente() == 4040 || getCodCliente() == 5050 
            || getCodCliente() == 6060 || getCodCliente() == 7070 || getCodCliente() == 8080 
            || getCodCliente() == 9090 ){ 
            loop = false;            
        }
        else{            
            loop = true; 
            System.out.println("\nCliente não encontrado!!"); 
         }            
       }
    }
    
    //--------------------------------------------------------------------------      
    public void clientList(){ // Lista de todos os clientes cadastrados  no sistema.    
        if(getCodCliente() == 1010){
            setNome("Caroline"); setCpf("000.020.220-03");
            setTelefone("(61)0 0000-0921");         
        }
        else if(getCodCliente() == 2020){
            setNome("Marize"); setCpf("000.000.000-33");
            setTelefone("(83)0 0220-0035");     
        }  
        else if(getCodCliente() == 3030){
            setNome("Veronica"); setCpf("000.000.320-00");
            setTelefone("(83)0 0000-0035");       
        }
        else if(getCodCliente() == 4040){
            setNome("Maria Vilma"); setCpf("000.097.000-23");
            setTelefone("(61)0 0000-6300");       
        }
        else if(getCodCliente() == 5050){
            setNome("Nicolaus Bentus"); setCpf("000.580.000-33");
            setTelefone("(582)0 0000-1252");  
          
        }        
        else if(getCodCliente() == 6060){
            setNome("Mauvinas"); setCpf("000.000.000-33");
            setTelefone("(88)0 1250-6005");       
        }        
        else if(getCodCliente() == 7070){
            setNome("Thanatus"); setCpf("000.000.000-33");
            setTelefone("(55)0 0000-2462");              
        }   
        else if(getCodCliente() == 8080){
            setNome("Maria da Silva"); setCpf("000.002.500-33");
            setTelefone("(91)0 0040-0005"); 
           
        }       
        else if(getCodCliente() == 9090 ){
            setNome("dom Predro I"); setCpf("000.580.000-33");
            setTelefone("(61)0 0000-6335");         
        }
        else{ 
            System.out.println("Cidade não Localizada!!!");
            
        } 
     toString();        
    }
 
    //--------------------------------------------------------------------------     
    @Override
    public String toString(){ // show data 
        System.out.println("");
        return "DADOS DO CLIENTE"                
                +"\nNºdo Registro: "+getCodCliente()
                +"\nNome: "+getNome()+ "  |  CPF: "+getCpf()+ "  |  Telefone: "+getTelefone()
                +"\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -";           
    }
    //--------------------------------------------------------------------------     
    // Metodos Acessores (GET's & SET's) 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }    

    //##########################################################################
    //----- Load_Class ---------------------------------------------------------    
    Loading load = new Loading();
    Skip_Line skip = new Skip_Line();  
} // end of class
