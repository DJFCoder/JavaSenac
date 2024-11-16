package estruturas.pilhaStack;

import estruturas.model.Site;
import java.util.Scanner;
import java.util.Stack;

public class Navegacao {

    Stack<Site> sites;

    public Navegacao() {
        sites = new Stack<>();
    }

    public void executa() {
        Scanner sc = new Scanner(System.in);
        Integer opcao = -1;

        while (!opcao.equals(0)) {
            System.out.print("| 1 - DIGITE UM SITE | 2 - VOLTAR | 0 - FECHAR |\n"
                    + "\nESCOLHA UMA OPÇÃO: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    Site novoSite = new Site();

                    System.out.print("\nNOME DO SITE: ");
                    novoSite.setNome(sc.nextLine());

                    System.out.print("URL: ");
                    novoSite.setUrl(sc.nextLine());

                    sites.push(novoSite);
                    System.out.println("\nACESSANDO " + sites.peek().getUrl() + "\n");

                    break;

                case 2:
                    if (!sites.empty()) {
                        Site siteRemovido, siteAtual;
                        siteRemovido = sites.pop();
                        System.out.print("\nSAINDO DE: " + siteRemovido.getUrl() + "\n");
                                                
                        if (!sites.empty()) {
                            siteAtual = sites.peek();
                            System.out.println("\nACESSANDO " + siteAtual.getNome() + ": " + siteAtual.getUrl() + "\n");
                                                    }
                    } else {
                        System.out.println("\nHISTÓRICO VAZIO.\n");
                    }
                    break;

                case 0:
                    System.out.println("\nFECHANDO...\n");
                    break;
            }
        }
    }

}
