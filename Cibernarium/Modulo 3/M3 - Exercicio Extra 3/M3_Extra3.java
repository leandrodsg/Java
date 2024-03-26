/*
M3 – Exercício Extra 3
Escreva um programa Java que calcule os litros de tinta necessários
para pintar uma parede retangular.
Um litro de tinta cobre aproximadamente 12m² em uma única demão.
Crie uma constante chamada coberturaLitro para armazenar os dados de cobertura da tinta (12m²)
Você terá que perguntar ao usuário:

A altura e largura da parede (multiplicando você saberá a área da mesma)
O número de mãos a serem aplicadas. Mostra na tela os litros de tinta a serem utilizados.
 */
package M3exeEXTRA03;
import java.util.Scanner;

public class M3_Ex3_Extra_Leandro_Gusmao {

    public static void main(String[] args) {
        System.out.println("M3 – Exercici Extra 3");
        System.out.println("");
        
        final int cobredemao = 12;
        float altura = 0f;
        float ancho = 0f;
        int maos = 0;
        float area = 0f;
        float litros = 0f;

        Scanner input = new Scanner(System.in);
        System.out.println("Diga la altura de la pared");
        altura = input.nextFloat();
        System.out.println("Ahora el ancho");
        ancho = input.nextFloat();
        System.out.println("¿Cuantas manos quiere darle?");
        maos = input.nextInt();

        area = altura * ancho;
        litros = area * maos / cobredemao;
        System.out.printf("Necesitará %.2f litros de pintura", litros);
        input.close();
    }
}
