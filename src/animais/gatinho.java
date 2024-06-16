package animais;

public class gatinho extends Animal {

    static int numeroGatos;

    public gatinho(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public void soar() {
        System.out.println("Miau Miau!");
    }


    @Override
    public String toString() {
        return "gatinho{" +
                "name='" + nome + '\'' +
                '}';
    }
}
