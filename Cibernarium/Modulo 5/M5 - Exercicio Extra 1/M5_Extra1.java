/*
Jogue um jogo para adivinhar um número aleatório N, entre 1 e 500.
Se a distância entre o número a ser adivinhado e o do usuário for 50 ou mais, o programa deverá dizer:
“Frio, frio: seu número é maior” ou “Frio, frio: seu número é menor”
Se a distância entre o número a ser adivinhado e o do usuário estiver entre 15 e 50, o programa deverá dizer:
“Tebi, Tebi: seu número é maior” ou “Tebi, Tebi: seu número é menor” 
E se a distância entre o número a ser adivinhado e o do usuário for menor que 15, o programa deverá dizer:
“Quente, quente: seu número é maior” ou “Quente, quente: seu número é menor”
O processo termina quando o usuário estiver correto.
*/
package m5_extra1_leandro_gusmao;

import java.util.Scanner;

public class M5_Extra1_Leandro_Gusmao {

	public static void main(String[] args) {
		System.out.println("M5 – Exercici EXTRA 1");
        System.out.println("");
        
        int numeroAleatorio = (int) (Math.random() * 500) + 1;
        //System.out.println("Numero Ordenador: " +numeroAleatorio);
        int palpite = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Intenta adivinar el número entre 1 y 500.");
        while (palpite != numeroAleatorio) {
            System.out.print("Tu intento: ");
            palpite = input.nextInt();

            // Valor absoluto para no considerar negativos
            // geeksforgeeks.org/java-math-abs-method-examples/
            int distancia = Math.abs(numeroAleatorio - palpite);

            if (distancia >= 50) {
                if (palpite > numeroAleatorio) {
                    System.out.println("Frío, frío: tu número es mayor.");
                } else {
                    System.out.println("Frío, frío: tu número es menor.");
                }
            } else if (distancia >= 15) {
                if (palpite > numeroAleatorio) {
                    System.out.println("Tibio, tibio: tu número es mayor.");
                } else {
                    System.out.println("Tibio, tibio: tu número es menor.");
                }
            } else {
                if (palpite > numeroAleatorio) {
                    System.out.println("Caliente, caliente: tu número es mayor.");
                } else {
                    System.out.println("Caliente, caliente: tu número es menor.");
                }
            }
        }
        System.out.println("¡Felicidades, has acertado el número " + numeroAleatorio + "!");
        input.close();
	}

}
