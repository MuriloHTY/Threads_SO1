package controller;

import java.text.DecimalFormat;

public class Exercicio0_Controller extends Thread {
	
	private double tempoInicial;
	private double tempoFinal;
	private double tempoPercorrido;
	
	public Exercicio0_Controller(int threadVetor, int[] vet) {		
		
		DecimalFormat df = new DecimalFormat("0.000000000");
		
			int tamanho = vet.length;
			if(threadVetor % 2 == 0) {
				this.tempoInicial = System.nanoTime();
				for (int i = 0 ; i < tamanho; i++) {
					System.out.print("");
				}
				this.tempoFinal = System.nanoTime();
				this.tempoPercorrido = tempoFinal - tempoInicial;
				tempoPercorrido = tempoPercorrido / Math.pow(10, 9);
				System.out.println("Tempo necessário para percorrer o Vetor passando um número par como parâmetro: "+df.format(tempoPercorrido)+"s.");
			}else {
				this.tempoInicial = System.nanoTime();
				for(int i : vet){
					System.out.print("");
				}
				this.tempoFinal = System.nanoTime();
				this.tempoPercorrido = tempoFinal - tempoInicial;
				tempoPercorrido = tempoPercorrido / Math.pow(10, 9);
				System.out.println("Tempo necessário para percorrer o Vetor passando um número ímpar como parâmetro: "+df.format(tempoPercorrido)+"s.");
			}
			
			
			
		}
		@Override
		public void run() {
		
		}
	}
	
