package atv2_agcviagens;

public class GerenciadorDePacotes {

    private final PacoteViagem pacoteRio, pacoteFortaleza, pacoteFloripa;

    public GerenciadorDePacotes() {
        Transporte tRio = new Transporte("ÔNIBUS", 20.0);
        Transporte tFortaleza = new Transporte("AVIÃO", 200.0);
        Transporte tFloripa = new Transporte("AVIÃO", 180.0);

        Hospedagem hRio = new Hospedagem("HOTEL COPACABANA 5 ESTRELAS - RJ", 100.0);
        Hospedagem hFortaleza = new Hospedagem("HOTEL PRAIA DO FUTURO - CE", 90.0);
        Hospedagem hFloripa = new Hospedagem("POUSADA RECANTO DOS PÁSSAROS - SC + TRANSPORTE ADICIONAL (IDA / VOLTA)", 75.80);

        pacoteRio = new PacoteViagem(tRio, hRio, "RIO DE JANEIRO", 7);
        pacoteFortaleza = new PacoteViagem(tFortaleza, hFortaleza, "FORTALEZA", 7);
        pacoteFloripa = new PacoteViagem(tFloripa, hFloripa, "FLORIANÓPOLIS", 7, 40.0);
    }

    public PacoteViagem getPacoteRio() {
        return pacoteRio;
    }

    public PacoteViagem getPacoteFortaleza() {
        return pacoteFortaleza;
    }

    public PacoteViagem getPacoteFloripa() {
        return pacoteFloripa;
    }

}
