/*
(M5) Exercici 1
O programa pergunta quantas palavras o usuário deseja inserir.
Este, digite o número e então aparecerá a seguinte mensagem: “Digite a palavra”.
Esta mensagem é exibida tantas vezes quanto o número de palavras que o usuário disse que deseja inserir.
As palavras são armazenadas em um arrayList e, depois de inseridas, são exibidas na tela.
*/
package m5_ex1_leandro_gusmao;
import java.util.Scanner;

public class M5_Ex1_Leandro_Gusmao {
    public static void main(String[] args) {
    	System.out.println("M5 – Exercici 1");
        System.out.println("");
        
        int qtdPal = 0;
    	
    	Scanner input = new Scanner(System.in);
        System.out.println("¿Cuántas palabras desea ingresar?");
        qtdPal = input.nextInt();
        
        String[] palabras = new String[qtdPal];
        for (int i = 0; i < qtdPal; i++) {
            System.out.println("Ingrese la palabra(" + (i+1) + "): ");
            palabras[i] = input.next();
        }
        
        System.out.println("Palabras Ingresadas: " +palabras.length);
        System.out.println("Las palabras ingresadas son:");    
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Palabra " +(i+1)+ ": " +palabras[i]);
        }
        input.close();
    }
}
