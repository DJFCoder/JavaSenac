/*

ENUNCIADO: Indique qual de seus dois auditórios é o mais adequado para um evento. O
auditório Alfa conta com 150 lugares e espaço para até 70 cadeiras adicionais. O
auditório Beta conta com 350 lugares, sem espaço para mais cadeiras. Desenvolva
um programa Java que receba o número de convidados do evento e faça uma
verificação sobre esse número: se for maior que 350 ou menor que zero, deverá ser
mostrada a mensagem “Número de convidados inválido”. Se o valor informado é
válido, deverá ser mostrado na tela qual dos auditórios é o mais adequado. No caso
do auditório Alfa, será preciso calcular ainda quantas cadeiras adicionais serão
necessárias, observando o limite citado anteriormente.

*/

package atv1_hotel;

import java.util.Scanner;

public class Atv1_1 {

    public static void main(String[] args) {

        Scanner readUser = new Scanner(System.in);
        Short alfa = 150, beta = 350, adicional = 70, qntConvidados;
        String nomeUsuario;

        System.out.println("-- VERIFICA QUAL O AUDITÓRIO A SER UTILIZADO PARA O EVENTO E CADEIRAS ADICONAIS --\n");
        System.out.print("DIGITE SEU NOME: ");
        nomeUsuario = readUser.nextLine();

        System.out.println("\nOLÁ " + nomeUsuario + ", INSIRA A QUANTIDADE DE CONVIDADOS PARA O EVENTO: ");
        System.out.print("-- O MÁXIMO DE CONVIDADOS É DE 350 PESSOAS --\n\nCONVIDADOS: ");
        qntConvidados = readUser.nextShort();

        if (qntConvidados > 1 && qntConvidados <= alfa) {

            System.out.println("\nUSE O AUDITORIO ALFA.\n");

        } else if (qntConvidados > alfa && qntConvidados <= alfa + adicional) {

            int resultado = qntConvidados - alfa;

            if (resultado == 1) {

                System.out.println("\nUSE O AUDITORIO ALFA COM " + (resultado) + " CADEIRA ADICIONAL.\n");

            } else if (resultado > 1) {

                System.out.println("\nUSE O AUDITORIO ALFA COM " + (resultado) + " CADEIRAS ADICIONAIS.\n");

            }

        } else if (qntConvidados > alfa + adicional && qntConvidados <= beta) {

            System.out.println("\nUSE O AUDITORIO BETA.\n");

        } else if (qntConvidados <= 0 || qntConvidados > 350) {

            System.out.println("\nQUANTIDADE DE CONVIDADOS INVÁLIDO.\n");

        }

        readUser.close();

    }

}
