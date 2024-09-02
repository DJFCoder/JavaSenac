package atv2_agcviagens;

public class PacoteViagem {

    private Transporte t;
    private Hospedagem h;
    private String destino;
    private Integer qntDias;
    private Double taxasAdicionais;

    PacoteViagem(Transporte t, Hospedagem h, String destino, Integer qntDias) {
        this.t = t;
        this.h = h;
        this.destino = destino;
        this.qntDias = qntDias;
    }

    PacoteViagem(Transporte t, Hospedagem h, String destino, Integer qntDias, Double taxasAdicionais) {
        this.t = t;
        this.h = h;
        this.destino = destino;
        this.qntDias = qntDias;
        this.taxasAdicionais = taxasAdicionais;
    }

    public Transporte getT() {
        return t;
    }

    public void setT(Transporte t) {
        this.t = t;
    }

    public Hospedagem getH() {
        return h;
    }

    public void setH(Hospedagem h) {
        this.h = h;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Integer getQntDias() {
        return qntDias;
    }

    public void setQntDias(Integer qntDias) {
        this.qntDias = qntDias;
    }

    public Double calcularTotalHospedagem() {
        if (taxasAdicionais == null) {
            Double total = t.getValor() + h.getValorDiaria() * qntDias;
            return total;
        } else {
            Double total = taxasAdicionais + (t.getValor() + h.getValorDiaria() * qntDias);
            return total;
        }
    }

    public Double calcularLucro(double margem) {
        Double valorBase = calcularTotalHospedagem();
        Double total = valorBase + (valorBase * margem / 100);
        return total;
    }

    public Double calcularTotalPacote(double margem) {
        Double total = calcularLucro(margem) + calcularTotalHospedagem();
        return total;
    }

}
