package ListaDeExercicio.exercicios.exercicio348;

import java.util.Scanner;

public class Exercicio348 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nomes = new String[5];
        Double[] notas1 = new Double[5];
        Double[] notas2 = new Double[5];
        Double[] media = new Double[5];

        for (int i = 0; i<5; i++){
            System.out.println("Digite um nome");
            nomes[i]=scan.nextLine();
            System.out.println("Digite a primeira nota");
            notas1[i] = scan.nextDouble();
            scan.nextLine();
            System.out.println("Digite a segunda nota");
            notas2[i] = scan.nextDouble();
            scan.nextLine();
            media[i] = (notas1[i]+notas2[i])/2;

        }
        scan.close();
        for (int i = 0; i<5; i++){
            System.out.println("O nome do aluno é: " + nomes[i]);
            System.out.println("As notas do aluno são: " + notas1[i] + " e " +notas2[i]);
            System.out.println("A média do aluno é: " + media[i]);
        }


    }
}
