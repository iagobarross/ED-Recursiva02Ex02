// 2. Criar uma fun��o recursiva que receba o dividendo e o divisor de uma opera��o de divis�o e, por subtra��es, exiba o resto da divis�o.
package controller;

public class ControllerResto {
	
	public ControllerResto() {
		super();
	}
	
	public int calculaResto(int dividendo, int divisor) {
		
		if (dividendo >= divisor) {
			int resto = calculaResto(dividendo - divisor, divisor);
			return resto;
		} else {
			return dividendo;
		}
	}		
}
