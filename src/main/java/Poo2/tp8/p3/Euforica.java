package Poo2.tp8.p3;

public class Euforica implements EstadoGolondrina {
	@Override
	public void realizarDeseo(Golondrina g) {
		g.volar(10);
	}

	@Override
	public String obtenerNombre() {
		return "euforica";
	}
}
