public class Compra {
    private double valor;
    private String Descripcion;

    public Compra(double valor, String descripcion) {
        this.valor = valor;
        Descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }


    public String getDescripcion() {
        return Descripcion;
    }

    @Override
    public String toString() {
        return "Compra: " + "valor=" + valor +
                ", Descripcion='" + Descripcion;
    }
}
