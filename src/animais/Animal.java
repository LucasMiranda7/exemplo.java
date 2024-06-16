package animais;

public abstract class Animal{

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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getEstadoEspirito() {
        return estadoEspirito;
    }

    public void setEstadoEspirito(String estadoEspirito) {
        this.estadoEspirito = estadoEspirito;
    }

    //metodos
    protected void comer(){}

    protected void dormir(){}

    public abstract void soar();

}
