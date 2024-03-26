/*
Faça um programa que peça ao usuário dois números inteiros 
que você chamará de dividendo e divisor respectivamente.
O divisor deve estar entre 2 e 7.
Caso contrário, o programa deverá exibir uma mensagem de erro.
Se o divisor estiver correto (2-7) mostra na tela se 
o dividendo é múltiplo do divisor ou não.
*/
package M4_Extra1_Leandro_Gusmao;
import java.util.Scanner;

public class M4_Extra1_Leandro_Gusmao {

	public static void main(String[] args) {
		System.out.println("M4 – Exercici Extra 1");
        System.out.println("");
        
        int dividendo = 0;
        int divisor = 0;
        
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese el dividendo (número entero):");
        dividendo = input.nextInt();
        System.out.println("Ingrese el divisor (debe ser un número entero entre 2 y 7):");
        divisor = input.nextInt();

        if (divisor >= 2 && divisor <= 7) {
            if (dividendo % divisor == 0) {
                System.out.println(dividendo + " es múltiplo de " + divisor + ".");
            } else {
                System.out.println(dividendo + " no es múltiplo de " + divisor + ".");
            }
        } else {
            System.out.println("Error: El divisor debe ser un número entero entre 2 y 7.");
        }
        input.close();
	}
}
