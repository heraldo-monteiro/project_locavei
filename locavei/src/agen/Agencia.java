
package agen;
import loading.Skip_Line;
import loading.Loading;
import java.util.*;
import java.text.*;
import java.util.concurrent.TimeUnit;

public class Agencia {
    private float distancia, valor, valorkm = 0.29F;   
    private int codAg,  codDevol;
    private String UF1, UF2, cidade, origem, entrega;
     
    //--------------------------------------------------------------------------     
    public Agencia(){
        
    }
    //--------------------------------------------------------------------------     
    public Agencia(int codAd, int codDevol) {
        this.codAg = codAg;
        this.codDevol = codDevol;   
    }
    //--------------------------------------------------------------------------
 
    public void consultarAgencia(){ 

        skip.pularLinhas(5);
        System.out.println("VERIFICAÇÃO DA AGÊNCIA");
        System.out.println("a verificação consiste em uma sequencia de 9 combinação.");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");    
        boolean loop = true;
        while (loop){             
            // Linha de código para inserir as informações de origem e entrega do veiculo  
            System.out.println("VERIFICAR AGÊNCIA");
            System.out.println("o número das Agências consistem nos seguntes códigos[ 21 | 61 ou 62 ].\n");               
            System.out.print("Cód. da Agência de Locação: "); setCodAg(input.nextInt());                  
            System.out.print("Cód. da Agência de Devolução: "); setCodDevol(input.nextInt());   
            
            load.loading(0,0,0);//process data: [num_linas, num_pontos, segundos] número de linhas, número de pontos por lonhas, segungos entre cada linha.            
            //Condição 01
            skip.pularLinhas(1);  
            if(getCodAg() == 61 && getCodDevol() == 61){            
                setOrigem("Brasília"); setUF1("DF");      
                setEntrega("Brasília"); setUF2("DF"); 
                setDistancia(0);
                setValor(getDistancia() * getValorkm()); 
                break;
            } 
            //Condição 02
            else if(getCodAg() == 62 && getCodDevol() == 62){
                setOrigem("Goiás"); setUF1("GO") ; 
                setEntrega("Goiás"); setUF2("GO"); 
                setDistancia(0);
                setValor(getDistancia() * getValorkm());       
                break;
            }        
            //Condição 03
           else if(getCodAg() == 21 && getCodDevol() == 21){
                setOrigem("Rio de Janeiro"); setUF1("RJ") ; 
                setEntrega("Rio de Janeiro"); setUF2("RJ");
                setDistancia(0); 
                setValor(getValor() + getDistancia() * getValorkm());     
                break;
           }         
            //Condição 04
            else if(getCodAg() == 21 && getCodDevol() == 61){
                setOrigem("Valença"); setUF1("RJ") ; 
                setEntrega("Brasília"); setUF2("DF"); 
                setDistancia(1.166F); // 1.166 km  Rio / DF
                setValor(getDistancia() * getValorkm());  
                break;
            }
            //Condição 05
           else if(getCodAg() == 21 && getCodDevol() == 62){
                setOrigem("Rio de Janeiro"); setUF1("RJ") ; 
                setEntrega("Pirenópolis"); setUF2("GO");
                setDistancia(1422F); // 1.422 km Rio / Pirinópules
                setValor(getValor() + getDistancia() * getValorkm());   
                break;
            }
           //Condição 06
           else if(getCodAg() == 61 && getCodDevol() == 62){
                setOrigem("Taguatinga"); setUF1("DF") ;         
                setEntrega("Valparaiso"); setUF2("GO");
                setDistancia(308); // 308 km
                setValor(getValor() + getDistancia() * getValorkm());   
                break;
            }  
           //Condição 07
           else if(getCodAg() == 61 && getCodDevol() == 21){
                setOrigem("Brasília"); setUF1("DF") ;             
                setEntrega("Rio de Janeiro"); setUF2("RJ");
                setDistancia(1166F); // 1.166 km
                setValor(getValor() + getDistancia() * getValorkm());
                break;
            }  
           //Condição 08
           else if(getCodAg() == 62 && getCodDevol() == 61){
                setOrigem("Caldas Novas"); setUF1("GO") ;          
                setEntrega("Brasília"); setUF2("DF");
                setDistancia(308); // 308 km Goiania / DF
                setValor(getValor() + getDistancia() * getValorkm());               
                break;
            }          
            //Condição 09
           else if(getCodAg() == 62 && getCodDevol() == 21){
                setOrigem("Goiania"); setUF1("GO") ;         
                setEntrega("Rio de Janeiro"); setUF2("RJ");
                setDistancia(1300); // 1300 km Goiania / Rio
                setValor(getValor() + getDistancia() * getValorkm());                    
                break;
            } 
            // Condição 10
           else{               
               
                System.out.println("\nAgêngia não Localizada!! "+ "\nDigite [0] para Sair ou [1] para Continuar"); 
                int opcao = 0;
                
                System.out.print("Informe um Opção: "); opcao = input.nextInt(); skip.pularLinhas(1);
                 System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                if(opcao ==  0){
                    System.exit(0);
                }
               
                else{
                    continue;                     
                }
            }          
        } 
        System.out.println("\n- - Agencia Localizada!!! - - - - -");
    } 
    
    //-------------------------------------------------------------------------- 
    public String toString(){
        df.applyPattern("#,##0.00");  
        skip.pularLinhas(1);
        System.out.println("DADOS DA AGÊNCIA");
        return("Agência Origem: "+getOrigem() +"  |  UF: "+getUF1()
        +"\nAgengia de Entrega: "+getEntrega() +"  |  UF: "+getUF2()
        +"\nDistancia: "+getDistancia()+ "km  |  Valor a Pagar: R$"+df.format( getValor()));

    }    
    //--------------------------------------------------------------------------  
    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getValorkm() {
        return valorkm;
    }

    public void setValorkm(float valorkm) {
        this.valorkm = valorkm;
    }

    public int getCodAg() {
        return codAg;
    }

    public void setCodAg(int codAg) {
        this.codAg = codAg;
    }

    public int getCodDevol() {
        return codDevol;
    }

    public void setCodDevol(int codDevol) {
        this.codDevol = codDevol;
    }

    public String getUF1() {
        return UF1;
    }

    public void setUF1(String UF1) {
        this.UF1 = UF1;
    }

    public String getUF2() {
        return UF2;
    }

    public void setUF2(String UF2) {
        this.UF2 = UF2;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }        
    
    //----- Instâncias das Classes Java ----------------------------------------   
    Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat(); 
    
    //----- Load_Class ---------------------------------------------------------    
    Loading load = new Loading();
    Skip_Line skip = new Skip_Line();        
}
