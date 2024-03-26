/*
M4 – Exercício 6
Crie um programa que pergunte ao usuário qual dia e mês ele nasceu, 
com esta informação o programa mostra na tela a qual signo do zodíaco ele pertence.
Áries-Áries (21.03 - 19.04)
Touro-Touro (20.04 - 20.05)
Gêmeos-Gêmeos (21.05 - 20.06)
Caranguejo-Câncer (21.06 - 22.07)
Leão-Leão (23.07 – 22.08)
Virgem-Virgem (23.08 – 22.09)
Libra-Libra (23.09 - 22.10)
Escorpião-Escorpião (23.10 - 21.11)
Sagitário-Sagitário (22.11 - 21.12)
Capricórnio-Capricórnio (22.12 - 19.01)
Aquário-Aquário (20.01 - 18.02)
Peixe-Peixes (19.02 - 20.03)
*/
package m4_ex6_leandro_gusmao;
import java.util.Scanner;
public class M4_Ex6_Leandro_Gusmao {

    public static void main(String[] args) {
        System.out.println("M4 – Exercici 6");
        System.out.println("");
        
        int dia = 0;
        int mes = 0;
        String signo = "";
        
        Scanner input = new Scanner(System.in);
        System.out.println("¿Qué día naciste?");
        dia = input.nextInt();
        System.out.println("¿De qué mes (1-12)?");
        mes = input.nextInt();
        
        if (mes == 1) {
            if (dia <= 19) {
                signo = "Capricornio";
            } else {
                signo = "Acuario";
            }
        } else if (mes == 2) {
            if (dia <= 18) {
                signo = "Acuario";
            } else {
                signo = "Piscis";
            }
        } else if (mes == 3) {
            if (dia <= 20) {
                signo = "Piscis";
            } else {
                signo = "Aries";
            }
        } else if (mes == 4) {
            if (dia <= 19) {
                signo = "Aries";
            } else {
                signo = "Tauro";
            }
        } else if (mes == 5) {
            if (dia <= 20) {
                signo = "Tauro";
            } else {
                signo = "Géminis";
            }
        } else if (mes == 6) {
            if (dia <= 20) {
                signo = "Géminis";
            } else {
                signo = "Cangrejo";
            }
        } else if (mes == 7) {
            if (dia <= 22) {
                signo = "Cangrejo";
            } else {
                signo = "Leo";
            }
        } else if (mes == 8) {
            if (dia <= 22) {
                signo = "Leo";
            } else {
                signo = "Virgo";
            }
        } else if (mes == 9) {
            if (dia <= 22) {
                signo = "Virgo";
            } else {
                signo = "Libra";
            }
        } else if (mes == 10) {
            if (dia <= 22) {
                signo = "Libra";
            } else {
                signo = "Escorpio";
            }
        } else if (mes == 11) {
            if (dia <= 21) {
                signo = "Escorpio";
            } else {
                signo = "Sagitario";
            }
        } else if (mes == 12) {
            if (dia <= 21) {
                signo = "Sagitario";
            } else {
                signo = "Capricornio";
            }
        } else {
            signo = "Data no es valida";
        }
        System.out.println("Tu signo del zodíaco es: " + signo);
        input.close();
    }
}
