package Poo2.tp8.p4;

import java.util.ArrayList;
import java.util.List;

public class OrdenDeCompra {
	static final String MSG_ERROR_PREPARACION = "La orden solo puede pasar a preparacion desde iniciada";
	static final String MSG_ERROR_SIN_PRODUCTOS = "La orden debe tener al menos un producto";
	static final String MSG_ERROR_ENVIAR = "La orden solo puede enviarse desde en preparacion";
	static final String MSG_ERROR_CANCELAR = "La orden no puede cancelarse en este estado";
	static final String MSG_ERROR_AGREGAR_PRODUCTO = "No se pueden agregar productos en este estado";

	private EstadoOrdenDeCompra estadoActual;
	private List<Producto> productos;
	private double monto;
	private String numeroSeguimiento;

	public OrdenDeCompra() {
		this.estadoActual = new Iniciada();
		this.productos = new ArrayList<>();
		this.monto = 0;
		this.numeroSeguimiento = null;
	}

	public void agregarProducto(Producto producto) {
		estadoActual.agregarProducto(this, producto);
	}

	public void confirmarCompra() {
		estadoActual.confirmarCompra(this);
	}

	public void enviar() {
		estadoActual.enviar(this);
	}

	public void cancelar() {
		estadoActual.cancelar(this);
	}

	public Estado estado() {
		return this.estadoActual.obtenerEnumEstado();
	}

	public double monto() {
		return this.monto;
	}

	public String numeroSeguimiento() {
		return this.numeroSeguimiento;
	}

	public List<Producto> productos() {
		return new ArrayList<>(this.productos);
	}

	List<Producto> getProductosInternos() {
		return this.productos;
	}

	double calcularMonto() {
		return this.productos.stream().mapToDouble(Producto::precio).sum();
	}

	String generarNumeroSeguimiento() {
		return "SEG-" + System.currentTimeMillis();
	}

	void cambiarEstado(EstadoOrdenDeCompra nuevoEstado) {
		this.estadoActual = nuevoEstado;
	}

	void setMonto(double monto) {
		this.monto = monto;
	}

	void setNumeroSeguimiento(String numeroSeguimiento) {
		this.numeroSeguimiento = numeroSeguimiento;
	}

	public enum Estado {
		INICIADA,
		EN_PREPARACION,
		ENVIADA,
		CANCELADA
	}
}