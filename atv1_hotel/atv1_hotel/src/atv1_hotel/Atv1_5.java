/*

ENUNCIADO: 
     Monte um programa Java que mostre na tela em formato de tabela os
     quartos ocupados e os desocupados. Considere que o hotel tem 4 andares e 3
     quartos por andar. Primeiro, o usuário registrará os quartos ocupados,
     informando para cada ocupação o número do apartamento (andar de 1 a 4 e
     número de quarto de 1 a 3). O programa deverá questionar “Deseja informar
     outra ocupação? (S/N)” e o usuário poderá informar quantos quartos quiser, até
     que responda “N” a essa pergunta. Em seguida, o programa mostrará uma
     tabela, em que o primeiro andar é o inferior e o último, o superior, marcando
     com X o quarto ocupado.
     
 */
package atv1_hotel;

import java.util.Scanner;

public class Atv1_5 {

    public static void main(String[] args) {

        Scanner readUser = new Scanner(System.in);
        String quartos[][] = new String[4][3];
        Integer numQuarto = 0;
        char continuar, livreOcupado, livre = 'O', ocupado = 'X';

        for (int i = 0; i < quartos.length; i++) {
            for (int j = 0; j < quartos[i].length; j++) {
                quartos[i][j] = "O";
            }
        }
        
        System.out.println("-- INSERE OCUPAÇÕES NA TABELA DE ANDARES/QUARTOS DO HOTEL --\n");
        
        continuar = 'S';
        while (continuar == 'S' || continuar == 's') {
            System.out.print("ESCOLHA O ANDAR ( 1º - 4º ): ");
            int andar = readUser.nextInt() - 1; 
            System.out.print("ESCOLHA O NÚMERO DO QUARTO ( 1 - 3 ): ");
            int numeroQuarto = readUser.nextInt() - 1;

            if (andar >= 0 && andar < 4 && numeroQuarto >= 0 && numeroQuarto < 3) {
                if (quartos[andar][numeroQuarto].equals("O")) {
                    quartos[andar][numeroQuarto] = "X";
                    
                    System.out.println("\n" + (andar + 1) + "º ANDAR | QUARTO: " + (numeroQuarto + 1) + " - OCUPADO COM SUCESSO!\n");
                
                } else {                    
                    System.out.println("\nESTE QUARTO JÁ ESTÁ OCUPADO!\n");
               
                }
            
            } else {               
                System.err.println("\n-- ANDAR OU QUARTO INVÁLIDO! TENTE NOVAMENTE. --\n");
            
            }
            
            System.out.print("CONTINUAR INSERINDO OCUPAÇÕES? (S/N): ");
            continuar = readUser.next().charAt(0);
        
        }
        
        System.out.println("\n-- TABELA DE QUARTOS OCUPADOS --\n");
        
        for (int i = 3; i >= 0; i--) {
            System.out.print((i + 1) + "º ANDAR: ");
            for (int j = 0; j < 3; j++) {
                System.out.print(quartos[i][j] + " ");
            }
            
            System.out.println();        
        }

        readUser.close();

    }
}
