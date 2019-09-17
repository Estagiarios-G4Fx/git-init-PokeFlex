package jogo.com.pokemon;

import java.util.Scanner;

public class Pokedex {

	public static void main(String[] args) {
		Pokemon pokedex[] = new Pokemon[2];
		pokedex[0] = new Fogo("Fogo", 24.6f, 1.0f, 200, 1111, "Bola de fogo");
		pokedex[1] = new Pedra("Pedra", 24.0f, 0.60f, 250, 2222, "Pedrinho");

		for (Pokemon M : pokedex) {
			System.out.println(M.getApresentar());
		}
		System.out.println("---------------------------------------------------------------");
		System.out.println("Digite (1) para escolher Bola de fogo e " + "(2) para escolher Pedrinho");
		Scanner teclado = new Scanner(System.in);
		int leitor = teclado.nextInt();
		switch (leitor) {
		case 1:
			System.out.println("Você escolheu o pokemon " + pokedex[0].getNome());
			System.out.println("--------------------------------------------------------------------------");

			System.out.println("Digite (1) para atacar com seu pokemon e (2) para defender");
			int neitor = teclado.nextInt();
			switch (neitor) {
			case 1:
				System.out.print(pokedex[0].getNome() + ", o " + pokedex[1].getNome() + " foi atingindo, pois ");
				pokedex[1].atacar();
				break;
			case 2:
				pokedex[0].defender();

				break;
			}
		case 2:
			System.out.println("Você escolheu o pokemon " + pokedex[1].getNome());
			System.out.println("--------------------------------------------------------");
			System.out.println("Digite (1) para atacar com seu pokemon e (2) para defender");
		}
		int beitor = teclado.nextInt();
		switch (beitor) {
		case 1:
			System.out.print(pokedex[1].getNome() + ", o " + pokedex[0].getNome() + " foi atingindo, pois ");
			pokedex[0].atacar();
			break;
		case 2:
			pokedex[1].defender();
		}
	}
}
