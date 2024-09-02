package atv2_agcviagens;

import java.util.Scanner;

public class Venda {

    private String cliente;
    private String formaPg;
    private PacoteViagem pctEscolhido;
    private GerenciadorDePacotes pcts;

    Venda(String cliente, String formaPg, PacoteViagem pctEscolhido) {
        this.cliente = cliente;
        this.formaPg = formaPg;
        this.pctEscolhido = pctEscolhido;
    }

    Venda() {
        this.pcts = new GerenciadorDePacotes();
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFormaPg() {
        return formaPg;
    }

    public void setFormaPg(String formaPg) {
        this.formaPg = formaPg;
    }

    public GerenciadorDePacotes getPcts() {
        return pcts;
    }

    public void setPcts(GerenciadorDePacotes pcts) {
        this.pcts = pcts;
    }

    public PacoteViagem getPctEscolhido() {
        return pctEscolhido;
    }

    public void setPctEscolhido(PacoteViagem pctEscolhido) {
        this.pctEscolhido = pctEscolhido;
    }

    public Double converterMoeda(Double totalPacote, Double cotacaoMoeda) {
        Double conversor = totalPacote * cotacaoMoeda;
        return conversor;
    }

    public void exibirVendas() {
        if (getCliente() == null) {
            System.out.println("NENHUMA VENDA CADASTRADA.\n");
        } else {
            System.out.println("CLIENTE: " + getCliente() + "\n"
                    + "FORMA DE PAGAMENTO: " + getFormaPg() + "\n"
                    + "PACOTE ESCOLHIDO: " + getPctEscolhido().getDestino());
        }
    }

    public void exibirPacotes() {
        System.out.println("PACOTE 1: " + pcts.getPacoteRio().getDestino() + "\n"
                + "TRANSPORTE: " + pcts.getPacoteRio().getT().getTipo() + "\n"
                + "HOSPEDAGEM: " + pcts.getPacoteRio().getH().getDescricao() + "\n"
                + "VALOR: $" + pcts.getPacoteRio().calcularTotalHospedagem() + "\n");

        System.out.println("PACOTE 2: " + pcts.getPacoteFortaleza().getDestino() + "\n"
                + "TRANSPORTE: " + pcts.getPacoteFortaleza().getT().getTipo() + "\n"
                + "HOSPEDAGEM: " + pcts.getPacoteFortaleza().getH().getDescricao() + "\n"
                + "VALOR: $" + pcts.getPacoteFortaleza().calcularTotalHospedagem() + "\n");

        System.out.println("PACOTE 3: " + pcts.getPacoteFloripa().getDestino() + "\n"
                + "TRANSPORTE: " + pcts.getPacoteFloripa().getT().getTipo() + "\n"
                + "HOSPEDAGEM: " + pcts.getPacoteFloripa().getH().getDescricao() + "\n"
                + "VALOR: $" + pcts.getPacoteFloripa().calcularTotalHospedagem() + "\n");
    }

    public PacoteViagem escolherPacote(int escolhaCliente) {
        while (escolhaCliente < 1 || escolhaCliente > 3) {
            Scanner sc = new Scanner(System.in);
            System.out.print("\nOPÇÃO INVÁLIDA! DIGITE NOVAMENTE:");
            escolhaCliente = sc.nextInt();
        }

        switch (escolhaCliente) {
            case 1:
                return pcts.getPacoteRio();
            case 2:
                return pcts.getPacoteFortaleza();
            case 3:
                return pcts.getPacoteFloripa();
            default:
                System.err.println("ERRO.");
                return null;
        }
    }

}
