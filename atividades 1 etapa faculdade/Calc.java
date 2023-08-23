import java.util.Scanner;

public class Calc{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double c;
		double i;
		int t;
		double aux;
	
		System.out.print("informe c: ");
		c = scanner.nextDouble();

		System.out.print("informe i: ");
		i = scanner.nextDouble();

		System.out.print("informe t: ");
		t = scanner.nextInt();
		
		aux = 1;
		for(int j = 1; j <= t; j++){
			aux *= (1 + i);
		}

		System.out.printf("m é igual a %.2f\n", c * aux);
	}	
}