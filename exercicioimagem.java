package matriz;
import java.util.Scanner;

public class exercicioimagem
{
public static void main(String[] args){
       Scanner ler = new Scanner(System.in);
       int i, j, m[][] = new int [16][16];
       // Declarado 3 variaveis inteiras para uma matriz com 16 linhas e 16 colunas
       for (i = 0; i < 16; i++){
           // Iniciado um laco de repeticao onde: enquanto a variavel i for menor que 16, vai ser somado +1
           System.out.printf("Informe os elementos %da. linha: \n", (i + 1));
           // System.out.printf para aparecer a mensagem ao usuario "informe os elementos da linha"
           for (j = 0; j < 16; j++){
               // Iniciado um laco de repeticao onde: enquanto a variavel j for menor que 16, vai ser somado +1
               System.out.printf("m[%d][%d] = ", i, j);
               // System.out.printf para aparecer o numero de linhas e colunas da matriz
               m[i][j] = ler.nextInt();
               // Realiza a leitura da matriz de variavel i e j
           }
           System.out.printf("\n");
           // Realiza a quebra de linha
       }
       System.out.printf("\n");
       // Realiza a quebra de linha
       for (i = 0; i < 16; i++){
           // Iniciado um laco de repeticao onde: enquanto variavel i for menor que 16, vai ser somado +1
           for (j = 0; j < 16; j++){
               // Iniciado um laco de repeticao onde: enquanto variavel j for menor que 16, vai ser somado +1
               System.out.printf("%d ", m[i][j]);
               // Exibe a matriz
           }
           System.out.printf("\n");
           // Realiza a quebra de linha
       }
       
    }
}


