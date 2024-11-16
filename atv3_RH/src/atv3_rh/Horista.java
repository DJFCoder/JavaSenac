package atv3_rh;

public class Horista extends Funcionario {

    private Double valorHora, horas, totalReceber, aumento;

    public Horista(Double valorHora, Double horas, String nome, String cpf, String endereco, String telefone, String setor) {
        super(nome, cpf, endereco, telefone, setor);
        this.valorHora = valorHora;
        this.horas = horas;
        totalReceber = 0.0;
        aumento = 0.0;
    }

    public Horista() {

    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getHoras() {
        return horas;
    }

    public void setHoras(Double horas) {
        this.horas = horas;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getTotalReceber() {
        return totalReceber;
    }

    public void setTotalReceber(Double totalReceber) {
        this.totalReceber = totalReceber;
    }

    public Double getAumento() {
        return aumento;
    }

    public void setAumento(Double aumento) {
        this.aumento = aumento;
    }

    private Double calcularTotalReceber() {
        Double total = (getHoras() * getValorHora());
        setTotalReceber(total);
        return getTotalReceber();
    }

    @Override
    public Double calcularAumento(Double aumento) {
        setAumento(aumento);
        Double somaAumento = getAumento() + calcularTotalReceber();
        setTotalReceber(somaAumento);
        return getTotalReceber();
    }

    @Override
    public String toString() {
        calcularAumento(aumento);
        return "NOME: " + getNome()
                + "\nSETOR: " + getSetor()
                + "\nHORAS TRABALHADAS: " + getHoras()
                + "\nVALOR POR HORA: R$" + String.format("%.2f", getValorHora())
                + "\nVALOR A RECEBER: R$" + String.format("%.2f", getTotalReceber())
                + "\nCPF: " + getCpf()
                + "\nTELEFONE: " + getTelefone()
                + "\nENDEREÇO: " + getEndereco();
    }

}
