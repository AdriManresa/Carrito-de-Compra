import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> listadeCompras;

    public TarjetaDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listadeCompras = new ArrayList<>();
    }

    public boolean lanzarCompra(Compra compra) {
        if (compra.getValor() <= this.saldo) {
            this.saldo -= compra.getValor();
            this.listadeCompras.add(compra);
            return true;
        }
        return false;
    }


    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaDeCompras() {
        return listadeCompras;
    }

}
