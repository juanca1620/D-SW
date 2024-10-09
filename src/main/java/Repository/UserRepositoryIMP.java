package Repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.mindrot.jbcrypt.BCrypt;

import DTO.AlimentoDTO;
import DTO.UserDTO;
import dataBaseConfig.DataBaseConfig;

public class UserRepositoryIMP implements UserRepository<UserDTO>{

	@Override
	public boolean save(UserDTO dto) {
		String query = "INSERT INTO usuarios (id,nombre,fecha_nacimiento,contrasenna,id_rol)VALUES (?,?,?,?,?)";
		try (Connection connection = DataBaseConfig.getConnection();
				PreparedStatement stament = connection.prepareStatement(query)){
			
			stament.setInt(1, dto.getId());
			stament.setString(2, dto.getNombre());
			stament.setDate(3, Date.valueOf(dto.getFehcaNacimiento()));
			stament.setString(4, BCrypt.hashpw(dto.getContrasenaHash(), BCrypt.gensalt()));
			stament.setInt(5, dto.getIdRol());
			
			return 0 <stament.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public UserDTO getById(int id) {
		String query = "SELECT * FROM usuarios WHERE id = ?";
		try (Connection connection = DataBaseConfig.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);){
			statement.setInt(1, id);
			ResultSet set = statement.executeQuery();
			if(set.next()){
				return new UserDTO(set.getInt(1), set.getString(2), set.getDate(3).toLocalDate(), set.getString(4), set.getInt(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		String query = "DELETE FROM usuarios WHERE id =?";
		try (Connection connection = DataBaseConfig.getConnection();
				PreparedStatement stament = connection.prepareStatement(query)){
			stament.setInt(1, id);
			
			return 0 <stament.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(UserDTO dto) {
		String query = "UPDATE usuarios SET nombre = ?,fecha_nacimiento = ?,contrasenna = ? WHERE id = ?";
		try (Connection connection = DataBaseConfig.getConnection();
				PreparedStatement stament = connection.prepareStatement(query)){
			stament.setString(1, dto.getNombre());
			stament.setDate(2, Date.valueOf(dto.getFehcaNacimiento()));
			stament.setString(3, BCrypt.hashpw(dto.getContrasenaHash(), BCrypt.gensalt()));
			stament.setInt(4, dto.getId());
			
			return 0 <stament.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}


}
