package atv3_rh;

public class Assalariado extends Funcionario {

    private Double salario, aumento;

    public Assalariado(Double salario, String nome, String cpf, String endereco, String telefone, String setor) {
        super(nome, cpf, endereco, telefone, setor);
        this.salario = salario;
        aumento = 0.0;
    }

    public Assalariado() {

    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getAumento() {
        return aumento;
    }

    public void setAumento(Double aumento) {
        this.aumento = aumento;
    }

    @Override
    public Double calcularAumento(Double aumento) {
        Double somaAumento = aumento + getSalario();
        setSalario(somaAumento);
        return getSalario();
    }

    @Override
    public String toString() {
        return "NOME: " + getNome()
                + "\nSETOR: " + getSetor()
                + "\nSALARIO: R$" + String.format("%.2f", getSalario())
                + "\nCPF: " + getCpf()
                + "\nTELEFONE: " + getTelefone()
                + "\nENDEREÇO: " + getEndereco();
    }

}
