package Poo2.tp8.p2;

public class Calculadora {
	static final double VALOR_INICIAL = 0.0;
	static final String MSG_ESTADO_ERROR = "La calculadora esta en estado de error";

	private double valorAcumulado;
	private EstadoCalculadora estado;

	public Calculadora() {
		this.estado = new Inicial();
		this.valorAcumulado = VALOR_INICIAL;
	}

	public String estado() {
		return this.estado.obtenerNombre();
	}

	public void mas() { estado.mas(this); }
	public void menos() { estado.menos(this); }
	public void por() { estado.por(this); }
	public void dividido() { estado.dividido(this); }

	public void valor(double unValor) {
		estado.valor(this, unValor);
	}

	public void mostrar() {
		estado.mostrar(this);
	}

	public void borrar() {
		this.estado = new Inicial();
		this.valorAcumulado = VALOR_INICIAL;
	}

	public double getValorAcumulado() { return valorAcumulado; }
	public void setValorAcumulado(double valor) { this.valorAcumulado = valor; }
	void cambiarEstado(EstadoCalculadora nuevoEstado) { this.estado = nuevoEstado; }
}