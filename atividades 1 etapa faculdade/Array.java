import java.util.Random;

public class Array{
	public static void main(String[] args){

		
		Random gerador = new Random();
		int[] a = new int[10];

		for(int i=0;i < a.length; i++){
			a [i] = gerador.nextInt(100);
			}
		int j = 0;
		while(j < a.length) {
			j++;
			}
		System.out.println();

		for(int i = 0; i < a.length; i++){
	
			for(j = 0; j < a.length; j++){

				if(a[i] > a[j] && j < i){
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp; 
				
					}
				}

			}
	    for (int valor : a){
				System.out.printf("%d, ", valor);
		}
	}
}