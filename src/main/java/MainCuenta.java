class Cuenta {
    String titular;
    double cantidad;

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(int cantidad){
        if (cantidad > 0)
            this.cantidad += cantidad;
    }

    public void retirar(int cantidad){
        if (this.cantidad >= cantidad)
            this.cantidad -= cantidad;
    }

    @Override
    public String toString(){
        return this.titular + " - " + this.titular;
    }
}
public class MainCuenta {
    public static void main(String[] args) {
        Cuenta cuentaPepe = new Cuenta("Pepe", 100);
        cuentaPepe.ingresar(200);
        cuentaPepe.retirar(100);
        System.out.println(cuentaPepe);
        Cuenta cuentaMaria = new Cuenta("María");
        cuentaMaria.retirar(200);
        cuentaMaria.ingresar(500);
        cuentaMaria.retirar(100);
        System.out.println(cuentaPepe);

    }
}