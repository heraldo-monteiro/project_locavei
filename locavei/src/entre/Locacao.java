
package entre;
    import loading.Skip_Line;
    import loading.Loading;
    import java.util.*;
    import java.time.LocalDate;
    import java.time.temporal.ChronoUnit;

public class Locacao extends Entrega{
    private int codLoca, diasLoca ;
    private float valorLoca, valorTotal;     
    private LocalDate dataLoca ;   
    private int diasEntrega;     
    Scanner input = new Scanner(System.in);
    
    
    //--------------------------------------------------------------------------     
    public Locacao(){
    /*Metodo Contrutor sem parametros */    
    }   
    
    //--------------------------------------------------------------------------   
    /* metodo construtot com parametros*/
    public Locacao(int codLoca, int codEntrega, int diasLoca) {
        super(codEntrega);
        this.codLoca = codLoca;
        this.diasLoca = diasLoca;
    }     
    //-------------------------------------------------------------------------- 
    @Override
    public void cadastra(){ super.moduloET_SD("ENTRADA" );    
        System.out.println("VERIFICAÇÃO DA LOCAÇAO");
        
        System.out.print ("Código da Locação: "); setCodLoca ( input.nextInt()); 
        super.cadastra();  
        skip.pularLinhas(1);  // salta uma quantidade de linhas determinada pelo desenvolvedor.     
    }   
    //--------------------------------------------------------------------------    
    @Override
    public void valores_e_Cobrancas(){  
        load.loading(0,0,0);//[num_linas, num_pontos, qtd_segundos] número de linhas, número de pontos por lonhas, segungos entre cada linha.
        skip.pularLinhas(3);//(num_Linhas)     
        System.out.println("VALORES A COBRAR");
        System.out.print("Valor a Cobrar por Dias em Atraso: "); setValorLoca(input.nextFloat());         
        skip.pularLinhas(1); 
    }
    //-------------------------------------------------------------------------- 
    @Override
    public void verificar_dataLocacao_dataEntrega(){
        int dia, mes, ano;      
        // Data da Locação
        skip.pularLinhas(3);// salta uma quantidade de linhas determinada pelo desenvolvedor.
        System.out.println("INFORME A DATA DA LOCAÇÃO");        
        System.out.print("  Dia: "); dia = input.nextInt();
        System.out.print("  Mes: "); mes = input.nextInt();
        System.out.print("  Ano: "); ano = input.nextInt();          
        setDataLoca(LocalDate.of(ano, mes,  dia)); 
        
        // Data da Entrega 
        skip.pularLinhas(1);// salta uma quantidade de linhas determinada pelo desenvolvedor.
        System.out.println("INFORME A DATA DA ENTREGA");
        System.out.print("  Dia: "); dia = input.nextInt();
        System.out.print("  Mes: "); mes = input.nextInt();
        System.out.print("  Ano: "); ano = input.nextInt();               
        setData(LocalDate.of(ano, mes,  dia));          
        setDiasEntrega((int) ChronoUnit.DAYS.between(getDataLoca(), getData()));        
    }
    //----- toString -----------------------------------------------------------
    @Override
    public String toString(){ // show data   
        skip.pularLinhas(2); // salta uma quantidade de linhas determinada pelo desenvolvedor.
            return ("\nQnt.Dias Contratados: "+getDiasLoca()+" dia(s) \n"
            +"\nCódigo da Locação: "+getCodLoca()+ "  |  Data da Locação: "+getDataLoca()
            + super.toString()
            +"\nAdiantado: "+entregaAntecipada()+" dia(s)  |  Valor a Estornar: R$"+df.format(estornos()) 
            +"\nAtrasado: "+entregaAtrasada()+" dia(s)   |  Valor por Atraso: R$"+df.format(multaAtraso()));   
    }
    //--------------------------------------------------------------------------    
    // esta linha verificará se a entrega está no prazo determinado ou adiantado
    public int entregaAntecipada(){
        if(diasLoca > diasEntrega){
            return diasLoca - diasEntrega;             
        }else{
            return 0;  
        } 
    }
    
    public float estornos(){
        float estorno;
        if(entregaAntecipada() > 0){
            
            estorno = (entregaAntecipada() * getValorLoca());
            return (estorno) - estorno * 20/100;           
        }else{        
            return 0;
        }
    }      
    //--------------------------------------------------------------------------
    //este bloco verificará se a entrega está em Atraso 
    public int entregaAtrasada(){
        if(diasEntrega > diasLoca){
            return diasEntrega - diasLoca;            
        }else{
            return 0;  
        }          
    }
    
    public float multaAtraso(){
                float multa;
        if(entregaAtrasada() > 0){
            multa = entregaAtrasada() * getValorLoca();
            return multa;           
        }else{        
            return 0;
        }       
    }    
    //-------------------------------------------------------------------------- 

    public int getCodLoca() {
        return codLoca;
    }

    public void setCodLoca(int codLoca) {
        this.codLoca = codLoca;
    }

    public int  getDiasLoca() {
        return diasLoca;
     
    }

    public void setDiasLoca(int diasLoca) {
        this.diasLoca = diasLoca;
    }

    public float getValorLoca() {
        return valorLoca;
    }

    public void setValorLoca(float valorLoca) {
        this.valorLoca = valorLoca;
    }

    public float getValorTotal() {   
        
        
        return valorTotal ;      
    }

    public void setValorTotal (float valorTotal) {
        this.valorTotal = valorTotal;       
    }  

    public LocalDate getDataLoca() {
        return dataLoca;
    }

    public void setDataLoca(LocalDate dataLoca) {
        this.dataLoca = dataLoca;
    }

    public int getDiasEntrega() {
        return diasEntrega;
        
    }

    public void setDiasEntrega(int diasEntrega) {
        this.diasEntrega = diasEntrega;
    }    
   
    //----- Load_Class ---------------------------------------------------------    
    Loading load = new Loading();
    Skip_Line skip = new Skip_Line();    
}

