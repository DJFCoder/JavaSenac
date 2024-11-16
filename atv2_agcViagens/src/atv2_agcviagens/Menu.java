package atv2_agcviagens;

import java.util.Scanner;

public class Menu {

    private Scanner sc;
    private Venda v;

    public Menu() {
        this.sc = new Scanner(System.in);
        this.v = new Venda();
    }

    public void exibirMenu() {
        int opcao = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("-- CADASTRA E CALCULA VENDA DE PACOTES DE VIAGEM --");
        System.out.print("== ATENÇÃO ESTE PROGRAMA CADASTRA APENAS UMA VENDA POR VEZ! ==\n");
        while (opcao != 5) {
            System.out.print("\nESCOLHA UMA OPÇÃO:\n\n"
                    + "||=============================================================================================================||\n"
                    + "|| ( 1 ) EXIBIR PACOTES || ( 2 ) CADASTRAR VENDA || ( 3 ) MOSTRAR VENDAS || ( 4 ) CALCULAR TOTAL || ( 5 ) SAIR ||\n"
                    + "||=============================================================================================================||\n"
                    + "\nOPÇÃO SELECIONADA: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    exibirPacotes();
                    break;
                case 2:
                    cadastrarVenda();
                    break;
                case 3:
                    mostrarVendas();
                    break;
                case 4:
                    calcularTotal();
                    break;
                case 5:
                    System.out.println("ENCERRANDO...\n");
                    break;
                default:
                    System.err.println("OPÇÃO INVÁLIDA!");
                    break;
            }
        }
    }

    public void exibirPacotes() {
        v.exibirPacotes();
    }

    public void cadastrarVenda() {
        if (this.v.getCliente() != null) {
            System.out.println("CLIENTE JÁ CADASTRADO!");
            System.out.print("\n== ATENÇÃO ESTE PROGRAMA CADASTRA APENAS UMA VENDA POR VEZ! ==\n\n");
        } else {
            System.out.print("\nINSIRA O NOME DO CLIENTE: ");
            v.setCliente(sc.nextLine());

            System.out.print("\nFORMA DE PAGAMENTO - ESPÉCIE / DÉBITO / CRÉDITO\n"
                    + "(E / D / C): ");
            v.setFormaPg(sc.nextLine());

            System.out.println("");
            v.exibirPacotes();
            System.out.print("PACOTE ESCOLHIDO: ");
            int escolhaCliente = sc.nextInt();
            v.escolherPacote(escolhaCliente);

            this.v = new Venda(v.getCliente(), v.getFormaPg(), v.escolherPacote(escolhaCliente));
            System.out.println("VENDA CADASTRADA COM SUCESSO!\n");
        }
    }

    public void mostrarVendas() {
        v.exibirVendas();
        System.out.println("");
    }

    public void calcularTotal() {
        v.exibirVendas();
        Double totalSemLucro = v.getPctEscolhido().calcularTotalHospedagem();
        System.out.println("TOTAL DO PACOTE: $" + totalSemLucro);

        System.out.print("\nINFORME UMA MARGEM DE LUCRO: %");
        Double margemLucro = sc.nextDouble();
        Double totalComLucro = v.getPctEscolhido().calcularTotalPacote(margemLucro);

        System.out.print("\nINFORME O VALOR DA MOEDA PARA A CONVERSÃO EM DOLAR: ");
        Double moedaInformada = sc.nextDouble();
        Double valorConvertido = v.converterMoeda(totalComLucro, moedaInformada);
        System.out.print("\n||==================================||\n"
                + "|| TOTAL A PAGAR EM DOLAR: $" + totalComLucro + "  ||\n"
                + "|| TOTAL A PAGAR EM REAIS: R$" + valorConvertido + " ||"
                + "\n||==================================||\n");
    }
}
