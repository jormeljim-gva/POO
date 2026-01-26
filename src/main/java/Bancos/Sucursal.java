package Bancos;

public class Sucursal {
    String n_suc;
    Banco banco;

    public Sucursal(String n_suc, Banco n_ent) {
        this.n_suc = n_suc;
        this.banco = n_ent;
    }

    public String getN_suc() {
        return n_suc;
    }

    public void setN_suc(String n_suc) {
        this.n_suc = n_suc;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setN_ent(Banco banco) {
        this.banco = banco;
    }


}
