package m72_ex3_leandro_gusmao;
import java.util.Scanner;
public class M72_Ex3_Leandro_Gusmao {

	public static void main(String[] args) {
		System.out.println("M7.2 – Exercici 3");
        System.out.println("");
        
        int numLineas = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el número de líneas:");
        numLineas = input.nextInt();

        for (int i = numLineas; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
        input.close();
	}
}
