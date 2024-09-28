package atv4_contabil.module;

import java.util.Scanner;

public class PIS extends Imposto {

    private Double debito, credito;
    private final Double pis = 0.0165;

    public PIS() {
        setDescricao("PIS: ");
    }

    public PIS(Double value) {
        setValorCalculado(value);
        setDescricao("PIS: ");
    }

    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }

    public Double getDebito() {
        return debito;
    }

    public void setDebito(Double debito) {
        this.debito = debito;
    }

    @Override
    public Double calcImposto(Double aliquota) {
        aliquota = pis;
        Double value = (getDebito() - getCredito()) * aliquota;
        setValorCalculado(value);
        return getValorCalculado();
    }

    @Override
    public void setValue() {
        Scanner sc = new Scanner(System.in);

        System.out.print("INSIRA O DÉBITO: ");
        setDebito(sc.nextDouble());

        System.out.print("INSIRA O CRÉDITO: ");
        setCredito(sc.nextDouble());

        calcImposto(pis);
    }

    @Override
    public String toString() {
        return getDescricao() + getValorCalculado();
    }

}
