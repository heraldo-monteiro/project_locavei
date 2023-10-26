
package entre;
import usu.Cliente;
import agen.Agencia;

/**
 * Instituição: ETB - Escola Técnica de Brasília
 * Curso: Técnico em Informática
 * Linguagem Técnica de Programação
 * Grupo: GT02
 * Objetivo: Desenvolvimento do Projeto Guiado
 */
public class TesteEntrega {

    public static void main(String[] args) {
    //----- INSTÂNCIAS ---------------------------------------------------------
        Agencia agen = new Agencia(0,0);
        Cliente clie = new Cliente(0);
        Locacao loca = new Locacao(0,0,6); // cod.Locação, cod.Entrega, qtd.Dias
        
    //----- ENTRADA DE DADOS ---------------------------------------------------
        loca.cadastra(); // ------------- 1 º  check       
        boolean checar = loca.autenticar(loca.getCodLoca()); //Inicio do processo de verificação ---- 2º
             if(checar == false){
                 System.out.println("\nSistema Encerrado");
                 System.exit(0);
             } // Fim do processo de verificação

        clie.verificarClient(); //------ 3°
        clie.clientList();           
        System.out.println(clie.toString()); // Linha de código para mostrar as informações do Cliente (usu.Cliente/toString)        
        agen.consultarAgencia();         
        loca.verificar_dataLocacao_dataEntrega();              
        loca.valores_e_Cobrancas();       

    //----- SAÍDA --------------------------------------------------------------    
        loca.moduloET_SD("SAÍDA"); 
        System.out.println(clie.toString()); // Linha de código para mostrar as informações do Cliente (usu.Cliente/toString)        
        System.out.println(agen.toString());// Linha de código para mostrar as informações da Agência (agen.Agencia/toString)
        System.out.println(loca.toString());// Linha de código para mostrar as informações da Entrega (entre.Entrega/toString)        

       
    }  
}

