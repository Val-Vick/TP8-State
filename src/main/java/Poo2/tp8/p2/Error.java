package Poo2.tp8.p2;

public class Error implements EstadoCalculadora {

	@Override
	public void mostrar(Calculadora calc) {
		System.out.println(Calculadora.MSG_ESTADO_ERROR);
	}

	@Override public void mas(Calculadora calc) { System.out.println(Calculadora.MSG_ESTADO_ERROR); }
	@Override public void menos(Calculadora calc) { System.out.println(Calculadora.MSG_ESTADO_ERROR); }
	@Override public void por(Calculadora calc) { System.out.println(Calculadora.MSG_ESTADO_ERROR); }
	@Override public void dividido(Calculadora calc) { System.out.println(Calculadora.MSG_ESTADO_ERROR); }
	@Override public void valor(Calculadora calc, double unValor) { System.out.println(Calculadora.MSG_ESTADO_ERROR); }

	@Override
	public String obtenerNombre() {
		return "ERROR";
	}
}