public class Ganho {
    private String tipo;
    private String data;
    private double valor;

    public Ganho(String tipo, String data, double valor) {
        this.tipo = tipo;
        this.data = data;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Ganho{" +
                "tipo='" + tipo + '\'' +
                ", data='" + data + '\'' +
                ", valor=" + valor +
                '}';
    }
}
