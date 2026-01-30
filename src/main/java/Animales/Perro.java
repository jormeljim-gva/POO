package Animales;

public class Perro extends Mamifero {
    Perro(String nombre){
        super(nombre);
    }

    public void traerZapatillas(){
        System.out.println("Toma amo tus zapatillas");
    }

    @Override
    public void comuincarse() {
        System.out.println("guau");
    }
}
