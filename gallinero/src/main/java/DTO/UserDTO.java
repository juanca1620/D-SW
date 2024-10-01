package DTO;

import java.time.LocalDate;

public class UserDTO {

	private int id;
    private String nombre;
    private LocalDate fehcaNacimiento;
    private String contrasenaHash;
    private int idRol;
    
    
	public UserDTO(int id, String nombre, LocalDate fehcaNacimiento, String contrasenaHash,int idRol) {
		this.id = id;
		this.nombre = nombre;
		this.fehcaNacimiento = fehcaNacimiento;
		this.contrasenaHash = contrasenaHash;
		this.idRol = idRol;
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

	public String getContrasenaHash() {
		return contrasenaHash;
	}
	public void setContrasenaHash(String contrasenaHash) {
		this.contrasenaHash = contrasenaHash;
	}

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}
    
    
    
}
