package m72_ex4_leandro_gusmao;
import java.util.Scanner;

public class M72_Ex4_Leandro_Gusmao {

	public static void main(String[] args) {
		System.out.println("M7.2 – Exercici 4");
        System.out.println("");
        
        int numLineas = 0;
        		
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el número de líneas:");
        numLineas = input.nextInt();

        for (int i = 1; i <= numLineas * 2 - 1; i++) {
            int numAsteriscos;
            if (i <= numLineas) {
                numAsteriscos = i;
            } else {
                numAsteriscos = numLineas * 2 - i;
            }

            for (int j = 1; j <= numAsteriscos; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        input.close();
	}
}
