// PACKAGE
package principal;

// IMPORTS
import empresa.Empresa;
import empresa.Restaurante;
import java.util.Scanner;

public class Principal {
   public static void main(String[] args) {
      // INSTANTIATE
      Scanner sc = new Scanner(System.in);
      Restaurante meu = new Restaurante();
      
      meu.cadastrarComida();
      
      System.out.println("======================================================");
      System.out.println("\n\n" + meu.mostrarRestaurante());
      
      
   }
}
