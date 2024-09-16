package src.ejercicios;

public class Carro {

    String modelo;
    String marca;

    public static void main (String[] args) {

        Carro c = new Carro();

        c.modelo = "BMW X7 M60i 2024";
        c.marca = "BMW";

        System.out.println("Este es el modelo " + c.modelo);

    }
}
