package DTO;

public class LoteDTO {

	private int id;
	private String nombre;
	private String nombreDireccion;
	
	public LoteDTO(int id, String nombre, String nombreDireccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nombreDireccion = nombreDireccion;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombreDireccion() {
		return nombreDireccion;
	}
	public void setNombreDireccion(String nombreDireccion) {
		this.nombreDireccion = nombreDireccion;
	}
	
	
}
