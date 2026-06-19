package Poo2.tp8.p4;

public class Iniciada implements EstadoOrdenDeCompra {

	@Override
	public void agregarProducto(OrdenDeCompra orden, Producto producto) {
		orden.getProductosInternos().add(producto);
	}

	@Override
	public void confirmarCompra(OrdenDeCompra orden) {
		if (orden.getProductosInternos().isEmpty()) {
			throw new IllegalStateException(OrdenDeCompra.MSG_ERROR_SIN_PRODUCTOS);
		}
		orden.setMonto(orden.calcularMonto());
		orden.cambiarEstado(new EnPreparacion());
	}

	@Override
	public void enviar(OrdenDeCompra orden) {
		throw new IllegalStateException(OrdenDeCompra.MSG_ERROR_ENVIAR);
	}

	@Override
	public void cancelar(OrdenDeCompra orden) {
		orden.cambiarEstado(new Cancelada());
	}

	@Override
	public OrdenDeCompra.Estado obtenerEnumEstado() {
		return OrdenDeCompra.Estado.INICIADA;
	}
}