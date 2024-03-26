/*
O usuário digita um número pelo teclado e 
o programa chama um método que deve exibir a sequência de Fibonacci.
*/
package m72_ex8_leandro_gusmao;
import java.util.Scanner;

public class M72_Ex8_Leandro_Gusmao {

	public static void main(String[] args) {
		System.out.println("M7.2 – Exercici 8");
        System.out.println("");
        
		Scanner input = new Scanner(System.in);
		
		int numero = 0;
		
        System.out.println("Ingrese un número para generar la secuencia de Fibonacci:");
        numero = input.nextInt();

        System.out.println("La secuencia de Fibonacci para " + numero + " términos es:");
        for (int i = 0; i < numero; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        input.close();
    }

	public static int fibonacci(int n) {
	    if (n <= 1) {
	        return n;
	    } else {
	        int a = 0;
	        int b = 1;
	        int c = 0;
	        for (int i = 2; i <= n; i++) {
	            c = a + b;
	            a = b;
	            b = c;
	        }
	        return c;
	    }
	}
}
