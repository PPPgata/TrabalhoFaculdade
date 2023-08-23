import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero;
        double numerotemp = 0;
        double resposta = 0;
        String metodo;
        String sair;

        System.out.println("Bem vindo a calculadora\nescreva um numero: ");
        numero = scanner.nextDouble();
	numerotemp = numero;

        do {
		do{
            System.out.println("Qual metodo deseja usar?\nsoma\nsubtracao\nmultiplicacao\ndivisao: ");
            metodo = scanner.next();
	    
       		if (!metodo.equalsIgnoreCase("soma") && !metodo.equalsIgnoreCase("subtracao") &&
            !metodo.equalsIgnoreCase("multiplicacao") && !metodo.equalsIgnoreCase("divisao")) {
            System.out.println("Método inválido, tente novamente.");
      			}
    		} while (!metodo.equalsIgnoreCase("soma") && !metodo.equalsIgnoreCase("subtracao") &&
             !metodo.equalsIgnoreCase("multiplicacao") && !metodo.equalsIgnoreCase("divisao"));

            System.out.println("Escreva outro numero: ");
            numero = scanner.nextDouble();

            if (metodo.equals("soma")) {
                resposta = numerotemp + numero;
            } else if (metodo.equals("subtracao")) {
                resposta = numerotemp - numero;
            } else if (metodo.equals("multiplicacao")) {
                resposta = numerotemp * numero;
            } else if (metodo.equals("divisao")) {
                resposta = numerotemp / numero;
            } else {
                System.out.println("Resposta inválida, tente novamente.");
            }
	    numerotemp = resposta;
            System.out.println("Gostaria de sair? sim/s nao/n: ");
            sair = scanner.next();

        } while (!sair.equalsIgnoreCase("sim") && !sair.equalsIgnoreCase("s"));

        System.out.printf("O resultado é: %.1f%n", resposta);
    }
}