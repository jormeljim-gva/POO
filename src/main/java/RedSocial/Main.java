package RedSocial;

public class Main {
    RedSocial x = new RedSocial("X");
    Usuario pepe = new Usuario("Pepe", x);
    Usuario maria = new Usuario("María", x);
    Mensaje m1 = new Mensaje("88", pepe, "hoy", x);
    Mensaje m2 = new Mensaje("99", maria, "hoy", x);
}
