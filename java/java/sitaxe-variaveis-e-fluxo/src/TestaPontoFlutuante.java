
public class TestaPontoFlutuante {
	
		public static void main(String[] args) {
			
			double salario;
			salario = 1250.70;
			
			System.out.println("Meu salario � de " + salario + " reais.");
			
			double divisao = 3.14 / 2;
			
			System.out.println("A vari�vel do tipo double recebe n�meros inteiros e n�meros flutuantes, como o resultado de uma divis�o, " + divisao);
			
			double outraDivisao = 5 / 2;
			System.out.println("No Java um n�mero inteiro / n�mero inteiro = n�mero interio, por isso o resultado dessa equa��o �, resultado " + outraDivisao);
			
			double novaDivisao = 5.0 / 2;
			System.out.println("Resolvemos utilizando um n�mero flutuante na equa��o, resultado " + novaDivisao);
		}

}
