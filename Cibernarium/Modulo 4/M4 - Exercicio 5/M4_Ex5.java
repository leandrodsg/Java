/*
M4 – Exercício 5
Faça um programa que peça dois números e um operador (+,-,*,/).
Ao final, o programa deve imprimir na tela o resultado
da execução da operação contendo a variável do operador.
*/
package m4_ex5_leandro_gusmao;
import java.util.Scanner;
public class M4_Ex5_Leandro_Gusmao {

    public static void main(String[] args) {
        System.out.println("M4 – Exercici 5");
        System.out.println("");
        
        int num1 = 0;
        int num2 = 0;
        char operador = ' ';
        double resultado = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Indica un valor inicial");
        num1 = input.nextInt();
        System.out.println("Indica un valor para el segundo número");
        num2 = input.nextInt();
        System.out.println("¿Qué operación deseas realizar (+, -, *, /)?");
        operador = input.next().charAt(0);

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = (double)num1 / num2;
                } else {
                    System.out.println("¡No se puede dividir por cero!");
                    //return;
                }
                break;
            default:
                System.out.println("Operador no válido!");
                //return;
        }
        System.out.println("El resultado de: " + num1 + " " + operador + " " + num2 + " = " + resultado);
        input.close();    
    }
}
