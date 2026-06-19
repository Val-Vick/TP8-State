package Poo2.p1;

public class Puerta {

	private EstadoPuerta puerta;

	public String estado() {
		return puerta.getEstado();
	}

	public void abrir() {
		puerta.abrirPuerta(this);
	}

	public void cerrar() {
		puerta.cerrarPuerta(this);
	}

	public void cambiarEstado(EstadoPuerta puerta){
		this.puerta = puerta;
	}
}