import java.util.Random;
import java.util.Scanner;

public class Parimpar{
	public static void main(String[] args){
		
		String esc_jogador;
		int numero_jogador;
		int numero_maquina;
		boolean sair = false;
		int resultado;
		
		
		
		Scanner scanner = new Scanner(System.in);
		Random gerador = new Random();

		System.out.print("escolha par ou impar: ");
		
		do{
			do{
				System.out.print("escolha par ou impar: ");
				esc_jogador = scanner.next();
				if(!esc_jogador.equalsIgnoreCase("impar") && !esc_jogador.equalsIgnoreCase("par"))
				System.out.print("escolha invalida");

				}while(!esc_jogador.equalsIgnoreCase("impar") && !esc_jogador.equalsIgnoreCase("par"));

			System.out.print("escolha um numero de 0 a 10: ");
			numero_jogador = scanner.nextInt();
			if(numero_jogador < 0 ||  numero_jogador>10){
				System.out.print("resposta invalida");
				}else{
				sair = true;
 				}
		}while(!sair);

		numero_maquina = gerador.nextInt(11);
		resultado = numero_maquina + numero_jogador;

		if(resultado %2 == 0 && esc_jogador.equalsIgnoreCase("par")){
			System.out.print("voce ganhou ");
			System.out.printf(",o numero foi: %d",resultado);
		}else if(resultado %2 == 1 && esc_jogador.equalsIgnoreCase("impar")){
			System.out.print("voce ganhou ");
			System.out.printf(",o numero foi: %d",resultado);
		}else{
			System.out.println("voce perdeu ");
			System.out.printf(",o numero foi: %d",resultado);
		}
		

		
	}
}