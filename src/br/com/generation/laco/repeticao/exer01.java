package br.com.generation.laco.repeticao;

public class exer01 {

	public static void main(String[] args) {
		System.out.print("N�meros que divididos por 11 d�o resto 5: ");

		for(int i = 1000; i <= 1999; i++) {
			if (i % 11 == 5) {
				System.out.print(i + " ");
			}
		}

	}

}
