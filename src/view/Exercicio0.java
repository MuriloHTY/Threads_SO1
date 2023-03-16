package view;

import controller.Exercicio0_Controller;

public class Exercicio0 {

	public static void main(String[] args) {
		
		int[] vet = new int[999];
		
		for(int i = 0 ; i < 999 ; i++) {
			
			vet[i] = (int)((Math.random() * 101) + 0); 
			
		}
		
		for(int ThreadVetor = 0 ; ThreadVetor < 2 ; ThreadVetor++){
			Thread ThreadVet = new Exercicio0_Controller(ThreadVetor, vet);
			ThreadVet.start();
			
		}

		
	}
}
