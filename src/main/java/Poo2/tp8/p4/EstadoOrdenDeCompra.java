package Poo2.tp8.p4;

public interface EstadoOrdenDeCompra {
	void agregarProducto(OrdenDeCompra orden, Producto producto);
	void confirmarCompra(OrdenDeCompra orden);
	void enviar(OrdenDeCompra orden);
	void cancelar(OrdenDeCompra orden);
	OrdenDeCompra.Estado obtenerEnumEstado();
}
