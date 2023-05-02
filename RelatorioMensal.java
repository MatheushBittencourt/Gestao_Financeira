import java.util.ArrayList;

public class RelatorioMensal {

    private int mes;
    private int ano;
    private ArrayList<Gasto> listaGastos;
    private ArrayList<Ganho> listaGanhos;

    public RelatorioMensal(int mes, int ano) {
        this.mes = mes;
        this.ano = ano;
        this.listaGastos = new ArrayList<>();
        this.listaGanhos = new ArrayList<>();
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public ArrayList<Gasto> getListaGastos() {
        return listaGastos;
    }

    public void setListaGastos(ArrayList<Gasto> listaGastos) {
        this.listaGastos = listaGastos;
    }

    public ArrayList<Ganho> getListaGanhos() {
        return listaGanhos;
    }

    public void setListaGanhos(ArrayList<Ganho> listaGanhos) {
        this.listaGanhos = listaGanhos;
    }

    public void adicionarGasto(Gasto gasto) {
        this.listaGastos.add(gasto);
    }

    public void adicionarGanho(Ganho ganho) {
        this.listaGanhos.add(ganho);
    }

    public double calcularGastoTotal() {
        double total = 0;
        for (Gasto gasto : this.listaGastos) {
            total += gasto.getValor();
        }
        return total;
    }

    public double calcularGanhoTotal() {
        double total = 0;
        for (Ganho ganho : this.listaGanhos) {
            total += ganho.getValor();
        }
        return total;
    }

    public double calcularSaldo() {
        return calcularGanhoTotal() - calcularGastoTotal();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Relatório mensal - ");
        sb.append(this.mes);
        sb.append("/");
        sb.append(this.ano);
        sb.append("\n");
        sb.append("Ganhos:\n");
        for (Ganho ganho : this.listaGanhos) {
            sb.append(ganho.toString());
            sb.append("\n");
        }
        sb.append("Total de ganhos: R$");
        sb.append(calcularGanhoTotal());
        sb.append("\n");
        sb.append("Gastos:\n");
        for (Gasto gasto : this.listaGastos) {
            sb.append(gasto.toString());
            sb.append("\n");
        }
        sb.append("Total de gastos: R$");
        sb.append(calcularGastoTotal());
        sb.append("\n");
        sb.append("Saldo do mês: R$");
        sb.append(calcularSaldo());
        sb.append("\n");
        return sb.toString();
    }

}
