import java.util.Scanner;


import java.util.Arrays;

public class Exercicio_Media_Vetores {


    public static void main(String[] args) {

        Scanner estudantes = new Scanner(System.in);


        // Declaracao das variaveis e vetor
        int total = 0, g[] = new int[6];
        float mediania = 0;


        // Estrutura de repeticao numero do valor definido do vetor
        for (int i = 0; i < g.length; i++) {

            // dados do usuario
            System.out.printf("Digite a quantidade de alunos da Sala %d\n",
                (i + 1));

            // armazenar o valor recebido no vetor
            g[i] = estudantes.nextInt();
            total = total + g[i];
            mediania = total / g.length;
        }
        // determinar o valor maior e o menor
        Arrays.sort(g);

        // Declaracao de variaveis maior e menor
        int maior = g[5];
        int menor = g[0];


        // Exibir os dados da media das salas, a sala com maior e menor de alunos
        System.out.printf("A media de alunos das salas e: %f\n", mediania);

        System.out.printf("A sala com a maior quantidade de alunos tem %d alunos\n", maior);

        System.out.printf("A sala com a menor quantidade de alunos tem %d alunos\n", menor);

    }
}
