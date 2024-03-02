package ListaDeExercicio.exercicios.exercicio346;

import java.util.Scanner;

public class Exercicio346Main {
    public static void main(String[] args) {
        int opcoesMenu = 0;
        while (opcoesMenu != 4) {
            Scanner scan = new Scanner(System.in);
            System.out.println("MENU");
            System.out.println("""
                    1- Imprime o comprimento da frase
                    2- Imprime os dois primeiros e os dois últioms caracteres da frase
                    3- Imprime a frase espelhada
                    4- Termina o algoritimo
                    """);
            System.out.println("Digite a opcao desejada");
            opcoesMenu = scan.nextInt();
            scan.nextLine();

            String frase;

            switch (opcoesMenu) {
                case 1:
                    System.out.println("Digite a frase");
                    frase = scan.nextLine();
                    System.out.println("O numero do comprimento da frase é: " + frase.length());
                    break;
                case 2:
                    System.out.println("Digite uma frase");
                    frase = scan.nextLine();
                    System.out.println("Os dois primeiros caracteres da frase são: " + frase.substring(0, 2));
                    System.out.println("Os dois ultimos caracteres da frase são: " + frase.substring(frase.length() - 2));
                    break;
                case 3:
                    System.out.println("Digite uma frase");
                    frase = scan.nextLine();
                    String fraseEspelhada = "";
                    for (int i = frase.length()-1; i >= 0; i--) {
                        fraseEspelhada = fraseEspelhada.concat(String.valueOf(frase.charAt(i)));
                    }
                    System.out.println(fraseEspelhada);
                    break;
                case 4:
                    break;

            }

        }


        }
}

