package Animales;

public class Gato extends Mamifero {
    public Gato(String nombre) {
        super(nombre);
    }

    public void perseguirUnOvillo(){
        System.out.println("Perseguir un ovillo");
    }

    @Override
    public void comuincarse() {
        System.out.println("Miau");
    }

    @Override
    public void moverse() {
        System.out.println("Respiro aire por mis pulmones");
    }
}
