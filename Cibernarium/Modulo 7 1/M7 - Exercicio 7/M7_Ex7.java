/*
Faça um programa onde o usuário insere um caractere e um número na tela. 
O programa imprime na tela um quadrado com o tamanho e caracter digitado pelo usuário.
*/
package m71_ex7_leandro_gusmao;
import java.util.Scanner;

public class M71_Ex7_Leandro_Gusmao {

	public static void main(String[] args) {
		System.out.println("M7.1 – Exercici 7");
        System.out.println("");
		
        char caractere = ' ';
        int tamanho = 0;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un carácter para dibujar el cuadrado:");
        caractere = input.next().charAt(0);

        System.out.println("Introduzca el tamaño del cuadrado:");
        tamanho = input.nextInt();

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(caractere + " ");
            }
            System.out.println();
        }

        input.close();
        
	}

}
