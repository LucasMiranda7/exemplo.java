package animais;

public class Animal {

    //atributos
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoEspirito;

    //construtor


    public Animal(String nome, String cor, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }

    //metodos
    protected void comer(){}

    protected void dormir(){}

    public void soar(){
        System.out.println("cri cri!");
    }

}
