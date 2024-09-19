package estruturas.filaQueue;

import estruturas.model.Site;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Historico {

    Queue<Site> sites;

    public Historico() {
        sites = new LinkedList<>();
    }

    public void executa() {
        Scanner sc = new Scanner(System.in);
        String continuar = "S";

        while (continuar.equals("S")) {
            Site inserido = new Site();
            for (Site s : sites) {
                System.out.println("\n" + s.getNome() + ":\n" + s.getUrl());
            }

            System.out.print("\nNOME DO SITE: ");
            inserido.setNome(sc.nextLine().toUpperCase());

            System.out.print("URL: ");
            inserido.setUrl(sc.nextLine());

            sites.add(inserido);

            if (sites.size() > 3) {
                Site removido = sites.remove();
                System.out.print("\nSITE: " + removido.getNome() + " FOI REMOVIDO.\n");
            }

            System.out.print("\nDESEJA PROSSEGUIR? ( S / N ): ");
            continuar = sc.nextLine().toUpperCase();
        }

    }

}
