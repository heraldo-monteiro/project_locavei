
package usu;

public class TesteCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Cliente clie = new Cliente(0);
      
      clie.verificarClient();     
      clie.clientList();
      System.out.println(clie.toString());      
      
      
    }
    
}
