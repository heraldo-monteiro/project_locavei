
package entre;


public class TesteLocacao {

    public static void main(String[] args) {
        Locacao loca = new Locacao(0,0,5);// (codLoca, cod Entrega, diasLoca)
        //loca.cadastra();
        //loca.processamento();
        loca.valores_e_Cobrancas();
        System.out.println(loca.toString());
    }    
}