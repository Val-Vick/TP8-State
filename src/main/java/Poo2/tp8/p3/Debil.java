package Poo2.tp8.p3;

public class Debil implements EstadoGolondrina{

	@Override
	public void realizarDeseo(Golondrina g) {
		g.comer(50);
	}

	@Override
	public String obtenerNombre() {
		return "debil";
	}
}
