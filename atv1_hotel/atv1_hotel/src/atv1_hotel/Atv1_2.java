package atv1_hotel;

import java.util.Scanner;

public class Atv1_2 {

    public static void main(String[] args) {

        Scanner readUser = new Scanner(System.in);
        String desconto = " COM DESCONTO DE 40%", nomeHospede1, nomeHospede2, quartoA = "", quartoB = "";
        Integer idadeHospede1, idadeHospede2;

        System.out.println("-- VERIFICA QUARTO POR IDADE E CALCULA DESCONTOS --\n");

        System.out.print("INSIRA O HOSPEDE 1: \nNOME : ");
        nomeHospede1 = readUser.nextLine();
        System.out.print("IDADE: ");
        idadeHospede1 = readUser.nextInt();
        readUser.nextLine();

        System.out.print("\nINSIRA O HOSPEDE 2: \nNOME : ");
        nomeHospede2 = readUser.nextLine();
        System.out.print("IDADE: ");
        idadeHospede2 = readUser.nextInt();
        readUser.close();

        if (idadeHospede1 >= idadeHospede2) {

            quartoA = nomeHospede1;
            quartoB = nomeHospede2;

            if (idadeHospede1 >= 60) {

                quartoA = nomeHospede1 + desconto;

                if (idadeHospede2 >= 60) {

                    quartoB = nomeHospede2 + desconto;

                }

            }

        } else if (idadeHospede1 < idadeHospede2) {

            quartoA = nomeHospede2;
            quartoB = nomeHospede1;

            if (idadeHospede2 >= 60) {

                quartoA = nomeHospede2 + desconto;

            }

        }

        System.out.println("\nQUARTO A: " + quartoA + "\nQUARTO B: " + quartoB);

    }

}
