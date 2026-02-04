package EscuderiaF1;

public class Coche{
    private int numero;
    private Piloto piloto;
    private Mecanico mecanico;

    public Coche(int numero, Piloto piloto, Mecanico mecanico) {
        this.numero = numero;
        this.piloto = piloto;
        this.mecanico = mecanico;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void mostrarInfo(){
        System.out.println("Coche: " + numero);
        piloto.mostrarInfo();
        mecanico.mostrarInfo();
    }
}
