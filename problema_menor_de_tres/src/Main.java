/* Problema "Menor de Três"
 * 
 * Fazer um programa para ler três números inteiros. Em seguida, mostrar 
 * qual o menor dentre os três números lidos. Em caso de empate, mostrar 
 * apenas uma vez;
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, menor;
		
		System.out.print("Primeiro valor: ");
		a = sc.nextInt();
		System.out.print("Segundo valor: ");
		b = sc.nextInt();
		System.out.print("Terceiro valor: ");
		c = sc.nextInt();
		
		if (a < b && a < c) {
			menor = a;
		}
		// É necessário escrever "else if" pois ainda resta duas possibilidades;
		else if (b < c) {
			menor = b;
		}
		else {
			menor = c;
		}
		
		System.out.println();
		
		System.out.println("MENOR = " + menor);
		
		sc.close();
	}

}
