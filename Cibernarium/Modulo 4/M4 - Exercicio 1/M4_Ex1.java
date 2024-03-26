/*
M4 – Exercício 1
Modifique o exercício 1 do módulo 3. Uma vez inseridos os dados, 
o programa deverá exibir na tela o seguinte:
Se o usuário tiver 18 anos ou mais: "Nome Sobrenome, você tem IDADE"
Se o usuário for menor de 18 anos: “Nome Sobrenome, você é MENOR DE IDADE”.
 */
package m4_ex1_leandro_gusmao;
import java.util.Scanner;
public class M4_Ex1_Leandro_Gusmao {

    public static void main(String[] args) {
        System.out.println("M4 – Exercici 1");
        System.out.println("");
        
        String nome = "";
        String apelido = "";
        int idade = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nome = input.nextLine();
        System.out.println("Ingrese su apellido: ");
        apelido = input.nextLine();
        System.out.println("Introduzca su edad: ");
        idade = input.nextInt();
        
        if(idade >= 18){
            System.out.println("Hello " +nome+ " " +apelido+ ", eres MAYOR de edad!");
        } else {
            System.out.println("Hello " +nome+ " " +apelido+ ", eres MENOR de edad!");
        }
        input.close();;
    }
}
