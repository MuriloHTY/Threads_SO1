package view;

import controller.Exercicio1_Controller;

public class Exercicio1 {

	public static void main(String[] args) {

		for(int idThread = 0 ; idThread < 5 ; idThread++){
			Thread threadId = new Exercicio1_Controller(idThread);
			threadId.start();
			
		}

	}

}
