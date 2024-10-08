/*

ENUNCIADO:
    Escreva um programa Java que receba o valor padrão de uma diária e em
    seguida receba vários nomes de hóspedes e suas idades. Caso a idade do
    hóspede seja menor de 4 anos, ele não paga hospedagem – nesses casos, é
    preciso que seja mostrada na tela a mensagem “(Nome do hóspede) possui
    gratuidade”. Hóspedes com mais de 80 anos pagam metade – então dever ser
    mostrado na tela “(Nome do hóspede) paga meia”. O usuário informará hóspedes
    até digitar a palavra “PARE”, que interrompe a entrada de dados. Ao fim, o
    programa deve mostrar a quantidade de gratuidades, a quantidade de meias
    hospedagens e o valor total, considerando todos os hóspedes informados.

*/

package atv1_hotel;

import java.util.Locale;
import java.util.Scanner;

public class Atv1_3 {

    public static void main(String[] args) {

        Scanner readUser = new Scanner(System.in).useLocale(Locale.US);
        Double valorHospedagem, somaHospedagem = 0.0, pagaMeia = 0.0;
        Integer idadeHospede, valorDiaria, contGrat = 0, contMeia = 0, contInt = 0;
        String nomeHospede;
        char continuar;

        System.out.println("-- RECEBE VALOR DE DIÁRIA E HOSPEDES ENTÃO VERIFICA GRATUIDADE OU DESCONTO PELA IDADE --");

        System.out.print("\nINSIRA O VALOR DA DIÁRIA: R$");

        while (!readUser.hasNextDouble()) {

            System.err.print("\nERRO: VALOR INVÁLIDO.\nINSIRA O VALOR DA DIÁRIA: R$");
            readUser.next();

        }

        valorHospedagem = readUser.nextDouble();
        readUser.nextLine();

        do {

            System.out.print("\nINSIRA O NOME DO HOSPEDE: ");
            nomeHospede = readUser.nextLine();
            System.out.print("INSIRA A IDADE DO HOSPEDE: ");
            idadeHospede = readUser.nextInt();
            readUser.nextLine();

            if (idadeHospede <= 4) {

                contGrat++;
                System.out.println("\n" + nomeHospede + " POSSUI GRATUIDADE.");

            } else if (idadeHospede >= 80) {

                pagaMeia = valorHospedagem / 2;
                somaHospedagem = somaHospedagem + pagaMeia;
                contMeia++;
                System.out.println("\n" + nomeHospede + " PAGA MEIA.");

            } else if (idadeHospede > 4 && idadeHospede < 80) {

                somaHospedagem = somaHospedagem + valorHospedagem;
                contInt++;

            }

            System.out.print("\nDESEJA CONTINUAR? (S/N): ");
            continuar = readUser.nextLine().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        System.out.println("TOTAL DE HOSPEDAGENS: R$" + somaHospedagem + "; " + contInt + " INTEIRA(S);  " + contGrat + " GRATUIDADE(S); " + contMeia + " MEIA(S);\n");

        readUser.close();

    }
}
