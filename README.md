# Exercico_Media_de_alunos
_________________________________________________________________________________________________

1) Deseja-se saber o número de pessoas presentes em uma sala específica do bloco Q (contendo seis salas) de uma universidade. para isso, é necessário um vetor que tenha tamanho 6 e que cada posição armazene o número de pessoas em cada sala. Qual seria a média de alunos nas salas informadas? Apresente quais são as salas com uma quantidade de pessoas acima da média encontrada. 

2) Ainda com base no exemplo, crie um algoritmo que receba a entrada da quantidade de alunos em cada uma das seis salas, calcule a média e apresente as salas com o maior número da média e as salas com menor número.

___________________________________________________________________________________________________

INICIO

    q[] = new int[6]
    Soma = 0
    ENQUANTO int i = 0; i < q.length; i++ 
      FAÇA
        LER (i + 1)
        q[i]
        soma = soma + q[i]
        media = soma / q.length
      FIM ENQUANTO  
       Arrays.sort (q)
       int maior = q[5]
       int menor = q[0] 
    EXIBIR( 'A media de alunos das salas e:', media)
    EXIBIR('A sala com mais alunos tem', maior)
    EXIBIR('A sala com menos alunos tem', menor)
    
FIM
________________________________________________________________________________________________________
