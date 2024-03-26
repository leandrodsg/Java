/*
É necessário modificar o programa anterior para adicionar uma nova funcionalidade: 
defina um número máximo de 5 tentativas.
Caso o usuário acerte o número escolhido pelo programa logo antes dessas 5 tentativas, 
o programa exibe a seguinte mensagem na tela: “Parabéns, o número é X
e você precisou de Y tentativas para acertar”.
Se você não acertar o número antes de 5 tentativas, o programa mostra na tela: 
"Você fez muitas tentativas! O número é X".
*/
package m5_ex4_leandro_gusmao;
import java.util.Scanner;

public class M5_Ex4_Leandro_Gusmao {

	public static void main(String[] args) {
		System.out.println("M5 – Exercici 4");
        System.out.println("");
        
        int numeroAleatorio = (int) Math.ceil((Math.random() * 10));
        int intentosMaximos = 5;
        int intentos = 0;
        boolean acertado = false;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Intenta adivinar el número entre 1 y 10 generado por el programa:");
        
        while (intentos < intentosMaximos) {
            System.out.print("Ingresa tu intento: ");
            int intento = input.nextInt();
            intentos++;
            
            //geeksforgeeks.org/break-statement-in-java/
            if (intento == numeroAleatorio) {
                acertado = true;
                break;
            } else if (intento < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }
        }

        if (acertado) {
            System.out.println("¡Parabéns, el número es " + numeroAleatorio + " y necesitaste " + intentos + " intentos para acertar!");
        } else {
            System.out.println("¡Hiciste demasiados intentos! El número es " + numeroAleatorio + ".");
        }
        input.close();
	}
}
