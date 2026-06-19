package Poo2.tp8.p2;

public interface EstadoCalculadora {
	void mas(Calculadora calc);
	void menos(Calculadora calc);
	void por(Calculadora calc);
	void dividido(Calculadora calc);
	void valor(Calculadora calc, double unValor);
	void mostrar(Calculadora calc);
	String obtenerNombre();
}