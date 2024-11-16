package atv3_rh;

import java.util.Scanner;

public class Menu {

    Scanner sc;
    private Horista h;
    private Assalariado a;
    private Funcionario[] f;
    private int cont;

    public Menu() {
        sc = new Scanner(System.in);
        h = new Horista();
        a = new Assalariado();
        cont = 0;
        f = new Funcionario[10];
    }

    public void exibirMenu() {
        int opcao = 0;

        System.out.println("-- RH: CADASTRA FUNCIONARIOS, MOSTRA DADOS DE PAGAMENTO E APLICA AUMENTO --");
        while (opcao != 4) {
            System.out.print("\nESCOLHA UMA OPÇÃO:\n\n"
                    + "||========================================================================================================||\n"
                    + "|| ( 1 ) INFORMAR FUNCIONARIOS || ( 2 ) MOSTRAR DADOS DE PAGAMENTO || ( 3 ) APLICAR AUMENTO || ( 4 ) SAIR ||\n"
                    + "||========================================================================================================||\n"
                    + "\nOPÇÃO SELECIONADA: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    informarFuncionarios();
                    break;
                case 2:
                    mostrarDadosPg();
                    break;
                case 3:
                    aplicarAumento();
                    break;
                case 4:
                    System.out.println("ENCERRANDO...\n");
                    sc.close();
                    break;
                default:
                    System.err.println("OPÇÃO INVÁLIDA!");
                    break;
            }
        }
    }

    public void informarFuncionarios() {

        String continuar = "S";

        while (continuar.equals("S")) {

            System.out.println("\n-- O SISTEMA ACEITA APENAS 10 FUNCIONÁRIOS --");

            if (cont < 10) {
                System.out.print("\nASSALARIADO OU HORISTA? ( A / H ): ");
                String tipoFuncionario = sc.nextLine().toUpperCase();
                if (tipoFuncionario.equals("A")) {
                    System.out.print("\nINFORME O NOME: ");
                    String nome = sc.nextLine().toUpperCase();

                    System.out.print("\nINFORME O SETOR: ");
                    String setor = sc.nextLine().toUpperCase();

                    System.out.print("\nINFORME O SALÁRIO: ");
                    Double salario = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("\nINFORME O CPF: ");
                    String cpf = sc.nextLine();

                    System.out.print("\nINFORME O TELEFONE: ");
                    String telefone = sc.nextLine();

                    System.out.print("\nINFORME O ENDEREÇO: ");
                    String endereco = sc.nextLine().toUpperCase();

                    Assalariado a = new Assalariado(salario, nome, cpf, endereco, telefone, setor);
                    f[cont] = a;
                    cont++;

                    System.out.print("\nFUNCIONÁRIO ADICIONADO COM SUCESSO!");
                } else if (tipoFuncionario.equals("H")) {
                    System.out.print("\nINFORME O NOME: ");
                    String nome = sc.nextLine().toUpperCase();

                    System.out.print("\nINFORME O SETOR: ");
                    String setor = sc.nextLine().toUpperCase();

                    System.out.print("\nINFORME O VALOR DA HORA TRABALHADA: ");
                    Double valorHora = sc.nextDouble();

                    System.out.print("\nINFORME O TOTAL DE HORAS TRABALHADAS: ");
                    Double horas = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("\nINFORME O CPF: ");
                    String cpf = sc.nextLine();

                    System.out.print("\nINFORME O TELEFONE: ");
                    String telefone = sc.nextLine();

                    System.out.print("\nINFORME O ENDEREÇO: ");
                    String endereco = sc.nextLine().toUpperCase();

                    Horista h = new Horista(valorHora, horas, nome, cpf, endereco, telefone, setor);
                    f[cont] = h;
                    cont++;

                    System.out.print("\nFUNCIONÁRIO ADICIONADO COM SUCESSO!");
                } else {
                    System.out.println("OPÇÃO INVÁLIDA!");
                }

            } else {
                System.out.println("NÚMERO MÁXIMO DE FUNCIONÁRIOS JÁ OBTIDO");
            }

            System.out.print("\n\nDESEJA ADICIONAR MAIS FUNCIONÁRIOS? ( S / N ): ");
            continuar = sc.nextLine().toUpperCase();
            if (continuar.equals("N")) {
                System.out.println("VOLTANDO...");
            } else if (!continuar.equalsIgnoreCase("S")) {
                System.out.println("OPÇÃO INVÁLIDA!");
            }
        }

    }

    public void mostrarDadosPg() {
        System.out.println("\nFUNCIONÁRIOS CADASTRADOS:\n\n=======================");
        for (int i = 0; cont > i; i++) {
            System.out.println(f[i] + "\n=======================");
        }
    }

    public void aplicarAumento() {
        System.out.print("\nINSIRA UM AUMENTO GERAL: R$");
        Double aumento = sc.nextDouble();
        a.setAumento(aumento);
        for (int i = 0; cont > i; i++) {
            f[i].calcularAumento(aumento);
        }
        mostrarDadosPg();
    }

}
