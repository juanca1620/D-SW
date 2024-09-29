package DTO;

import java.time.LocalDate;

public class AlimentoDTO {
	private int id;
	private String tipoAlimento;
	private LocalDate fechaAlimento;
	private int idLote;
	
	public AlimentoDTO(int id, String tipoAlimento, LocalDate fechaAlimento, int idLote) {
		this.id = id;
		this.tipoAlimento = tipoAlimento;
		this.fechaAlimento = fechaAlimento;
		this.idLote = idLote;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipoAlimento() {
		return tipoAlimento;
	}
	public void setTipoAlimento(String tipoAlimento) {
		this.tipoAlimento = tipoAlimento;
	}
	public LocalDate getFechaAlimento() {
		return fechaAlimento;
	}
	public void setFechaAlimento(LocalDate fechaAlimento) {
		this.fechaAlimento = fechaAlimento;
	}
	public int getIdLote() {
		return idLote;
	}
	public void setIdLote(int idLote) {
		this.idLote = idLote;
	}
	
	
}
