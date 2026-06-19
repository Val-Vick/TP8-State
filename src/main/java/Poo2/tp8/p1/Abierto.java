package Poo2.tp8.p1;

public class Abierto implements EstadoPuerta{
	@Override
	public void abrirPuerta(Puerta puerta) {
		System.out.println("La puerta ya esta abierta");
	}

	@Override
	public void cerrarPuerta(Puerta puerta) {
		puerta.cambiarEstado(new Cerrado());
		System.out.println("Puerta cerrada");
	}

	@Override
	public String getEstado() {
		return "abierta";
	}
}
