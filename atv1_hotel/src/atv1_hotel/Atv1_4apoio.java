package atv1_hotel;

import java.util.Scanner;

public class Atv1_4apoio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando a matriz para os quartos: 4 andares x 3 quartos
        String[][] quartos = new String[4][3];

        // Inicializando todos os quartos como desocupados ("O" para Ocupado e "X" para Desocupado)
        for (int i = 0; i < quartos.length; i++) {
            for (int j = 0; j < quartos[i].length; j++) {
                quartos[i][j] = "O"; // Inicialmente todos estão desocupados
            }
        }

        char continuar = 'S';
        while (continuar == 'S' || continuar == 's') {
            System.out.print("Informe o andar (1-4): ");
            int andar = scanner.nextInt() - 1; // Ajustando para índice de 0
            System.out.print("Informe o número do quarto (1-3): ");
            int numeroQuarto = scanner.nextInt() - 1; // Ajustando para índice de 0

            // Verificando se os números informados estão válidos
            if (andar >= 0 && andar < 4 && numeroQuarto >= 0 && numeroQuarto < 3) {
                if (quartos[andar][numeroQuarto].equals("O")) {
                    quartos[andar][numeroQuarto] = "X"; // Marcando como ocupado
                    System.out.println("Quarto " + (andar + 1) + "-" + (numeroQuarto + 1) + " registrado como ocupado.");
                } else {
                    System.out.println("Esse quarto já está ocupado!");
                }
            } else {
                System.out.println("Número de andar ou quarto inválido. Tente novamente.");
            }

            // Perguntando se o usuário deseja registrar mais uma ocupação
            System.out.print("Deseja informar outra ocupação? (S/N): ");
            continuar = scanner.next().charAt(0); // Lendo apenas o primeiro caractere
        }

        // Imprimindo a tabela de ocupação
        System.out.println("\nTabela de Ocupação dos Quartos:");
        for (int i = 3; i >= 0; i--) { // Mostrando o andar 1 embaixo até o andar 4 em cima
            System.out.print("Andar " + (i + 1) + ": ");
            for (int j = 0; j < 3; j++) {
                System.out.print(quartos[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
