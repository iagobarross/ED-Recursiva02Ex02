// 2. Criar uma função recursiva que receba o dividendo e o divisor de uma operação de divisão e, por subtrações, exiba o resto da divisão.
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
