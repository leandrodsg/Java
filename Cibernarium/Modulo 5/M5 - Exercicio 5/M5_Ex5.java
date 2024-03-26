/*
Você deve modificar o programa de bolsas (M4 Exercício 3)
Agora o programa deve poder dar 5 bolsas.
O programa solicitará os dados dos alunos até a concessão dessas 5 bolsas.
Depois que o programa tiver atribuído as 5 bolsas, 
os nomes dos 5 alunos bolsistas deverão aparecer na tela.
*/
package m5_ex5_leandro_gusmao;

import java.util.Scanner;

public class M5_Ex5_Leandro_Gusmao {

	public static void main(String[] args) {
		System.out.println("M5 – Exercici 5");
        System.out.println("");
        
		String[] bolsistas = new String[5];
        int bolsasConcedidas = 0;

        Scanner input = new Scanner(System.in);
        while (bolsasConcedidas < 5) {
        	String nombre = "";
            System.out.println("Introduce tu nombre:");
            nombre = input.next();

            int edad = 0;
            System.out.println("Introduce tu edad:");
            edad = input.nextInt();

            String universitario = "";
            System.out.println("¿Tienes título universitario? (SI / NO):");
            universitario = input.next();
            while (!(universitario.equalsIgnoreCase("SI") || universitario.equalsIgnoreCase("NO"))) {
                System.out.println("Por favor, responde con 'SI' o 'NO'.");
                universitario = input.next();
            }

            String desempleado = "";
            System.out.println("¿Estás desempleado? (SI / NO):");
            desempleado = input.next();
            while (!(desempleado.equalsIgnoreCase("SI") || desempleado.equalsIgnoreCase("NO"))) {
                System.out.println("Por favor, responde con 'SI' o 'NO'.");
                desempleado = input.next();
            }

            boolean recebeBolsa = false;
            if ((edad >= 18 && desempleado.equalsIgnoreCase("SI")) || (edad >= 18 && universitario.equalsIgnoreCase("SI"))) {
                recebeBolsa = true;
            }

            if (recebeBolsa) {
                System.out.println("¡Felicidades! El estudiante TIENE derecho a una beca de estudio.");
                bolsistas[bolsasConcedidas] = nombre;
                bolsasConcedidas++;
            } else {
                System.out.println("El estudiante NO TIENE derecho a una beca de estudio.");
            }
        }

        System.out.println("Los alumnos beneficiarios de la beca son:");
        for (String bolsista : bolsistas) {
            System.out.println(bolsista);
        }
        input.close();
	}
}
