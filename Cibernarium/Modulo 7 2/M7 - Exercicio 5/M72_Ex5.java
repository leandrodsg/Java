/*
Escreva um programa que, dada uma arraylist de inteiros, 
gere uma nova arraylist com os elementos na ordem inversa. 
Ao terminar, deverá imprimir o novo arraylist.
*/
package m72_ex5_leandro_gusmao;
import java.util.ArrayList;

public class M72_Ex5_Leandro_Gusmao {

	public static void main(String[] args) {
		System.out.println("M7.2 – Exercici 5");
        System.out.println("");
		
        ArrayList<Integer> listaOriginal = criarAleatoria(10);

        ArrayList<Integer> listaReversa = new ArrayList<>();
        for (int i = listaOriginal.size() - 1; i >= 0; i--) {
            listaReversa.add(listaOriginal.get(i));
        }

        System.out.println("La lista original es:");
        System.out.println(listaOriginal);
        System.out.println(" ");
        System.out.println("La lista inversa es:");
        System.out.println(listaReversa);
    }

    public static ArrayList<Integer> criarAleatoria(int tamanho) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < tamanho; i++) {
            lista.add((int) (Math.random() * 50)); 
        }
        return lista;
	}
}
