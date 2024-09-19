package estruturas.listaList;

import estruturas.model.Site;
import java.util.ArrayList;
import java.util.List;

public class Favoritos {

    List<Site> sites;

    public Favoritos() {
        sites = new ArrayList<>();
    }

    public void mostrarLista() {
        System.out.println("=========== Lista de Favoritos ===========");
        for (Site s : sites) {
            System.out.println(s.getNome() + s.getUrl());
        }
    }

    public void executa() {
        sites.add(new Site("Site 1: ", "www.um.com"));
        sites.add(new Site("Site 2: ", "www.dois.com"));
        sites.add(new Site("Site 3: ", "www.tres.com"));
        mostrarLista();

        sites.remove(2);
        sites.add(new Site("Site 4: ", "www.quatro.com"));
        mostrarLista();
    }

}
