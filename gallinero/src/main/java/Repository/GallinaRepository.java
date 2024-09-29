package Repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DTO.GallinaDTO;
import dataBaseConfig.DataBaseConfig;

public class GallinaRepository implements IRepository<GallinaDTO>{

	@Override
	public boolean save(GallinaDTO dto) {
		String query = "INSERT INTO gallinas(id,fecha_nacimiento,estado_salud,id_lote) VALUES (?,?,?,?)";
		try (Connection connection = DataBaseConfig.getConnection();
				PreparedStatement stament = connection.prepareStatement(query)){
			stament.setInt(1, dto.getId());
			stament.setDate(2, Date.valueOf(dto.getFechaNacimiento()));
			stament.setBoolean(3, dto.isEstadoSalud());
			stament.setInt(4,dto.getIdLote());
			
			return 0 <stament.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public GallinaDTO getById(int id) {
		
		String query = "SELECT * FROM gallinas WHERE id = ?";
		
		try (Connection connection = DataBaseConfig.getConnection();
				PreparedStatement stament = connection.prepareStatement(query)){
			stament.setInt(1, id);
			
			ResultSet set = stament.executeQuery();
			
			if(set.next()) {
				return new GallinaDTO(set.getInt(1), set.getDate(2).toLocalDate(), set.getBoolean(3),set.getInt(4));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		
		String query = "DELETE FROM gallinas WHERE id = ?";
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
	public boolean update(GallinaDTO dto) {
		String query = "UPDATE gallinas SET fecha_nacimiento = ?,estado_salud = ?,id_lote = ? WHERE id = ?";
		try (Connection connection = DataBaseConfig.getConnection();
				PreparedStatement stament = connection.prepareStatement(query)){
			
			stament.setDate(1, Date.valueOf(dto.getFechaNacimiento()));
			stament.setBoolean(2, dto.isEstadoSalud());
			stament.setInt(3, dto.getIdLote());
			stament.setInt(4, dto.getId());
			return 0 <stament.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean removeChilds(int id) {
		return false;
		// TODO Auto-generated method stub
		
	}

}
