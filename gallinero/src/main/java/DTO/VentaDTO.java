package DTO;

import java.time.LocalDate;

public class VentaDTO {
	
	private int id;
	private LocalDate fechaVenta;
	private int cantidadVendida;
	private float precioVenta;
	private int idUsuario;
	private int idProduccion;
	
	
	
	public VentaDTO(int id, LocalDate fechaVenta, int cantidadVendida, float precioVenta, int idUsuario,
			int idProduccion) {
		super();
		this.id = id;
		this.fechaVenta = fechaVenta;
		this.cantidadVendida = cantidadVendida;
		this.precioVenta = precioVenta;
		this.idUsuario = idUsuario;
		this.idProduccion = idProduccion;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	public int getCantidadVendida() {
		return cantidadVendida;
	}
	public void setCantidadVendida(int cantidadVendida) {
		this.cantidadVendida = cantidadVendida;
	}
	public float getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getIdProduccion() {
		return idProduccion;
	}
	public void setIdProduccion(int idProduccion) {
		this.idProduccion = idProduccion;
	}
	
	
}
