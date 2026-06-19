package Poo2.tp8.p1;

public class Cerrado implements EstadoPuerta{
	@Override
	public void abrirPuerta(Puerta puerta) {
		puerta.cambiarEstado(new Abierto());
		System.out.println("Puerta abierta");
	}

	@Override
	public void cerrarPuerta(Puerta puerta) {
		System.out.println("La puerta ya esta cerrada");
	}

	@Override
	public String getEstado() {
		return "cerrada";
	}
}
