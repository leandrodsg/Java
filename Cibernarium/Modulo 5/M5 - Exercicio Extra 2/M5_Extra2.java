/*
Escreva um programa que pinte a letra L em uma tela feita de asteriscos.
O programa pedirá a altura.
O poste horizontal do L terá comprimento igual à metade 
(divisão inteira por 2) da altura mais um. (Lembre-se de println e print)
*/
package m5_extra2_leandro_gusmao;
import java.util.Scanner;
public class M5_Extra2_Leandro_Gusmao {

	public static void main(String[] args) {
		
		int altura = 0;
		int horizontal = 0;
		
		Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la altura para la letra L:");
        altura = input.nextInt();
        
        //pt.stackoverflow.com/questions/208098/como-fazer-um-ret%C3%A2ngulo-de-asteriscos-usando-for
        for (int i = 0; i < altura - 1; i++) {
            System.out.println("*");
        }
        
        horizontal = altura / 2 + 1;
        
        for (int i = 0; i < horizontal; i++) {
            System.out.print("*");
        }
        System.out.println("");
        input.close();
	}
}
