package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
	public static void main(String[] args) {
		// int, double, float, char, byte, short, long, boolean
		int idade = (int) 10000000000L;
		long numeroGrande = (long) 155.23;
		double salarioDouble = (double) 2000F;
		float salarioFloat = (float) 2500D;
		byte idadeByte = 127;
		short idadeShort = 32000;
		boolean veradeiro = true;
		boolean falso = false;
		char caractere = '\u0041';
		String nome = "Goku";
		
		System.out.println("A idade é " + idade + " anos");
		System.out.println(falso);
		System.out.println("char " + caractere);
		System.out.println(numeroGrande);
		System.out.println("Oi, meu nome é " + nome);
		
	}
}
