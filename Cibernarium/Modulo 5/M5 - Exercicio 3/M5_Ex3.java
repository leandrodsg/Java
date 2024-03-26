/*
Math.ceil((Math.random() * 10));
Retorna um número entre 1 e 10 aleatoriamente.
O exercício consiste em o usuário ter que adivinhar o número escolhido aleatoriamente pelo programa.
O programa pede números ao usuário até que ele corresponda ao número aleatório gerado pelo programa.
Assim que o usuário adivinhar o número, a seguinte mensagem será exibida na tela: 
“Parabéns, o número era X”
*/
package m5_ex3_leandro_gusmao;
import java.util.Scanner;

public class M5_Ex3_Leandro_Gusmao {

	public static void main(String[] args) {
		System.out.println("M5 – Exercici 3");
        System.out.println("");
		
		int numeroAleatorio = (int) Math.ceil((Math.random() * 10));
		int intento = 0;
		
		Scanner input = new Scanner(System.in);
        System.out.println("Intenta adivinar el número entre 1 y 10 generado por el programa:");
        
        while (intento != numeroAleatorio) {
            System.out.print("Ingresa tu intento: ");
            intento = input.nextInt();

            if (intento < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroAleatorio) {
                System.out.println("El número es menor.");
            }
        }
        System.out.println("¡Felicitaciones, el número era " + numeroAleatorio + "!");
        input.close();
	}
}
