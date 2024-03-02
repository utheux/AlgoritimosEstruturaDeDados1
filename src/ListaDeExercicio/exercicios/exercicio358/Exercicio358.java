package ListaDeExercicio.exercicios.exercicio358;

import java.util.Scanner;

public class Exercicio358 {
    public static void main(String[] args) {
        double[] precoDeCompra = new double[100];
        double[] precoDeVenda = new double[100];
        Scanner scanner = new Scanner(System.in);
        double[] lucro = new double[100];
        for (int i = 0; i < 100; i++) {
            System.out.println("Digite o preco de compra do produto");
            precoDeCompra[i] = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Digite o preco de venda do produto");
            precoDeVenda[i] = scanner.nextDouble();
            scanner.nextLine();
            lucro[i] = precoDeVenda[i] - precoDeCompra[i];

        }

        int totalLucroMenorDez = 0;
        int totalLucroMenorVinte = 0;
        int totalLucroMaiorVinte = 0;



        for (int i = 0; i < 100; i++) {
            if (lucro[i] < (0.10 * precoDeCompra[i])) {
                System.out.println("lucro menor do que 10%");
                totalLucroMenorDez++;

            } else if (lucro[i] >= (0.10 * precoDeCompra[i]) && lucro[i] <= (0.20 * precoDeCompra[i])) {
                System.out.println("lucro entre 10% e 20%");
                totalLucroMenorVinte++;

            } else if (lucro[i] > (0.20 * precoDeCompra[i])) {
                System.out.println("lucro maior do que 20%");
                totalLucroMaiorVinte++;

            }
        }

        System.out.println(
                        "Lucros menor do que 10% = " + totalLucroMenorDez + "\n" +
                        "Lucros entre 10% e 20% = " + totalLucroMenorVinte + "\n" +
                        "Lucros maior que 20% = " + totalLucroMaiorVinte);
    }
}
