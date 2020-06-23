
public class CalculadoraSalario {

	private static final double inssPrimeiroDesc = 0.92, inssSegundoDesc = 0.91, inssTerceiroDesc = 0.89;
	private static final double irrfDescMenor = 0.925, irrfDescMaior = 0.85;
	private static final double salarioMinimo = 1039.0;




	public long calcularSalarioLiquido(double salarioBase) {

		if(salarioBase < salarioMinimo){
			return 0;
		}

		double salarioBruto = calcularInss(salarioBase);

		double salarioLiquido = calcularIrrf(salarioBruto);

		return Math.round(salarioLiquido);
	}
	
	
	//Exemplo de método que pode ser criado para separar melhor as responsábilidades de seu algorítmo
	private double calcularInss(double salarioBase) {

		if(salarioBase <= 1500.0){
			salarioBase *= inssPrimeiroDesc;
		}
		else if(salarioBase <= 4000.0){
			salarioBase *= inssSegundoDesc;
		}
		else{
			salarioBase *= inssTerceiroDesc;
		}
		return salarioBase;
	}

	private double calcularIrrf(double salarioBase) {
		if(salarioBase > 6000.0){
			salarioBase *= irrfDescMaior;
		}
		else if(salarioBase > 3000.0){
			salarioBase *= irrfDescMenor;
		}
		return salarioBase;
	}

}
/*Dúvidas ou Problemas?
Manda e-mail para o meajuda@codenation.dev que iremos te ajudar! 
*/
