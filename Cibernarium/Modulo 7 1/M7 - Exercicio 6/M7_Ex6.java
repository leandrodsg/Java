/*
O usuário inserirá um número (de 1 a 10) por tela e, 
por meio de um loop, o programa mostrará a tabuada desse número.
*/
package m71_ex6_leandro_gusmao;
import java.util.Scanner;

public class M71_Ex6_Leandro_Gusmao {

	public static void main(String[] args) {
		System.out.println("M7.1 – Exercici 6");
        System.out.println("");
		
        int numero = 0;
        int resultado = 0;
        
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Ingrese un número entre 1 y 10:");
            numero = input.nextInt();

            if (numero < 1 || numero > 10) {
                System.out.println("Número inválido. Por favor, ingrese un número entre 1 y 10");
            }
        } while (numero < 1 || numero > 10);

        System.out.println("Tabla de multiplicación del " + numero + ":");
        for (int i = 0; i < 10; i++) {
            resultado = numero * (i+1);
            System.out.println(numero + " x " + (i+1) + " = " + resultado);
        }
        input.close();
	}

}
