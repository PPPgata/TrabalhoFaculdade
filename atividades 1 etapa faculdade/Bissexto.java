import java.util.Scanner;

public class Bissexto{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int ano;

		System.out.print("ME INFORME UM ANO: ");
		ano = scanner.nextInt();

		if(ano%400 == 0 || ano%4 == 0 && ano%100 != 0){
			System.out.print("Bissexto");
		}else{
			System.out.print("N bissexto");
		}
	}
}