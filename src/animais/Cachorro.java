package animais;

public class Cachorro extends  Animal {

   //atributos
   static int NumeroCachorros;
   private int tamanhoRabo;








   //construtor padrao


   //construtores
   public Cachorro(String nome, String cor, int altura, double peso, int tamanhoRabo, String estadoEspirito) {
       super(nome, cor, peso);
       this.nome = nome;
       this.cor = cor;
       this.altura = altura;
       this.peso = peso;
       this.tamanhoRabo = tamanhoRabo;
       this.estadoEspirito = estadoEspirito;

       NumeroCachorros ++;
   }


   //metodos


   public static int getNumeroCachorros() {
      return NumeroCachorros;
   }

   public static void setNumeroCachorros(int numeroCachorros) {
      Cachorro.NumeroCachorros = numeroCachorros;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getCor() {
      return cor;
   }

   public void setCor(String cor) {
      this.cor = cor;
   }

   public int getAltura() {
      return altura;
   }

   public void setAltura(int altura) {
      this.altura = altura;
   }

   public double getPeso() {
      return peso;
   }

   public void setPeso(double peso) {
      this.peso = peso;
   }

   public int getTamanhoRabo() {
      return tamanhoRabo;
   }

   public void setTamanhoRabo(int tamanhoRabo) {
      this.tamanhoRabo = tamanhoRabo;
   }

   public String getEstadoEspirito() {
      return estadoEspirito;
   }

   public void setEstadoEspirito(String estadoEspirito) {
      this.estadoEspirito = estadoEspirito;
   }









   public String pegar(){
      return "Bolinha";

   }

   public String interagir(String acao) {

      switch (acao){
      case "carinho" : this.estadoEspirito = " feliz";
      break;
      case "vai dormir!" : this.estadoEspirito = " bravo";
      break;
      case "pisar na patinha" : this.estadoEspirito = " triste";
      break;
      default: this.estadoEspirito = " neutro";
      break;

      }

      return estadoEspirito;

   }

   @Override
   public String toString() {
      return "Cachorro{" +
              "nome='" + nome + '\'' +
              '}';


   }
   @Override
   public void soar(){
      System.out.println("Au Au!");
   }

}
