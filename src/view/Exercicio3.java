package view;

import java.util.Random;

import controller.Exercicio3_Controller;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int distanciaTotal = rd.nextInt(100) + 1;
		int tamanhoMaxPulo = rd.nextInt(100) + 1;
		Exercicio3_Controller threadSapo1 = new Exercicio3_Controller("Sapo RedPill", distanciaTotal, tamanhoMaxPulo, 0);
		Exercicio3_Controller threadSapo2 = new Exercicio3_Controller("Sapo Lgbt", distanciaTotal, tamanhoMaxPulo, 0);
		Exercicio3_Controller threadSapo3 = new Exercicio3_Controller("Sapo Emo", distanciaTotal, tamanhoMaxPulo, 0);
		Exercicio3_Controller threadSapo4 = new Exercicio3_Controller("Sapo Nao-Binare", distanciaTotal, tamanhoMaxPulo, 0);
		Exercicio3_Controller threadSapo5 = new Exercicio3_Controller("Sapo Feminista", distanciaTotal, tamanhoMaxPulo, 0);
		
		threadSapo1.start();
		threadSapo2.start();
		threadSapo3.start();
		threadSapo4.start();
		threadSapo5.start();

	}

}