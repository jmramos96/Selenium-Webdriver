package support;

import runner.RunCucumberTest;

import java.util.Random;

public class Utils extends RunCucumberTest {

	//Gera e-mail aleatório
	public static String Email_Aleatorio() {
		String nomeAleatorio = "teste" + new Random().nextInt(10000);
		return nomeAleatorio + "@email.com";
	}

	//Seleciona cor aleatório
	public static String gerarCor() {
		Random rand = new Random();
		int num = rand.nextInt(2);
		return num == 0 ? "color_15" : "color_16";
	}

	//Seleciona size aleatório
	public static int gerarSize() {
		Random rand = new Random();
		int num = rand.nextInt(2);
		return num == 0 ? 2 : 3; // Retorna 2 ou 3
	}

}
