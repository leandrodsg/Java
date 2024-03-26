/*
O programa pede dois números inteiros e depois calcula a soma 
dos valores entre os dois números, inclusive.
Exemplo: 4 e 10 -> resultado = 4 + 5 + 6 + 7 + 8 + 9 + 10 = 49
*/

package m5_ex2_leandro_gusmao;
import java.util.Scanner;
import java.util.ArrayList;

public class M5_Ex2_Leandro_Gusmao {

    public static void main(String[] args) {
    	System.out.println("M5 – Exercici 2");
        System.out.println("");

        int num1 = 0;
        int num2 = 0;
        int menor = 0;
        int maior = 0;
        int soma = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo número:");
        num2 = input.nextInt();

        if (num1 < num2) {
            menor = num1;
            maior = num2;
        } else {
            menor = num2;
            maior = num1;
        }
        /*
        int[] numeros = new int[maior - menor + 1];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = menor + i;
            soma += numeros[i];
        }
		*/
        
        //geeksforgeeks.org/arraylist-in-java/
        ArrayList<Integer> numeros = new ArrayList<Integer>(maior - menor + 1);

        for (int i = menor; i <= maior; i++) {
            numeros.add(i);
            soma += i;
        }
        System.out.print("La suma de los valores entre " + num1 + " y " + num2 + " es: ");
        /*
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(" + ");
            }
        }
        */
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i));
            if (i < numeros.size() - 1) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + soma);
        input.close();
    }

}
