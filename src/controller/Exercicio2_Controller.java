package controller;

public class Exercicio2_Controller extends Thread{

		int[][] matriz;
		int linha;
		
		public Exercicio2_Controller(int[][] matriz, int linha) {
			this.matriz = matriz;
			this.linha = linha;
		}
		
		public void run() {
			int soma = 0;
			for(int i = 0; i < 5; i++) {
				soma = soma+ matriz[linha][i];
			}
			linha += 1;
			System.out.println("A linha " +linha+ " tem soma igual à: "+soma);
		}

	}
