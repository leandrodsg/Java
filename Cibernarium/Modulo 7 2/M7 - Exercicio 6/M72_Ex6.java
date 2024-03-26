/*
O usuário deve inserir números até que o número seja primo. 
Quando o usuário digita um número primo, o programa deve exibir
a seguinte mensagem: “Exatamente, o número “x” é primo!”
*/
package m72_ex6_leandro_gusmao;
import java.util.Scanner;

public class M72_Ex6_Leandro_Gusmao {

	public static void main(String[] args) {
		System.out.println("M7.2 – Exercici 6");
        System.out.println("");
		
        Scanner sc = new Scanner(System.in);
        boolean esPrimo = false;
        int numero;

        System.out.println("Elija un número: ");
        numero = sc.nextInt();

        if (numero > 1) {
            esPrimo = esPrimo(numero);
        }

        while (!esPrimo) {
            System.out.println("El número no es primo. Introduzca otro número:");
            numero = sc.nextInt();
            if (numero > 1) {
                esPrimo = esPrimo(numero);
            } else {
                System.out.println("Por favor, ingrese un número mayor que 1.");
            }
        }

        System.out.println("¡Exactamente, el número " + numero + " es primo!");
        sc.close();
    }

    public static boolean esPrimo(int n) {
        boolean esPrimo = true;
        int divisor = 2;
        while (esPrimo && divisor < n) {
            if (n % divisor == 0) {
                esPrimo = false;
            }
            divisor++;
        }
        return esPrimo;
	}
}
