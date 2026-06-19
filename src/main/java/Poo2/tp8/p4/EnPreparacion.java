package Poo2.tp8.p4;

public class EnPreparacion implements EstadoOrdenDeCompra {

	@Override
	public void agregarProducto(OrdenDeCompra orden, Producto producto) {
		throw new IllegalStateException(OrdenDeCompra.MSG_ERROR_AGREGAR_PRODUCTO);
	}

	@Override
	public void confirmarCompra(OrdenDeCompra orden) {
		throw new IllegalStateException(OrdenDeCompra.MSG_ERROR_PREPARACION);
	}

	@Override
	public void enviar(OrdenDeCompra orden) {
		orden.setNumeroSeguimiento(orden.generarNumeroSeguimiento());
		orden.cambiarEstado(new Enviada());
	}

	@Override
	public void cancelar(OrdenDeCompra orden) {
		orden.cambiarEstado(new Cancelada());
	}

	@Override
	public OrdenDeCompra.Estado obtenerEnumEstado() {
		return OrdenDeCompra.Estado.EN_PREPARACION;
	}
}