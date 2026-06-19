package Poo2.tp8.p4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrdenDeCompraTest {

	private OrdenDeCompra orden;
	private Producto producto1;
	private Producto producto2;

	@BeforeEach
	public void setUp() {
		orden = new OrdenDeCompra();
		producto1 = new Producto("Teclado Mecanico", 45000);
		producto2 = new Producto("Mouse Gamer", 25000);
	}

	@Test
	public void testFlujoDeCompra() {
		assertEquals(OrdenDeCompra.Estado.INICIADA, orden.estado());

		orden.agregarProducto(producto1);
		orden.agregarProducto(producto2);
		assertEquals(2, orden.productos().size());

		orden.confirmarCompra();
		assertEquals(OrdenDeCompra.Estado.EN_PREPARACION, orden.estado());
		assertEquals(70000, orden.monto());

		orden.enviar();
		assertEquals(OrdenDeCompra.Estado.ENVIADA, orden.estado());
		assertNotNull(orden.numeroSeguimiento());
	}

	@Test
	public void testConfirmarCompraSinProductosLanzaExcepcion() {
		Exception exception = assertThrows(IllegalStateException.class, () -> {
			orden.confirmarCompra();
		});
		assertEquals(OrdenDeCompra.MSG_ERROR_SIN_PRODUCTOS, exception.getMessage());
	}

	@Test
	public void testCancelarDesdeIniciada() {
		orden.agregarProducto(producto1);
		orden.cancelar();
		assertEquals(OrdenDeCompra.Estado.CANCELADA, orden.estado());
	}

	@Test
	public void testNoSePuedeAgregarProductosEnPreparacion() {
		orden.agregarProducto(producto1);
		orden.confirmarCompra();

		Exception exception = assertThrows(IllegalStateException.class, () -> {
			orden.agregarProducto(producto2);
		});
		assertEquals(OrdenDeCompra.MSG_ERROR_AGREGAR_PRODUCTO, exception.getMessage());
	}

	@Test
	public void testNoSePuedeCancelarUnaOrdenEnviada() {
		orden.agregarProducto(producto1);
		orden.confirmarCompra();
		orden.enviar();

		Exception exception = assertThrows(IllegalStateException.class, () -> {
			orden.cancelar();
		});
		assertEquals(OrdenDeCompra.MSG_ERROR_CANCELAR, exception.getMessage());
	}
}