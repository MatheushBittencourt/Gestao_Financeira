import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Elabora um relatório mensal referente ao mês e ano corrente.
        RelatorioMensal relatorio = new RelatorioMensal(4, 2023);
        int opcao = 0;

        do {
            // Apresenta o menu de opções
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar Gasto");
            System.out.println("2 - Adicionar Ganho");
            System.out.println("3 - Calcular Gasto Total");
            System.out.println("4 - Calcular Ganho Total");
            System.out.println("5 - Calcular Saldo");
            System.out.println("6 - Exibir Relatório");
            System.out.println("0 - Sair");

            // Leia a opção selecionada pelo usuário
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    // Leia os dados do gasto a ser inserido
                    System.out.println("Tipo do Gasto:");
                    String tipoGasto = sc.next();
                    System.out.println("Data do Gasto (dd/mm/aaaa):");
                    String dataGasto = sc.next();
                    System.out.println("Valor do Gasto:");
                    double valorGasto = sc.nextDouble();
                    System.out.println("Forma de Pagamento do Gasto:");
                    String formaPagtoGasto = sc.next();

                    // Cria um objeto Gasto com os dados lidos e adicione-o ao relatório mensal
                    Gasto gasto = new Gasto(tipoGasto, dataGasto, valorGasto, formaPagtoGasto);
                    relatorio.adicionarGasto(gasto);
                    System.out.println("Gasto adicionado com sucesso.");
                    break;
                case 2:
                    // Leia os dados do ganho a ser inserido
                    System.out.println("Tipo do Ganho:");
                    String tipoGanho = sc.next();
                    System.out.println("Data do Ganho (dd/mm/aaaa):");
                    String dataGanho = sc.next();
                    System.out.println("Valor do Ganho:");
                    double valorGanho = sc.nextDouble();

                    // Crie um objeto Ganho com os dados lidos e adicione-o ao relatório mensal
                    Ganho ganho = new Ganho(tipoGanho, dataGanho, valorGanho);
                    relatorio.adicionarGanho(ganho);
                    System.out.println("Ganho adicionado com sucesso.");
                    break;
                case 3:
                    // Apresenta o valor total dos gastos
                    System.out.println("Valor total dos gastos: " + relatorio.calcularGastoTotal());
                    break;
                case 4:
                    // Apresenta o valor total doss ganhos
                    System.out.println("Valor total dos ganhos: " + relatorio.calcularGanhoTotal());
                    break;
                case 5:
                    // Apresenta o saldo do mês
                    System.out.println("Saldo do mês: " + relatorio.calcularSaldo());
                    break;
                case 6:
                    // Apresenta o relatório completo do mês
                    System.out.println(relatorio.toString());
                    break;
                case 0:
                    // Encerra o programa
                    System.out.println("Desligando o programa.");
                    break;
                default:
                System.out.println("Opção inválida. Digite novamente.");
                break;
                }
                } while (opcao != 0);
                  sc.close();
            }
        }