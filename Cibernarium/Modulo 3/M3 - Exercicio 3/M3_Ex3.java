/*
M3 – Exercício 3
O programa solicita que o usuário insira 3 notas e o programa exibe a média das 3 notas por tela.
Nota: As notas inseridas pelo usuário são números inteiros, mas a média pode conter decimais.
*/
package M3exe03;
import java.util.Scanner;

public class M3_Ex3_Leandro_Gusmao {

    public static void main(String[] args) {
        System.out.println("M3 – Exercici 3");
        System.out.println("");
        
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        float media = 0f;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa la primera nota");
        nota1 = input.nextInt();
        System.out.println("Ingresa la segunda nota");
        nota2 = input.nextInt();
        System.out.println("Ingresa la tercera nota");
        nota3 = input.nextInt();
        
        media = (float)(nota1 + nota2 + nota3)/3;
        
        System.out.println("Notas insertadas: " +nota1+ " - " +nota2+ " - " +nota3);
        System.out.printf("El promedio de las 3 notas es: %.2f", media);
        input.close();
    }
}
