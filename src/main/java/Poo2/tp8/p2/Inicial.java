package Poo2.tp8.p2;

public class EstadoInicial implements EstadoCalculadora {

	@Override
	public void mas(Calculadora calc) {
		calc.cambiarEstado(new EsperandoOperando('+'));
	}

	@Override
	public void menos(Calculadora calc) {
		calc.cambiarEstado(new EsperandoOperando('-'));
	}

	@Override
	public void por(Calculadora calc) {
		calc.cambiarEstado(new EsperandoOperando('*'));
	}

	@Override
	public void dividido(Calculadora calc) {
		calc.cambiarEstado(new EsperandoOperando('/'));
	}

	@Override
	public void valor(Calculadora calc, double unValor) {
		// Asigna directamente el valor acumulado
		calc.setValorAcumulado(unValor);
	}

	@Override
	public void mostrar(Calculadora calc) {
		System.out.println(calc.getValorAcumulado());
	}

	@Override
	public String obtenerNombre() {
		return "INICIAL";
	}
}