/*
Este programa calcula a idade média de um número de pessoas. 
Este número deverá ser solicitado ao usuário.
Deve ser criada uma função que se encarrega de perguntar as idades ao usuário e calcular a idade média.
A função receberá como parâmetro o nº. de pessoas a quem a idade deve ser perguntada.
A idade das pessoas só será válida se for entre 0 e 120 anos.
A média das idades inseridas deve ser retornada pela função (return).
*/
package m6_ex2_leandro_gusmao;
import java.util.Scanner;

public class M6_Ex2_Leandro_Gusmao {

	public static void main(String[] args) {
		System.out.println("M6 – Exercici 2");
        System.out.println("");
        
        int personas = 0;
        double edadMedia = 0d;
        
		Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el número de personas:");
        personas = input.nextInt();
        input.nextLine();
        
        edadMedia = edadMedia(personas);
        System.out.println("La edad media de las personas es: " + edadMedia);

        input.close();
    }

    public static double edadMedia(int personas) {
        int suma = 0;
        int edad = 0;
        
        Scanner input = new Scanner(System.in);
        
        for (int i = 1; i <= personas; i++) {
            System.out.println("Ingrese la edad de la persona " + i + ":");
            edad = input.nextInt();
            input.nextLine();
            
            while (edad < 0 || edad > 120) {
                System.out.println("Edad no válida. Debe estar entre 0 y 120 años.");
                System.out.println("Ingrese la edad de la persona " + i + ":");
                edad = input.nextInt();
                input.nextLine();
            }

            suma += edad;
        }
        input.close();

        if (personas != 0) {
            return (float) suma / personas;
        } else {
            return 0;
        }

	}

}
