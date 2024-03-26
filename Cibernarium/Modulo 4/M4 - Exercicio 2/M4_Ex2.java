/*
M4 – Exercício 2
Este programa pergunta a idade do usuário, dependendo disso, 
mostraremos uma das seguintes mensagens na tela:
Se ele tiver 5 anos ou menos: pré-escola.
Se tiver entre 6 e 11 anos: ensino fundamental.
Se ele tiver entre 12 e 15 anos: ESO.
Se tiver entre 16 e 17 anos: Bacharelado.
Se for maior de idade: FP ou Universidade.
 */
package m4_ex2_Leandro_Gusmao;
import java.util.Scanner;
public class M4_Ex2_Leandro_Gusmao {

    public static void main(String[] args) {
        System.out.println("M4 – Exercici 2");
        System.out.println("");
        
        int idade = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuantos años tienes?");
        idade = input.nextInt();
        
        if (idade <= 0) {
            System.out.println("[ERROR]¡No puedes tener menos de cero!");
            } else if (idade <= 5) {
                System.out.println("Preescolar");
		} else if ((idade >= 6) && (idade <= 11)) {
                    System.out.println("Primaria");
		} else if ((idade >= 12) && (idade <= 15)) {
                    System.out.println("ESO");
		} else if ((idade >= 16) && (idade <= 17)) {
                    System.out.println("Bachillerato");
		} else {
                    System.out.println("Universidad");
		}
        input.close();
    }
}
