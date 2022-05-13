
public class TestaPontoFlutuante {
	
		public static void main(String[] args) {
			
			double salario;
			salario = 1250.70;
			
			System.out.println("Meu salario é de " + salario + " reais.");
			
			double divisao = 3.14 / 2;
			
			System.out.println("A variável do tipo double recebe números inteiros e números flutuantes, como o resultado de uma divisão, " + divisao);
			
			double outraDivisao = 5 / 2;
			System.out.println("No Java um número inteiro / número inteiro = número interio, por isso o resultado dessa equação é, resultado " + outraDivisao);
			
			double novaDivisao = 5.0 / 2;
			System.out.println("Resolvemos utilizando um número flutuante na equação, resultado " + novaDivisao);
		}

}
