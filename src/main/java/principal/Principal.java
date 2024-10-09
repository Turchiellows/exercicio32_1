// PACOTES
package principal;

// IMPORTAÇÕES
import empresa.Restaurante;

public class Principal {

   public static void main(String[] args) {
      // INSTANCIAR
      Restaurante meu = new Restaurante();

      // CADASTRAR
      meu.cadastrarComida();

      // EXIBIR
      System.out.println("\n\n======================================================");
      System.out.println(meu.mostrarRestaurante());

   }
}
