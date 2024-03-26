/*
M4 – Exercício Extra 3
Esta linha de código:
int numRandom = (int)(Math.random() * 3) + 1;
Retorna um número entre 1 e 3 aleatoriamente.
Escreva um programa que permita brincar de pedra, papel ou tesoura com o computador.
Para isso o computador deverá gerar um número aleatório entre 1 e 3 representando
pedra, papel ou tesoura respectivamente, e o usuário deverá responder por sua vez
com um número entre 1 e 3 após mostrar a seguinte tela:
Vamos brincar de pedra, papel ou tesoura:

pedra
papel
tesoura
*/
package M4exeEXTRA03;
import java.util.Scanner;

public class M4_Ex3_Extra_Leandro_Gusmao {

    public static void main(String[] args) {
        System.out.println("M4 – Exercici EXTRA 3");
        System.out.println("");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Vamos a jugar a piedra, papel o tijeras:");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijeras");
        System.out.print("Elige (1-3): ");
        int elecUser = input.nextInt();

        if (elecUser < 1 || elecUser > 3) {
            System.out.println("Entiendo que no quieres jugar. ¡Adiós!");
        } else {
            int elecOrd = (int) (Math.random() * 3) + 1;
            
            String euser = "";
            String eord = "";
            if (elecUser == 1) {
                euser = "piedra";
            } else if (elecUser == 2) {
                euser = "papel";
            } else if (elecUser == 3) {
                euser = "tijeras";
            } else {
                euser = "";
            }

            if (elecOrd == 1) {
                eord = "piedra";
            } else if (elecOrd == 2) {
                eord = "papel";
            } else if (elecOrd == 3) {
                eord = "tijeras";
            } else {
                eord = "";
            }

            System.out.println("Yo " + eord + " y tú " + euser + ".");
            
            if (elecOrd == 1) { // ordenador piedra
                if (elecUser == 1) {
                    System.out.println("¡Empate!");
                } else if (elecUser == 2) {
                	System.out.println("¡Ganaste tú!");
                } else if (elecUser == 3) {
                	System.out.println("¡Gané yo!");
                } else {
                    System.out.println("Entiendo que no quieres jugar. ¡Adiós!");
                }
            } else if (elecOrd == 2) { // ordenador papel
                if (elecUser == 1) {
                	System.out.println("¡Gané yo!");
                } else if (elecUser == 2) {
                    System.out.println("¡Empate!");
                } else if (elecUser == 3) {
                	System.out.println("¡Ganaste tú!");
                } else {
                    System.out.println("Entiendo que no quieres jugar. ¡Adiós!");
                }
            } else if (elecOrd == 3) { // ordenador tijeras
                if (elecUser == 1) {
                	System.out.println("¡Ganaste tú!");
                } else if (elecUser == 2) {
                	System.out.println("¡Gané yo!");
                } else if (elecUser == 3) {
                    System.out.println("¡Empate!");
                } else {
                    System.out.println("Entiendo que no quieres jugar. ¡Adiós!");
                }
            }

        }
    }
}
