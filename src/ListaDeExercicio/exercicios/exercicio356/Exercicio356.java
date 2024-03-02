package ListaDeExercicio.exercicios.exercicio356;

import java.util.Scanner;

public class Exercicio356 {
    public static void main(String[] args) {
        String nomes[] = new String[15];
        Double pr1[] = new Double[15];
        Double pr2[] = new Double[15];
        String situacao[] = new String[15];
        Double media[] = new Double[15];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<15;i++){
            System.out.println("Digite o nome do aluno:");
            nomes[i] = scanner.nextLine();
            System.out.println("Digite a nota da prova 1 do aluno " + nomes[i]);
            pr1[i] = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Digite a nota da prova 2 do aluno " + nomes[i]);
            pr2[i] = scanner.nextDouble();
            scanner.nextLine();
            media[i] = (pr1[i]+pr2[i])/2;
            if (media[i]>=6){
                situacao[i] = "AP";
            } else {
                situacao[i] = "RP";
            }
        }
        for (int i = 0; i<15; i++){
            System.out.println("""
                    nome do aluno: %s
                    notas das provas: %.2f e %.2f
                    media: %.2f
                    situação: %s
                    
                    """.formatted(nomes[i],pr1[i],pr2[i],media[i],situacao[i]));
        }

    }
}
