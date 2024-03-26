/*
O usuário deve inserir dois números, o programa retornará
“Um dos dois números é negativo”, 
somente se um dos dois números for negativo.
*/
package m71_ex4_leandro_gusmao;
import java.util.Scanner;

public class M71_Ex4_Leandro_Gusmao {

	public static void main(String[] args) {
		System.out.println("M7.1 – Exercici 4");
        System.out.println("");
        
        int num1 = 0;
        int num2 = 0;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        num1 = input.nextInt();
        input.nextLine();

        System.out.println("Ingrese el segundo número:");
        num2 = input.nextInt();
        input.nextLine();

        if (num1 < 0 || num2 < 0) {
            System.out.println("Uno de los dos números es negativo.");
        }
        input.close();        
	}
}
