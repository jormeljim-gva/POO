class Odenador{

    private String marca;
    private String RAM;
    private String procesador;
    private String discoDuro;

    public Odenador(String marca, String RAM, String procesador, String discoDuro) {
        this.marca = marca;
        this.RAM = RAM;
        this.procesador = procesador;
        this.discoDuro = discoDuro;
    }

    public String getMarca() {
        return marca;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }


}
public class MainOrdenador {
    public static void main(String[] args) {

    }
}