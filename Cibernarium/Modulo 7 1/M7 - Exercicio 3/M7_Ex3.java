/*
Escreva um programa que determine se um número é múltiplo de outro. 
Para isso, crie uma função que deve receber os dois números como parâmetros e
 deve retornar se o primeiro número digitado é múltiplo do segundo ou não.
*/
package m71_ex3_leandro_gusmao;
import java.util.Scanner;

public class M71_Ex3_Leandro_Gusmao {

	public static void main(String[] args) {
		System.out.println("M7 – Exercici 3");
        System.out.println("");
        
        int num1 = 0;
        int num2 = 0;
        int resultado = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        num1 = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese el segundo número: ");
        num2 = input.nextInt();
        input.nextLine();
        
        resultado = multiplo(num1, num2); 
        
        if (resultado > 0) {
            System.out.println(num1 + " no es múltiplo de " + num2);
        } else {
            System.out.println(num1 + " es múltiplo de " + num2);
        }
        input.close();
    }
    
    public static int multiplo(int num1, int num2) {
        return num1 % num2;
    }
}
