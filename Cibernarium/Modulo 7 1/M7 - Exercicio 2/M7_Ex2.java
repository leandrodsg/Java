/*
O usuário insere a quantidade de notas que deseja inserir (o número de alunos na turma).
Para cada aluno, o programa solicita que o usuário insira as notas.
Uma vez inseridas todas as notas, o programa calcula a média da turma.
Com base na média da turma, o programa fornece uma mensagem específica:
Se a média for inferior a 5, exibe: "A nota média da turma está suspensa. 
Os alunos deverão tirar suas dúvidas e trabalhar mais."
Se a média estiver entre 5 e 7, exibe: 
"A nota média da turma é boa, mas os alunos devem melhorar seu trabalho pessoal."
Para médias acima de 7, exibe: 
"Parabéns! A nota média da turma corresponde ao esforço realizado."
*/
package m71_ex2_leandro_gusmao;
import java.util.Scanner;

public class M71_Ex2_Leandro_Gusmao {

	public static void main(String[] args) {
		System.out.println("M7.1 – Exercici 2");
        System.out.println("");
        
        int qtdNotas = 0;
        double nota = 0d;
        double soma = 0d;
        double media = 0d;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Quantas notas deseja inserir para a turma?");
        qtdNotas = input.nextInt();
        input.nextLine();
        
        double[] notas = new double[qtdNotas];
        
        for (int i = 0; i < qtdNotas; i++) {
        	boolean notaValida = false;
        	while (!notaValida) {
        		System.out.print("Ingrese la nota " + (i + 1) + " (0 - 10): ");
        		nota = input.nextDouble();
        		if (nota >= 0 && nota <=10) {
        			notas[i] = nota;
        			soma += notas[i];
        			notaValida = true;
        		} else {
                    System.out.println("Nota inválida. Ingrese una nota entre 0 y 10.");
                }
        	}
        }
        media = soma/qtdNotas;
        System.out.printf("Promedio de clase: %.2f%n", media);
        
        if (media < 5) {
            System.out.println("Se suspende la nota promedio de la clase. "
            		+ "Los estudiantes deben aclarar sus dudas y trabajar más duro.");
        } else if (media <= 7) {
            System.out.println("La nota media de la clase es buena, "
            		+ "pero los alumnos deben mejorar su trabajo personal.");
        } else {
            System.out.println("¡Felicidades! La nota media de la clase corresponde al esfuerzo realizado.");
        }
        input.close();
	}

}
