package atv4_contabil.module;

public abstract class Imposto {

    private String descricao;
    private Double valorCalculado;

    public Imposto() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorCalculado() {
        return valorCalculado;
    }

    public void setValorCalculado(Double valorCalculado) {
        this.valorCalculado = valorCalculado;
    }

    public abstract Double calcImposto(Double aliquota);

    public abstract void setValue();

}
