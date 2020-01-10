package com.gft.carro;

public class Carro {
	public String marca;
	public String modelo;
	public String placa;
	public String cor;
	public float km;
	public boolean isLigado;
	public int litrosCombustiveis = 100;
	public int velocidade;
	public double preço;
	public int quatidadevel;

	public void pintar(String novacor) {
		System.out.println("A cor atual é: " + cor);
		cor = novacor;
		System.out.println("Você pintou o carro de: " + novacor);
	}

	public void liga() {
		isLigado = true;
		System.out.println("O carro está ligado");
	}

	public void acelera(int quantidade) {
		if (isLigado) {
			int velocidadeNova = this.velocidade + quantidade;
			this.velocidade = velocidadeNova;
			litrosCombustiveis = litrosCombustiveis - 1;
			System.out.println("O carro está " + velocidade + "Km/h");
		} else {
			System.out.println("O carro está desligado");
		}
	}

	public void abastecer(int qtdlitros) {
		if (litrosCombustiveis >= 100) {
			System.out.println("Tanque cheio");
		} else {
			System.out.println("Você tem " + litrosCombustiveis + " litros");
			while (litrosCombustiveis < 100) {

				litrosCombustiveis++;
				System.out.println("Abastecendo: " + litrosCombustiveis);

			}
			System.out.println("Você abasteceu!!");
			System.out.println("Você tem " + litrosCombustiveis + " agora");
		}
	}

	public void freiar(int quantidade) {
		if (isLigado && velocidade != 0) {
			int velocidadeNova = this.velocidade - quantidade;
			this.velocidade = velocidadeNova;

			System.out.println("O carro está " + velocidade + "Km/h");
		} else {
			System.out.println("O carro já está parado");
		}
	}

	public void desliga() {
		if (velocidade == 0) {
			isLigado = false;
			System.out.println("O carro está desligado");
		} else {
			System.out.println("O carro está em movimento");
		}
	}

}
