/*
M3 – Exercício 1
Crie um programa que pergunte ao usuário: Nome, sobrenome e idade.
Assim que o usuário terminar de inserir os dados, eles deverão ser exibidos na tela.
*/
package M3exe01;
import java.util.Scanner;
public class M3_Ex1_Leandro_Gusmao {

	public static void main(String[] args) {
		System.out.println("M3 – Exercici 1");
        System.out.println("");
        
        String nombre = "";
        String apellido = "";
        int edad = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido = input.nextLine();
        System.out.println("Introduzca su edad: ");
        edad = input.nextInt();
        
        System.out.println("Hola, " +nombre+ " " +apellido+ ". Tiene " +edad+ " años!");
        input.close();	
	}
}
