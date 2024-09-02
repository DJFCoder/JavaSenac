package atv2_agcviagens;

public class Hospedagem {

    private String descricao;
    private Double valorDiaria;

    public Hospedagem(String descricao, Double valorDiaria) {
        this.descricao = descricao;
        this.valorDiaria = valorDiaria;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValorDiaria() {
        return valorDiaria;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

}
