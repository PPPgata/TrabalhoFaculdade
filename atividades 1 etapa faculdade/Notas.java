/* Notas.java
   Calcula a media do aluno */

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota;
		double media;
        double total = 0.0;
        int contador = 0;
        boolean valido;
		boolean sair;

	do {
	    do {
		System.out.print("Informe a nota (ou -1 para SAIR): ");
		nota = scanner.nextDouble();

		valido = nota >= 0.0 && nota <= 10.0 || nota == -1;
		if (!valido)
		    System.out.printf("%.1f não é uma nota válida!%n", nota);
	    } while (!valido);

	    sair = nota == -1;
	    if (!sair) {
		total += nota;
		contador++;
	    }
	} while (!sair);

	if (contador > 0) {
	    media = total / contador;
	    System.out.printf("%nMédia = %.1f%n", media);
	}
    } // fim do método main
} // fim da classe Notas