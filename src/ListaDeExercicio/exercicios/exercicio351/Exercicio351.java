package ListaDeExercicio.exercicios.exercicio351;

import java.util.Scanner;

public class Exercicio351 {
    public static void main(String[] args) {
        System.out.println("""
                Digite um numero para o nome correspondente:
                nome 1: ANITA
                nome 2: GUTO
                nome 3: LUISA
                nome 4: LUAN
                nome 5: PERICLES
                """);
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        scan.nextLine();

        switch (numero) {
            case 1:
                System.out.println("ANITA");
                break;
            case 2:
                System.out.println("GUTO");
                break;
            case 3:
                System.out.println("LUISA");
                break;
            case 4:
                System.out.println("LUAN");
                break;
            case 5:
                System.out.println("PERICLES");
                break;

        }
    }
}
