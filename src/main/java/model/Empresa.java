// PACOTES
package model;

// IMPORTAÇÕES
import java.util.Scanner;

public class Empresa {

   // ATTIBUTOS ================================================================
   private String nome;
   private String rua;
   private String cidade;
   private String estado;
   private String cep;
   private String fone;

   // CONSTRUTORES =============================================================
   public Empresa() {
      this("Empresa genérica", "Rua sem número", "Florianópolis", "SC", "00000-000", "(000)0-0000-0000");
   }

   public Empresa(String nome, String rua, String cidade, String estado, String cep, String fone) {
      this.nome = nome;
      this.rua = rua;
      this.cidade = cidade;
      this.estado = estado;
      this.cep = cep;
      this.fone = fone;
   }

   // INSTANCIAR ===============================================================
   Scanner sc = new Scanner(System.in);

   // GETTER AND SETTER
   public String getNome() {
      return nome;
   }

   public String getRua() {
      return rua;
   }

   public String getCidade() {
      return cidade;
   }

   public String getEstado() {
      return estado;
   }

   public String getCep() {
      return cep;
   }

   public String getFone() {
      return fone;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public void setRua(String rua) {
      this.rua = rua;
   }

   public void setCidade(String cidade) {
      this.cidade = cidade;
   }

   public void setEstado(String estado) {
      this.estado = estado;
   }

   public void setCep(String cep) {
      this.cep = cep;
   }

   public void setFone(String fone) {
      this.fone = fone;
   }

   // METODOS ==================================================================
   // INSERIR DADOS
   public void cadastrarEmpresa() {
      System.out.print("Informe o nome da empresa: ");
      setNome(sc.nextLine());

      System.out.print("Informe a rua da empresa: ");
      setRua(sc.nextLine());

      System.out.print("Informe a cidade da empresa: ");
      setCidade(sc.nextLine());

      System.out.print("Informe o estado empresa: ");
      setEstado(sc.nextLine());

      System.out.print("Informe o CEP da empresa: ");
      setCep(sc.nextLine());

      System.out.print("Informe o telefone da empresa: ");
      setFone(sc.nextLine());
   }

   // MOSTRAR A EMPRESA
   public String mostrarEmpresa() {
      return "NOME     : " + getNome() + "\nENDEREÇO : " + getRua() + ", " + getCidade() + ", " + getEstado() + ", " + getCep() + "\nTELEFONE : " + getFone();
   }

}
