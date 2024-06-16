package animais;

public class passaro  extends Animal {


    static int numeroPassaros;


    public passaro(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }


    @Override
    public void soar(){
        System.out.println("Piu Piu!");
    }
}
