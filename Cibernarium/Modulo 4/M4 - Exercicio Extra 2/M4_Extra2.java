/*
M4 – Exercício Extra 2
Peça ao usuário um número entre 0 e 99 e mostre-o escrito em letras
(você pode fazer isso em catalão ou espanhol).
Exemplo: 56 (cinquenta e seis) ou 56 (cinquenta e seis)
*/

package M4_Extra2_Leandro_Gusmao;

import java.util.Scanner;

public class M4_Extra2_Leandro_Gusmao {

	public static void main(String[] args) {
		System.out.println("M4 – Exercici EXTRA 2");
        System.out.println("");
        
        int numero = 0; 
        		
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero entre 0 y 99 : ");
        numero = input.nextInt();

        if (numero < 0 || numero > 99) {
            System.out.println("Número fuera de rango.");
        } else if (numero < 20) {
            if (numero == 0) {
                System.out.println("cero");
            } else if (numero == 1) {
                System.out.println("uno");
            } else if (numero == 2) {
                System.out.println("dos");
            } else if (numero == 3) {
                System.out.println("tres");
            } else if (numero == 4) {
                System.out.println("cuatro");
            } else if (numero == 5) {
                System.out.println("cinco");
            } else if (numero == 6) {
                System.out.println("seis");
            } else if (numero == 7) {
                System.out.println("siete");
            } else if (numero == 8) {
                System.out.println("ocho");
            } else if (numero == 9) {
                System.out.println("nueve");
            } else if (numero == 10) {
                System.out.println("diez");
            } else if (numero == 11) {
                System.out.println("once");
            } else if (numero == 12) {
                System.out.println("doce");
            } else if (numero == 13) {
                System.out.println("trece");
            } else if (numero == 14) {
                System.out.println("catorce");
            } else if (numero == 15) {
                System.out.println("quince");
            } else if (numero == 16) {
                System.out.println("dieciséis");
            } else if (numero == 17) {
                System.out.println("diecisiete");
            } else if (numero == 18) {
                System.out.println("dieciocho");
            } else if (numero == 19) {
                System.out.println("diecinueve");
            }
        } else {
            int decena = numero / 10;
            int unidad = numero % 10;
            String nombreNumero = "";
            String nombreDecena = "";
            
            switch (decena) {
                case 2:
                    nombreDecena = "veinti";
                    break;
                case 3:
                    nombreDecena = "treinta y ";
                    break;
                case 4:
                    nombreDecena = "cuarenta y ";
                    break;
                case 5:
                    nombreDecena = "cincuenta y ";
                    break;
                case 6:
                    nombreDecena = "sesenta y ";
                    break;
                case 7:
                    nombreDecena = "setenta y ";
                    break;
                case 8:
                    nombreDecena = "ochenta y ";
                    break;
                default:
                    nombreDecena = "noventa y ";
                    break;
            }

            if (unidad == 0) {
                switch (decena) {
                    case 2:
                        nombreNumero = "veinte";
                        break;
                    case 3:
                        nombreNumero = "treinta";
                        break;
                    case 4:
                        nombreNumero = "cuarenta";
                        break;
                    case 5:
                        nombreNumero = "cincuenta";
                        break;
                    case 6:
                        nombreNumero = "sesenta";
                        break;
                    case 7:
                        nombreNumero = "setenta";
                        break;
                    case 8:
                        nombreNumero = "ochenta";
                        break;
                    default:
                        nombreNumero = "noventa";
                        break;
                }
            } else {
                nombreNumero = nombreDecena;
                switch (unidad) {
                    case 1:
                        nombreNumero += "uno";
                        break;
                    case 2:
                        nombreNumero += "dos";
                        break;
                    case 3:
                        nombreNumero += "tres";
                        break;
                    case 4:
                        nombreNumero += "cuatro";
                        break;
                    case 5:
                        nombreNumero += "cinco";
                        break;
                    case 6:
                        nombreNumero += "seis";
                        break;
                    case 7:
                        nombreNumero += "siete";
                        break;
                    case 8:
                        nombreNumero += "ocho";
                        break;
                    default:
                        nombreNumero += "nueve";
                        break;
                }
            }
            System.out.println("El número escrito en letras es: " + nombreNumero);
            input.close();
        }
	}
}
