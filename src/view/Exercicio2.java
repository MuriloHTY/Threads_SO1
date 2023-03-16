package view;

import java.util.Random;

import controller.Exercicio2_Controller;

	public class Exercicio2 {

		public static void main(String[] args) {
			
			Random random = new Random();
			
			int matriz[][] = new int[3][5];
			
			for(int linha = 0; linha < 3; linha++) {
				for(int coluna = 0; coluna < 5; coluna++) {
					matriz[linha][coluna] = random.nextInt(100)+1;
				}
			}
			Exercicio2_Controller threadMatriz1 = new Exercicio2_Controller(matriz, 0);
			Exercicio2_Controller threadMatriz2 = new Exercicio2_Controller(matriz, 1);
			Exercicio2_Controller threadMatriz3 = new Exercicio2_Controller(matriz, 2);
			threadMatriz1.start();
			threadMatriz2.start();
			threadMatriz3.start();
		}

	}
