package academy.devdojo.maratonajava.introducao;
/*
 * Prática
 * 
 * Crie variáveis para os campos descritos abaixo entre <>
 * e imprima a seguinte mensagem:
 * 
 * "Eu <nome>, morando no endereço <endereco>,
 * confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {

	public static void main(String[] args) {
		String nome = "Guilherme";
		String endereco = "Rua dos Bobos, Num 0";
		double salario = 3900.57;
		String dataRecebimento = "04/12/2023";
		String relatorio = "Eu "+nome+", morando no endereço "+endereco+",\n"
				+ "confirmo que recebi o salário de "+salario+", na data "+dataRecebimento;
		
		System.out.println(relatorio);
	}

}
