/*
M4 – Exercício 4
O usuário digita um mês por tela e através de uma alternância com os 12 meses do ano,
o programa calcula os dias do mês e exibe o seguinte: 
Exemplo: Se o número digitado for 1, então deverá aparecer na tela:
"O mês de janeiro tem 31 dias"
*/
package m4_ex4_leandro_gusmao;
import java.util.Scanner;
public class M4_Ex4_Leandro_Gusmao {

    public static void main(String[] args) {
        System.out.println("M4 – Exercici 4");
        System.out.println("");
        
        int mes = 0;
        String resultado = "";
        
        Scanner input = new Scanner(System.in);
        System.out.println("Di un numero de mes(del 1 al 12)");
        mes = input.nextInt();
        
        switch (mes) {
		case 1:
            resultado = "Enero tiene 31 días";
            break;
		case 2:
            resultado = "Febrero tiene 28 días";
            break;
		case 3:
            resultado = "Marzo tiene 31 días";
            break;
		case 4:
            resultado = "Abril tiene 30 días";
            break;
		case 5:
            resultado = "Mayo tiene 31 días";
            break;
		case 6:
            resultado = "Junio tiene 30 días";
            break;
		case 7:
            resultado = "Julio tiene 30 días";
            break;
		case 8:
            resultado = "Agosto tiene 31 días";
            break;
		case 9:
            resultado = "Septiembre tiene 30 días";
            break;
		case 10:
            resultado = "Octubre tiene 31 días";
            break;
		case 11:
            resultado = "Noviembre tiene 30 días";
            break;
		case 12:
            resultado = "Diciembre tiene 31 días";
            break;
		default:
            resultado = "Solo puedes ingresar entre 1 y 12";
            break;
		}
		System.out.println(resultado);
		input.close();
    }
}
