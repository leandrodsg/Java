/*
M3 – Exercício Extra 1
Escreva um programa Java que leia um número inteiro do teclado
e recupere e exiba o duplo e o triplo desse número na tela.
*/
package M3exeEXTRA01;
import java.util.Scanner;

public class M3_Ex1_Extra_Leandro_Gusmao {

    public static void main(String[] args) {
        System.out.println("M3 – Exercici Extra 1");
        System.out.println("");
        
        int numero = 0;
        int doble = 0;
        int triple = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un número entero: ");
        numero = input.nextInt();
        
        doble = numero * 2;
        triple = numero * 3;
        
        System.out.println("Número ingresado: " +numero);
        System.out.println("Doble: " +doble);
        System.out.println("Triple: " +triple);
        input.close();
    }
}
