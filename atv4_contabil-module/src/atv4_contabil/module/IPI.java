package atv4_contabil.module;

import java.util.Scanner;

public class IPI extends Imposto {
    
    private Double produtoValue, frete, seguro, outrasDespesas, aliquota;
    
    public IPI() {
        setDescricao("IPI: ");
    }
    
    public IPI(Double value1) {
        setValorCalculado(value1);
        setDescricao("IPI: ");
    }

    public Double getProdutoValue() {
        return produtoValue;
    }

    public void setProdutoValue(Double produtoValue) {
        this.produtoValue = produtoValue;
    }

    public Double getFrete() {
        return frete;
    }

    public void setFrete(Double frete) {
        this.frete = frete;
    }

    public Double getSeguro() {
        return seguro;
    }

    public void setSeguro(Double seguro) {
        this.seguro = seguro;
    }

    public Double getOutrasDespesas() {
        return outrasDespesas;
    }

    public void setOutrasDespesas(Double outrasDespesas) {
        this.outrasDespesas = outrasDespesas;
    }

    public Double getAliquota() {
        return aliquota;
    }

    public void setAliquota(Double aliquota) {
        this.aliquota = aliquota;
    }
        
    @Override
    public Double calcImposto(Double aliquota) {
        Double aliquotaValue = aliquota / 100;        
        Double value = (getProdutoValue() + getFrete() + getSeguro() 
                +getOutrasDespesas()) * aliquotaValue;
        setValorCalculado(value);
        return getValorCalculado();    
    }
    
    @Override
    public void setValue() {
        Scanner sc = new Scanner(System.in);

        System.out.print("INSIRA O VALOR DO PRODUTO: R$");
        setProdutoValue(sc.nextDouble());

        System.out.print("INSIRA O FRETE: R$");
        setFrete(sc.nextDouble());
        
        System.out.print("INSIRA O VALOR DO SEGURO: R$");
        setSeguro(sc.nextDouble());
        
        System.out.print("INSIRA OUTRAS DESPESAS: R$");
        setOutrasDespesas(sc.nextDouble());
        
        System.out.print("INSIRA A ALIQUOTA: %");
        setAliquota(sc.nextDouble());
        
        calcImposto(getAliquota());
    }

    @Override
    public String toString() {
        return getDescricao() + getValorCalculado();
    }
      
}
