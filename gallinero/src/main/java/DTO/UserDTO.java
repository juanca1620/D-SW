package DTO;

import java.time.LocalDate;

public class UserDTO {

	private int id;
    private String nombre;
    private LocalDate fehcaNacimiento;
    private String gmail;
    private String contrasenaHash;
    
    
	public UserDTO(int id, String nombre, LocalDate fehcaNacimiento, String gmail, String contrasenaHash) {
		this.id = id;
		this.nombre = nombre;
		this.fehcaNacimiento = fehcaNacimiento;
		this.gmail = gmail;
		this.contrasenaHash = contrasenaHash;
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
	public LocalDate getFehcaNacimiento() {
		return fehcaNacimiento;
	}
	public void setFehcaNacimiento(LocalDate fehcaNacimiento) {
		this.fehcaNacimiento = fehcaNacimiento;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getContrasenaHash() {
		return contrasenaHash;
	}
	public void setContrasenaHash(String contrasenaHash) {
		this.contrasenaHash = contrasenaHash;
	}
    
    
    
}
