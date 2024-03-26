package debugger;

import java.util.Scanner;

public class Debugger {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numero = 0;
        
        System.out.println("Ingrese un número entero para verificar si es primo: ");
        numero = input.nextInt();
        
        if (numero > 1) {
            if (esPrimo(numero)) {
                System.out.println("¡El número " + numero + " es primo!");
            } else {
                System.out.println("El número " + numero + " no es primo.");
            }
        } else {
            System.out.println("Por favor, ingrese un número entero mayor que 1.");
        }
        input.close();
    }

    public static boolean esPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) { //comprueba si el número tiene un divisor distinto de 1 y él mismo
                return false;
            }
        }
        return true;
    }
}
		/*
		Scanner sc = new Scanner(System.in);
		
		boolean p = false;
		int n = 0;
		
		System.out.println("Escoge un número: ");
		// user elige un número y lo almacena en n
		n = sc.nextInt();
		
		// teste si el número n es mayor que 1
		if (n > 1) {
			// Si es mayor que 1, llama a la función y va verificar si n es primo
			// resultado de la función para a la variable p
			p = ep(n);
		}
		// resultado, true o false para el numero primo
		System.out.println(p);
	}

	public static boolean ep(int n) {
		// asume que el número es primo inicialmente
		boolean p = true;
		int i = 2;
		// teste para ver se p sea verdadero e i sea menor que n
		while (p && i < n) {
			if (n % i == 0) {
				//es divisible, entonces n no es primo y p es falso
				p = false;
			}
			i++;
		}
		// este es el retorno para imprimir
		return p;
		
	}
}
*/
