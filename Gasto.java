public class Gasto {
    private String tipo;
    private String data;
    private double valor;
    private String formaPagamento;

    public Gasto(String tipo, String data, double valor, String formaPagamento) {
        this.tipo = tipo;
        this.data = data;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
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

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public String toString() {
        return "Gasto{" +
                "tipo='" + tipo + '\'' +
                ", data='" + data + '\'' +
                ", valor=" + valor +
                ", formaPagamento='" + formaPagamento + '\'' +
                '}';
    }
}
