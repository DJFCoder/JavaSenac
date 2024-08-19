/*

ENUNCIADO: 
    Monte um algoritmo em que o usuário poderá cadastrar e pesquisar hóspedes. O
    algoritmo deve oferecer um menu com três opções ao usuário: 1- cadastrar; 2-
    pesquisar; 3- sair. A opção “cadastrar” deve permitir que o usuário informe um
    nome de hóspede, gravando-o em memória (máximo de 15 cadastros; caso atinja
    essa quantidade, mostre “Máximo de cadastros atingido”). A opção “pesquisar” deve
    permitir que o usuário informe um nome e, caso seja encontrado um nome
    exatamente igual, mostre a mensagem “Hóspede (nome) foi encontrado no índice
    (índice onde foi cadastrado)”. Se o nome não foi encontrado, mostre “Hóspede não
    encontrado”. O algoritmo deve permitir que o usuário realize essas operações
    repetidas vezes, até que use a opção “3”, que encerra o algoritmo.

 */
package atv1_hotel;

import java.util.Scanner;

public class Atv1_4 {

    public static void main(String[] args) {

        Scanner readUser = new Scanner(System.in);
        String hospedes[] = new String[15], procurarNome;
        Integer indice = 0, opcaoUsuario;

        System.out.println("-- ESTE SISTEMA ACEITA APENAS 15 HÓSPEDES CADASTRADOS --");

        do {
            System.out.print("\n(1) CADASTRAR | (2) PESQUISAR | (3) SAIR\n\nOPÇÃO SELECIONADA: ");
            opcaoUsuario = readUser.nextInt();
            readUser.nextLine();

            switch (opcaoUsuario) {

                case 1:
                    if (indice < 15) {
                        System.out.print("\nCADASTRAR HOSPEDE: ");
                        hospedes[indice] = readUser.nextLine();
                        indice++;

                        break;

                    } else {
                        System.out.println("\n-- MÁXIMO DE CADÁSTROS ATINGIDO --\n");

                    }

                    break;

                case 2:
                    System.out.print("\nPESQUISE PELO NOME DO HÓSPEDE: ");
                    procurarNome = readUser.nextLine();

                    boolean encontrado = false;
                    for (int i = 0; i < indice; i++) {

                        if (procurarNome.equals(hospedes[i])) {
                            System.out.println("\nHÓSPEDE " + procurarNome + " FOI ENCONTRADO NO ÍNDICE: " + i + ".\n");
                            encontrado = true;

                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("HÓSPEDE NÃO ENCONTRADO.\n");
                    }

                    break;

                case 3:
                    System.out.println("SAINDO DO SISTEMA...\n");

                    break;

                default:
                    System.err.print("OPÇÃO INVÁLIDA.\n");

                    break;
            }

        } while (opcaoUsuario != 3);

        readUser.close();

    }

}
