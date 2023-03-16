package controller;

public class Exercicio1_Controller extends Thread{

	private int idThread;
	
	public Exercicio1_Controller(int idThread) {
		this.idThread = idThread;
	}

	@Override
	public void run() {
		System.out.println(idThread);
	}
	
	
	
}
