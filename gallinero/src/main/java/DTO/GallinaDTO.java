package DTO;

import java.time.LocalDate;

public class GallinaDTO {

	private int id;
	private LocalDate fechaNacimiento;
	private boolean estadoSalud;
	private int idLote;
	
	public GallinaDTO(int id, LocalDate fechaNacimiento, boolean estadoSalud, int idLote) {
		super();
		this.id = id;
		this.fechaNacimiento = fechaNacimiento;
		this.estadoSalud = estadoSalud;
		this.idLote = idLote;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public boolean isEstadoSalud() {
		return estadoSalud;
	}
	public void setEstadoSalud(boolean estadoSalud) {
		this.estadoSalud = estadoSalud;
	}
	public int getIdLote() {
		return idLote;
	}
	public void setIdLote(int idLote) {
		this.idLote = idLote;
	}
	
	
	
}
