package DTO;

public class ReporteDTO {

	private int id;
	private String argumento;
	private int tipoReporte;
	private int idPadre;
	
	public ReporteDTO(int id, String argumento, int tipoReporte, int idPadre) {
		super();
		this.id = id;
		this.argumento = argumento;
		this.tipoReporte = tipoReporte;
		this.idPadre = idPadre;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArgumento() {
		return argumento;
	}
	public void setArgumento(String argumento) {
		this.argumento = argumento;
	}
	public int getTipoReporte() {
		return tipoReporte;
	}
	public void setTipoReporte(int tipoReporte) {
		this.tipoReporte = tipoReporte;
	}
	public int getIdPadre() {
		return idPadre;
	}
	public void setIdPadre(int idPadre) {
		this.idPadre = idPadre;
	}
	
	
}
