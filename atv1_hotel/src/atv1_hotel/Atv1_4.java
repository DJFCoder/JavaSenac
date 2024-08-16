/*
     
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

public class Atv1_4 {

    public static void main(String[] args) {

        Scanner readUser = new Scanner(System.in);
        String quartos[][] = new String[4][3];
        Integer numQuarto = 0;
        char continuar='S', livreOcupado, livre = 'O', ocupado = 'X';

        // INICIA A MATRIZ DESOCUPADA
        for (int i = 0; i < quartos.length; i++) {
            for (int j = 0; j < quartos[i].length; j++) {
                quartos[i][j] = "O";
            }
        }
        
        

    }
}
