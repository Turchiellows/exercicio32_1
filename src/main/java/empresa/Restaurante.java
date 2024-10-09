// PACOTES
package empresa;

// IMPORTAÇÕES
import java.util.Scanner;

public class Restaurante extends Empresa {

   // ATTRIBUTOS ===============================================================
   private String tipoComida;
   private double valorMedio;

   // CONSTRUTORES =============================================================
   public Restaurante() {
      this("Empresa genérica", "Rua sem número", "Florianópolis", "SC", "00000-000", "(000)0-0000-0000", "Natural", 0.0);
   }

   public Restaurante(String nome, String rua, String cidade, String estado, String cep, String fone, String tipoComida, double valorMedio) {
      super(nome, rua, cidade, estado, cep, fone);
      this.tipoComida = tipoComida;
      this.valorMedio = valorMedio;
   }

   // GETTERS AND SETTERS ======================================================
   public String getTipoComida() {
      return tipoComida;
   }

   public double getValorMedio() {
      return valorMedio;
   }

   public void setTipoComida(String tipoComida) {
      this.tipoComida = tipoComida;
   }

   public void setValorMedio(double valorMedio) {
      if (valorMedio < 0) {
         valorMedio = 0.0;
      }
      this.valorMedio = valorMedio;
   }

   // METODOS ==================================================================
   // INSERIR DADOS
   public void cadastrarComida() {
      super.cadastrarEmpresa();

      System.out.print("Informe o nome da comida: ");
      setTipoComida(sc.nextLine());

      System.out.print("Informe o valor da: ");
      setValorMedio(sc.nextDouble());
   }

   // MOSTRAR O RESTAURANTE
   public String mostrarRestaurante() {
      return super.mostrarEmpresa() + "\nCOMIDA   : " + getTipoComida() + "\nVALOR    : " + getValorMedio();
   }

}
