package DTO;

import java.time.LocalDate;

public class AlimentoDTO {
	private int id;
	private String tipoAlimento;
        private int cantidadAlimento;
	private LocalDate fechaAlimento;
	private int idLote;
	
	public AlimentoDTO(int id, String tipoAlimento,int cantidadAlimento, LocalDate fechaAlimento, int idLote) {
		this.id = id;
		this.tipoAlimento = tipoAlimento;
                this.cantidadAlimento = cantidadAlimento;
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

    public int getCantidadAlimento() {
        return cantidadAlimento;
    }

    public void setCantidadAlimento(int cantidadAlimento) {
        this.cantidadAlimento = cantidadAlimento;
    }
	
	
}
