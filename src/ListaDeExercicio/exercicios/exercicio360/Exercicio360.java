package ListaDeExercicio.exercicios.exercicio360;

import java.util.Scanner;

import static ListaDeExercicio.exercicios.exercicio360.DescobreSigno.obterSigno;

public class Exercicio360 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dia, mes;

        do {
            System.out.println("Digite a data de nascimento desta forma: ddMM e 9999 para fechar o programa");
            int data = scanner.nextInt();

            dia = data / 100;
            mes = data % 100;

            if (data != 9999) {
                System.out.println("O seu signo é: " + obterSigno(dia, mes));
            }
        } while (dia != 99 && mes != 99);

        System.out.println("Programa encerrado.");
        scanner.close();
    }


}
