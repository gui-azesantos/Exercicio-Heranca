package com.gft.main;

import com.gft.carro.*;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner src = new Scanner(System.in);

		int comando = 0;

		Carro carroteste;
		carroteste = new Carro();

		carroteste.modelo = "Fusca";
		carroteste.placa = "EWS-8912";
		System.out.println("Modelo: " + carroteste.modelo);
		System.out.println("Cor: " + carroteste.cor);

		while (comando != 7) {
			System.out.println("Digite o número");
			System.out.println("1 - Liga o Carro");
			System.out.println("2 - Acelera");
			System.out.println("3- Freia");
			System.out.println("4- Abastece");
			System.out.println("5- Pinta");
			System.out.println("6 - Desliga");
			System.out.println("7- Sair");

			comando = src.nextInt();

			switch (comando) {
			case 1:
				carroteste.liga();
				break;
			case 2:
				carroteste.acelera(20);
				break;
			case 3:
				carroteste.freiar(20);
				break;
			case 4:
				carroteste.abastecer(20);
				break;
			case 5:
				System.out.println("Escolha a cor");
				String cor = src.next();
				carroteste.pintar(cor);
				System.out.println(cor);
				break;

			case 6:
				carroteste.desliga();
				break;

			case 7:
				System.out.println("Você saiu!");
				System.exit(0);
				break;
			}
		}

	}
}
