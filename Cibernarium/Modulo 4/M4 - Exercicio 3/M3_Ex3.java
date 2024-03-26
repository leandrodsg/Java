/*
M4 – Exercício 3
Uma escola de idiomas concede bolsas de estudo a futuros alunos
se eles atenderem a uma série de requisitos.
O aluno recebe uma bolsa de estudos se for maior de idade e 
possuir diploma universitário. Ou também é atribuída uma bolsa de estudos 
se o aluno estiver desempregado.
O programa pede os três dados por tela e ao final mostra se o aluno tem bolsa ou não. 
*/
package m4_ex3_leandro_gusmao;
import java.util.Scanner;
public class M4_Ex3_Leandro_Gusmao {
    
    public static void main(String[] args) {
    	System.out.println("M4 – Exercici 3");
        System.out.println("");
        
        int idade = 0;
        String universitario = "";
        String desempleado = "";
        
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        idade = input.nextInt();
        System.out.println("¿El estudiante tiene título universitario? (SI / NO):");
        universitario = input.next();
        /*
        //geeksforgeeks.org/java-string-equalsignorecase-method-with-examples/
        if (!(universitario.equalsIgnoreCase("SI") || universitario.equalsIgnoreCase("NO"))) {
            System.out.println("Por favor, responda con 'SI' o 'NO'.");
            universitario = input.next();
        }
		*/
        System.out.println("¿El estudiante está desempleado? (SI / NO):");
        desempleado = input.next();
        /*
        if (!(desempleado.equalsIgnoreCase("SI") || desempleado.equalsIgnoreCase("NO"))) {
            System.out.println("Por favor, responda con 'SI' o 'NO'.");
            desempleado = input.next();
        }
		*/
        boolean recebeBolsa = false;
        if ((idade >= 18 && desempleado.equalsIgnoreCase("SI")) || (idade >= 18 && universitario.equalsIgnoreCase("SI"))) {
            recebeBolsa = true;
        }
        
        if (recebeBolsa) {
            System.out.println("¡Felicidades! El estudiante TIENE derecho a una beca de estudio.");
        } else {
            System.out.println("El estudiante NO TIENE derecho a una beca de estudio.");
        }
        input.close();
    }
}
