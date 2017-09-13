package br.com.db1.start;

public class Exercicio {
	public static void main(String[] args) {
		//exemploPrimitivoString();
		
		//exemploPrimitivoDouble();
		
		//exemploPrimitivoInteger();
		
		//exemploPrimitivoBooleano();
		
		exemploLacoRepeticao();
	}

	private static void exemploLacoRepeticao() {
		exemploComWhile();
		
		exemploComFor();
		
		exemploComDoWhile();
	}

	private static void exemploComDoWhile() {
		System.out.println(" ");
		System.out.println("Exemplo com do-while: ");
		Integer contador = 1;
		do {
			System.out.print(contador);
			contador++;
		} while (contador < 11);
	}

	private static void exemploComFor() {
		System.out.println(" ");
		System.out.println("Exemplo com for: ");
		for(Integer x = 11; x < 21; x++) {
			System.out.print(x);
		}
	}

	private static void exemploComWhile() {
		Integer contador = 1;
		
		System.out.println("Exemplo com while: ");
		while(contador < 11) {
			System.out.print(contador);
			contador++;
		}
	}

	private static void exemploPrimitivoBooleano() {
		boolean variavelPrimitiva = false;
		Boolean variavelNaoPrimitiva = Boolean.FALSE;
	}

	private static void exemploPrimitivoInteger() {
		int valorNumerico = 0; 
		/*tipo primitivo, tipo que qualquer linguagem intende*//*Exemlo de tipos primitivos char, double*/
		Integer valorNumerico2 = 1;
		/* Exemplo de objetos*//*Exemplo String, Double*/
		
		Integer numero3 = 232456;
		
		System.out.println("Converter número em palavra " + numero3.toString());
		System.out.println("Outra forma de conversão " + String.valueOf(valorNumerico));
		
		
	}

	private static void exemploPrimitivoDouble() {
		double numeroComVirgula = 1.92;
		Double numeroComVirgula2 = 1.92;
	}

	private static void exemploPrimitivoString() {
		char umaLetra = 'a';
		String variasLetras = "Várias letras";
		
		String exemploDeString = "123456789";
		char numero1 = '1';
		
		System.out.println("Quantas letras existe na palavra " + exemploDeString+ ": " + exemploDeString.length());
		
		System.out.println("Converter texto em numero");
		System.out.println(Integer.parseInt(exemploDeString));
		/*System.out.println(Integer.parseUnsignedInt(numero1));*/
	}
}
