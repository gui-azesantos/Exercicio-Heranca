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
	public double pre�o;
	public int quatidadevel;

	public void pintar(String novacor) {
		System.out.println("A cor atual �: " + cor);
		cor = novacor;
		System.out.println("Voc� pintou o carro de: " + novacor);
	}

	public void liga() {
		isLigado = true;
		System.out.println("O carro est� ligado");
	}

	public void acelera(int quantidade) {
		if (isLigado) {
			int velocidadeNova = this.velocidade + quantidade;
			this.velocidade = velocidadeNova;
			litrosCombustiveis = litrosCombustiveis - 1;
			System.out.println("O carro est� " + velocidade + "Km/h");
		} else {
			System.out.println("O carro est� desligado");
		}
	}

	public void abastecer(int qtdlitros) {
		if (litrosCombustiveis >= 100) {
			System.out.println("Tanque cheio");
		} else {
			System.out.println("Voc� tem " + litrosCombustiveis + " litros");
			while (litrosCombustiveis < 100) {

				litrosCombustiveis++;
				System.out.println("Abastecendo: " + litrosCombustiveis);

			}
			System.out.println("Voc� abasteceu!!");
			System.out.println("Voc� tem " + litrosCombustiveis + " agora");
		}
	}

	public void freiar(int quantidade) {
		if (isLigado && velocidade != 0) {
			int velocidadeNova = this.velocidade - quantidade;
			this.velocidade = velocidadeNova;

			System.out.println("O carro est� " + velocidade + "Km/h");
		} else {
			System.out.println("O carro j� est� parado");
		}
	}

	public void desliga() {
		if (velocidade == 0) {
			isLigado = false;
			System.out.println("O carro est� desligado");
		} else {
			System.out.println("O carro est� em movimento");
		}
	}

}
