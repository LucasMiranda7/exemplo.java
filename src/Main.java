import animais.Cachorro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Word");

        //tipos primitivos

        //byte vai até -128 a 127
        //short vai até -32768 a 32767
        //char vai até 0 a 65535
        //int vai até -2b a 2b
        //long -9t a 9t

        int variavelInt = 2402846;
        System.out.println(variavelInt);

        byte variavelByte = 120;
        System.out.println(variavelByte);



        //Inicio do Project

         //construtor padrao
            Cachorro cachorro1 = new Cachorro();
            Cachorro cachorro2 = new Cachorro("Puppy", "Marrom", 25, 5.5,5, "nada" );

        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getPeso());



          cachorro1.latir();
          cachorro1.pegar();
          System.out.println("O cachorro pegou a " + cachorro1.pegar());

          System.out.println("O cachorro está" + cachorro1.interagir( "carinho"));
          System.out.println("O cachorro está" + cachorro1.interagir("vai dormir!"));
          System.out.println("O cachorro está" + cachorro1.interagir(" nada"));

        }


    }
