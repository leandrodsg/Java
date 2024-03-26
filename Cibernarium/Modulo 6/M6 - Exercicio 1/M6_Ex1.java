/*
Modifique a calculadora arcaica (M4 Exercício 5). 
O programa pede ao usuário que insira dois números e a operação que deseja realizar.
Cada operação (adição, subtração, multiplicação, divisão e módulo)
 será programada em um método diferente.
 */
package m6_ex1_leandro_gusmao;
import java.util.Scanner;

public class M6_Ex1_Leandro_Gusmao {

	public static void main(String[] args) {
		System.out.println("M6 – Exercici 1");
        System.out.println("");
        
        int num1 = 0;
        int num2 = 0;
        char operador = ' ';
        
        Scanner input = new Scanner(System.in);
        System.out.println("Indica un valor inicial:");
        num1 = input.nextInt();
        System.out.println("Indica un valor para el segundo número:");
        num2 = input.nextInt();
        System.out.println("¿Qué operación deseas realizar (+, -, *, /)?");
        operador = input.next().charAt(0);

        double resultado = 0;

        switch (operador) {
            case '+':
                resultado = adicao(num1, num2);
                break;
            case '-':
                resultado = subtracao(num1, num2);
                break;
            case '*':
                resultado = multiplicacao(num1, num2);
                break;
            case '/':
                resultado = divisao(num1, num2);
                break;
            default:
                System.out.println("Operador no válido!");
                break;
        }
        System.out.println("El resultado de: " + num1 + " " + operador + " " + num2 + " = " + resultado);
        input.close();    
    }
    
	public static double adicao(int num1, int num2) {
        return num1 + num2;
    }
    
    public static double subtracao(int num1, int num2) {
        return num1 - num2;
    }
    
    public static double multiplicacao(int num1, int num2) {
        return num1 * num2;
    }
    
    public static double divisao(int num1, int num2) {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            System.out.println("¡No se puede dividir por cero!");
            return 0;
        }
	}
}
