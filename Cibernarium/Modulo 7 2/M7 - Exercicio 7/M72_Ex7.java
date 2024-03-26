/*
O usuário digita o ano pelo  teclado
e o programa chama um método que indica se o ano é bissexto ou não.
*/
package m72_ex7_leandro_gusmao;
import java.util.Scanner;

public class M72_Ex7_Leandro_Gusmao {

	public static void main(String[] args) {
		System.out.println("M7.2 – Exercici 7");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        int ano = 0;

        System.out.println("Ingrese el año:");
        ano = input.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " es un año bisiesto!");
        } else {
            System.out.println(ano + " no es un año bisiesto!");
        }
        input.close();
    }
}
