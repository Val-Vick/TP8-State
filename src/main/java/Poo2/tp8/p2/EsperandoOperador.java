package Poo2.tp8.p2;

public class EsperandoOperador implements EstadoCalculadora {
	private final char operacion;

	public EsperandoOperador(char operacion) {
		this.operacion = operacion;
	}

	@Override
	public void valor(Calculadora calc, double unValor) {
		double acumulado = calc.getValorAcumulado();

		switch (operacion) {
			case '+': calc.setValorAcumulado(acumulado + unValor); break;
			case '-': calc.setValorAcumulado(acumulado - unValor); break;
			case '*': calc.setValorAcumulado(acumulado * unValor); break;
			case '/':
				if (unValor == 0) {
					calc.cambiarEstado(new Error());
					return;
				}
				calc.setValorAcumulado(acumulado / unValor);
				break;
		}
		calc.cambiarEstado(new Inicial());
	}

	@Override public void mas(Calculadora calc) { calc.cambiarEstado(new Error()); }
	@Override public void menos(Calculadora calc) { calc.cambiarEstado(new Error()); }
	@Override public void por(Calculadora calc) { calc.cambiarEstado(new Error()); }
	@Override public void dividido(Calculadora calc) { calc.cambiarEstado(new Error()); }
	@Override public void mostrar(Calculadora calc) { calc.cambiarEstado(new Error()); }

	@Override
	public String obtenerNombre() {
		return "ESPERANDO_OPERANDO";
	}
}