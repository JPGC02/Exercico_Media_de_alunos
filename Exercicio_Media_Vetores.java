import java.util.Scanner;

 
import java.util.Arrays;

public class Exercicio_Media_Vetores
{
  
 
public static void main (String[]args)
  {
    
Scanner Alunos = new Scanner (System.in);
    
 
      // Declaracao das variaveis e de vetor com valor definido para 6 modulos 
    int soma = 0, q[] = new int[6];
    
float media = 0;
    
 
      // Estrutura de repeticao numero do valor definido do vetor
      for (int i = 0; i < q.length; i++)
      {
	
	  // Pedir ao usuario um valor (dados) e somar 1 na contagem
	  System.out.printf ("Digite a quantidade de alunos da Sala %d\n",
			     (i + 1));
	
	  // Guardar o valor recebido no vetor de acordo com o valor somado da contagem (i)
	  q[i] = Alunos.nextInt ();
	
	  // Receber na variavel um valor somado do vetor
	  soma = soma + q[i];
	
	  // Receber na variavel um valor dividido para tirar a media
	  media = soma / q.length;
      
} 
      // Ordenar o valor maior e o menor que estao dentro do vetor
      Arrays.sort (q);
    
      // Declaracao de variaveis do vetor, maior valor e menor valor
    int maior = q[5];
    
int menor = q[0];
    
 
      // Exibir ao usuario os dados de media das salas, a sala com maior e menor numero de alunos
      System.out.printf ("A media de alunos das salas e: %f\n", media);
    
System.out.printf ("A sala com mais alunos tem %d alunos\n", maior);
    
System.out.printf ("A sala com menos alunos tem %d alunos\n", menor);

} 
}
