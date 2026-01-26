public class MainAire {
    public static void main(String[] args) {
        Aire aa = new Aire("AC", 30, 10, 25);
        System.out.println(aa);
    }
}
class Aire {
    String nombre;
    int maxima;
    int minima;
    int temperatura;

    public Aire(String nombre, int maxima, int minima, int temperatura) {
        this.nombre = nombre;
        this.maxima = maxima;
        this.minima = minima;
        this.temperatura = temperatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMaxima() {
        return maxima;
    }

    public int getMinima() {
        return minima;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        if (temperatura <= maxima && temperatura >= minima)
            this.temperatura = temperatura;
    }

    public void subir(){
        if (!(temperatura + 1 > maxima))
            this.temperatura++;
    }

    public void bajar(){
        if (!(temperatura - 1 < minima))
            this.temperatura--;
    }

    @Override
    public String toString(){
        return "" + this.temperatura;
    }
}
