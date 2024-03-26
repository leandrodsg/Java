/*
Crie uma lista de tarefas. 
Faça um menu que permita ao usuário adicionar, 
mostrar e excluir tarefas, bem como sair do aplicativo.
*/
package m71_ex5_leandro_gusmao;
import java.util.Scanner;
import java.util.ArrayList;

public class M71_Ex5_Leandro_Gusmao {

	public static void main(String[] args) {
		System.out.println("M7.1 – Exercici 5");
        System.out.println("");
        
        ArrayList<String> tareas = new ArrayList<>();
        
        int opcion = 0;
        String tarea = "";
        int indice = 0;
        
        
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Menu:");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Salir");
            System.out.println("Elige una opción:");
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la tarea:");
                    tarea = input.nextLine();
                    tareas.add(tarea);
                    System.out.println("Tarea agregada correctamente.\n");
                    break;
                case 2:
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas en la lista.\n");
                    } else {
                        System.out.println("Lista de tareas:");
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println((i + 1) + ". " + tareas.get(i));
                        }
                    }
                    break;
                case 3:
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas para eliminar.\n");
                    } else {
                        System.out.println("Ingrese el número de tarea a eliminar:");
                        indice = input.nextInt();
                        if (indice >= 1 && indice <= tareas.size()) {
                            tareas.remove(indice - 1);
                            System.out.println("Tarea eliminada correctamente.\n");
                        } else {
                            System.out.println("Número de tarea inválido.\n");
                        }
                    }
                    break;
                case 4:
                    System.out.println("¡Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elija una opción válida.\n");
                    break;
            }
        } while (opcion != 4);
        input.close();
	}
}
