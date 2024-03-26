/*
El número de líneas formadas por “*” vendrá dado por 
un número que el usuario introducirá a través de la consola.
*/
package M72_Ex2_Leandro_Gusmao;
import java.util.Scanner;

public class m72_ex2_leandro_gusmao {

	public static void main(String[] args) {
		System.out.println("M7.2 – Exercici 2");
        System.out.println("");
        
        int numLineas = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el número de líneas:");
        numLineas = input.nextInt();

        for (int i = 1; i <= numLineas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        input.close();
	}
}
