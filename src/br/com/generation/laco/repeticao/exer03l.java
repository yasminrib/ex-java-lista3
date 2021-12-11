package br.com.generation.laco.repeticao;

import java.util.Scanner;

public class exer03l {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade = 0, mais50 = 0, menos21 = 0;

		while(idade != -99) {
			System.out.print("Digite a idade: ");
			idade = in.nextInt();
			if(idade < 21 && idade > 0) {
				menos21++;
			} else if (idade > 50) {
				mais50++;
			}
		}
		System.out.printf("Menores de 21: %d\nMaiores de 50: %d", menos21, mais50);
		in.close();

	}

}
