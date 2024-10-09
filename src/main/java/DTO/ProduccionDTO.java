package DTO;

import java.time.LocalDate;

public class ProduccionDTO {

	private int id;
	private int cantidadHuevos;
	private LocalDate fechaProduccion;
	private int idLote;
	
	public ProduccionDTO(int id, int cantidadHuevos, LocalDate fechaProduccion, int idLote) {
		super();
		this.id = id;
		this.cantidadHuevos = cantidadHuevos;
		this.fechaProduccion = fechaProduccion;
		this.idLote = idLote;
	}
        
        public ProduccionDTO(){
            
        }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCantidadHuevos() {
		return cantidadHuevos;
	}
	public void setCantidadHuevos(int cantidadHuevos) {
		this.cantidadHuevos = cantidadHuevos;
	}
	public LocalDate getFechaProduccion() {
		return fechaProduccion;
	}
	public void setFechaProduccion(LocalDate fechaProduccion) {
		this.fechaProduccion = fechaProduccion;
	}
	public int getIdLote() {
		return idLote;
	}
	public void setIdLote(int idLote) {
		this.idLote = idLote;
	}
	
	
}
