package Poo2.tp8.p3;

public class Normal implements EstadoGolondrina{
	@Override
	public void realizarDeseo(Golondrina g) {
		//no tiene deseos
	}

	@Override
	public String obtenerNombre() {
		return "normal";
	}
}
