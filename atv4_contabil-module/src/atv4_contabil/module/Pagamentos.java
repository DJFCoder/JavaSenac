package atv4_contabil.module;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pagamentos {

    private List<Imposto> impostos;
    private IPI ipi;
    private PIS pis;

    public Pagamentos() {
        impostos = new ArrayList<>();
        ipi = new IPI();
        pis = new PIS();
    }

    public void adicionar(Imposto i) {
        impostos.add(i);
    }

    public void listarPg() {
        for (Imposto i : impostos) {
            System.out.println(i + "\n===========");
        }
    }

    public void scanPg() {
        Scanner sc = new Scanner(System.in);
        String continuar = "s";
        Integer escolha;

        while (continuar.toUpperCase().equals("S")) {
            System.out.print("(1) PIS | (2) IPI\n\nESCOLHA: ");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1 -> {
                    System.out.println();
                    pis.setValue();
                    adicionar(new PIS(pis.getValorCalculado()));
                    sc.nextLine();
                }

                case 2 -> {
                    System.out.println();
                    ipi.setValue();
                    adicionar(new IPI(ipi.getValorCalculado()));
                    sc.nextLine();
                }

                default -> {
                    System.err.println("INVÁLIDO");
                }
            }
            System.out.print("\nCONTINUAR? (S / N): ");
            continuar = sc.nextLine();
            System.out.println();
        }
        System.out.print("===LISTA===\n");
        listarPg();
    }

}