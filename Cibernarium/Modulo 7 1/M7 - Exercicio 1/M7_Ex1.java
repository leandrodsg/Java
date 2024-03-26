/*
Crie um programa onde o usuário insere três notas e o programa calcula a média.
Caso a média seja inferior a 5, a seguinte mensagem deverá ser exibida na tela: 
“Você não passou no curso. Você tem que se recuperar" .
Se a média estiver entre 5 e 7 deverá mostrar: 
“Parabéns! Você passou, mas deve continuar praticando . ”
Se a média for superior a 7 deverá aparecer: 
"Parabéns! Você passou no curso! Vá para o próximo nível!"
*/
package m71_ex1_leandro_gusmao;
import java.util.Scanner; 

public class M71_Ex1_Leandro_Gusmao {

	public static void main(String[] args) {
		System.out.println("M7.1 – Exercici 1");
        System.out.println("");
        
        double soma = 0d;
        double media = 0d;
        double nota = 0d;
        		
        Scanner input = new Scanner(System.in);
        double[] notas = new double[3];
        for (int i = 0; i < 3; i++) {
            boolean notaValida = false;
            while (!notaValida) {
                System.out.print("Ingrese la nota " + (i + 1) + " (0 - 10): ");
                nota = input.nextDouble();
                if (nota >= 0 && nota <= 10) {
                    notas[i] = nota;
                    soma += notas[i];
                    notaValida = true;
                } else {
                    System.out.println("Nota inválida. Ingrese una nota entre 0 y 10.");
                }
            }
        }
        media = soma / 3;
        System.out.printf("Promedio: %.2f%n", media);
        if (media < 5) {
            System.out.println("No pasaste el curso. Debes recuperarte");
        } else if (media <= 7) {
            System.out.println("¡Felicidades! Pasaste, pero debes seguir practicando");
        } else {
            System.out.println("¡Felicidades! Pasaste el curso. ¡Ve al próximo nivel!");
        }
        input.close();
	}
}
