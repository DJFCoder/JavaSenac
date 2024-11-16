package atv2_agcviagens;

public class Transporte {

    private String tipo;
    private Double valor;

    public Transporte(String tipo, Double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
    
    public String getTipo() {
        return tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
