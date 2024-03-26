/*
M3 – Exercício Extra 2
NOTA Este exercício requer algum conhecimento do módulo seguinte (Estruturas Condicionais).
Escreva um programa Java que solicite um número inteiro e, se for menor que 10, 
atribua-o a uma variável do tipo int, chamada varInt.
Caso contrário, ele atribuirá à variável varInt o número 1.
(Use o operador condicional para isso? :) 
Em seguida, imprima a tabuada de multiplicação para essa variável.
 */
package M3exeEXTRA02;
import java.util.Scanner;

public class M3_Ex2_Extra_Leandro_Gusmao {

    public static void main(String[] args) {
        System.out.println("M3 – Exercici Extra 2");
        System.out.println("");
                
        int numero = 0;
        int varInt = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un número entero: ");
        numero = input.nextInt();
        
        if (numero < 10){
            varInt = numero;
        } else {
            varInt = 1;
        }
        System.out.println("\nTabla del número ingresado: ");
        System.out.println(varInt + " x 1 = " +(varInt * 1));
        System.out.println(varInt + " x 2 = " +(varInt * 2));
        System.out.println(varInt + " x 3 = " +(varInt * 3));
        System.out.println(varInt + " x 4 = " +(varInt * 4));
        System.out.println(varInt + " x 5 = " +(varInt * 5));
        System.out.println(varInt + " x 6 = " +(varInt * 6));
        System.out.println(varInt + " x 7 = " +(varInt * 7));
        System.out.println(varInt + " x 8 = " +(varInt * 8));
        System.out.println(varInt + " x 9 = " +(varInt * 9));
        System.out.println(varInt + " x 10 = " +(varInt * 10));
        input.close();
    }
}
