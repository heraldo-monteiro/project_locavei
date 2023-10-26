
package entre;
import loading.Loading;
import java.util.*;
import java.text.*;
import java.time.LocalDate;
import java.util.concurrent.TimeUnit;



/*Declaração de variaveis e atributos da classe.
* por ser uma classe abstrata, não pode ser instanciada
*/
public abstract class Entrega { 
    private int dia, mes, ano;  
    private float kmFim;
    private LocalDate data;  
    private int codEntrega, cod;     

    DecimalFormat df = new DecimalFormat();
    Scanner input = new Scanner(System.in);     
    
    //-------------------------------------------------------------     
    public Entrega(){
        /*assinatura do metodo construtor sem parametros         
        */
        
    }
    //------------------------------------------------------------- 
    // Assinatura do método construtor com parametro
    public Entrega(int codEntrega){           
        this.codEntrega = codEntrega;
                   
    } 
    //----- Cabeçlho de Entrada & Saída ---------------------------   
    public void moduloET_SD(String mes){    
    System.out.println("Sisdtema de Locação de Veiculos - Locavei");
    System.out.println("Modulo de: "+mes+"  de Dados  - - - - - -");
    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");    
    } 
    //----- Metodo de autenticação -------------------------------- 
    public boolean autenticar(int cod){       
    load.loading(0,0,0);//process data:  [num_linas, num_pontos, qtd_segundos] número de linhas, número de pontos por linhas, segungos entre cada linha.        
        
        if (getCodEntrega() == cod){
            System.out.println("\n---- Código Verificado!! ----------");           
            return true;
        } else {    
            System.out.println("\nCodigo não Encontrado!!");
            return false;
        }     
    } 
    
    //----- Método de Serviço para a entrada de dados --------------    
    public void cadastra()  // register
    { 
        System.out.print ("Código de Entrega: "); 
        setCodEntrega (input.nextInt());            
    } 

    //------------------------------------------------------------- 
   // Metodo de Serviço para exibir os dados a pos processados.
    @Override
    public String toString(){ // show data (mostrar dados)    
        df.applyPattern("#,##0.00");  
        System.out.print("INFORMAÇÕES DA ENTREGA");            
        return ("\nCódigo da Entrega: "+getCodEntrega()+ "  |  Data da Entrega: "+getData());  
    }
    
    //-----GETs  e SETs---------------------------------------------------------   
    /* Tem como função acessar as variaveis declaradas como Privadas na Classe. 
    #   O this é usado para fazer a distinção entre a variavel vocal 
    #   e a variavel da classe.
    */
    public LocalDate getData(){
        return data; // Retorna o valor da variavel Data
    }

    public int getCodEntrega() {
        return codEntrega; // Retorna o valor da variavel codEntrega.  
    }

    public float getKmFim() {
        return kmFim; //// Retorna o valor da variavel  kmFim
    }

    public void setData(LocalDate data) {
        this.data = data;

    }

    public void setCodEntrega(int codEntrega) {
        this.codEntrega = codEntrega;
  
    }

    public void setKmFim(float kmFim) {
        this.kmFim = kmFim; 
    }


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    
    //----- METODOS ABSTRATOS --------------------------------------------------
    public abstract void verificar_dataLocacao_dataEntrega();
    public abstract void valores_e_Cobrancas();
    
    
    //----- IMPORT LOADING -----------------------------------------------------
    Loading load = new Loading(); 
    
}