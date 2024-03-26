/*
Crie um programa onde o usuário insira uma temperatura em °C 
e a conversão em °Fahrenheit seja exibida na tela
*/
package m71_ex8_leandro_gusmao;
import java.util.Scanner;

public class M71_Ex8_Leandro_Gusmao {

	public static void main(String[] args) {
		System.out.println("M7.1 – Exercici 8");
        System.out.println("");
        
        double temperaturaCelsius = 0d;
        double temperaturaFahrenheit = 0d;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca la temperatura en grados Celsius:");
        temperaturaCelsius = input.nextDouble();
        
        temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;

        System.out.println("La temperatura en Fahrenheit es: " + temperaturaFahrenheit + " °F");

        input.close();
	}

}
