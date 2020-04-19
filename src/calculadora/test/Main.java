package calculadora.test;

public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Calculadora calc = new Calculadora(5, 5.3);
		
		System.out.println(calc.somar());
		System.out.println(calc.subtrair());
		System.out.println(calc.multiplicar());
		System.out.println(calc.dividir());
	}

}
