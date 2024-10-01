package Repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DTO.ProduccionDTO;
import Service.ProduccionService;
import dataBaseConfig.DataBaseConfig;

public class ProduccionRepositoryIMP implements ProduccionService<ProduccionDTO>{

	@Override
	public boolean save(ProduccionDTO dto) {

		String query = "INSERT INTO produccion(cantidad_huevos,fecha_produccion,id_lote) VALUES (?,?,?)";
		try (Connection connection = DataBaseConfig.getConnection();
				PreparedStatement stament = connection.prepareStatement(query)){
			stament.setInt(1, dto.getCantidadHuevos());
			stament.setDate(2, Date.valueOf(dto.getFechaProduccion()));
			stament.setInt(3, dto.getIdLote());
			
			return 0 <stament.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}

	@Override
	public ProduccionDTO getById(int id) {
		
		String query = "SELECT * FROM produccion WHERE id = ?";
		try (Connection connection = DataBaseConfig.getConnection();
				PreparedStatement stament = connection.prepareStatement(query)){
			stament.setInt(1, id);
			
			ResultSet set = stament.executeQuery();
			
			if(set.next()) {
				return new ProduccionDTO(set.getInt(1),set.getInt(2),set.getDate(3).toLocalDate(), set.getInt(4));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}

	@Override
	public boolean deleteById(int id) {
		String query = "DELETE FROM produccion WHERE id = ?";
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
	public boolean update(ProduccionDTO dto) {
		String query = "UPDATE produccion SET cantidad_huevos = ?,id_lote = ? WHERE id = ?";
		try (Connection connection = DataBaseConfig.getConnection();
				PreparedStatement stament = connection.prepareStatement(query)){
			stament.setInt(1, dto.getCantidadHuevos());
			stament.setInt(2, dto.getIdLote());
			stament.setInt(3, dto.getId());
			
			return 0 <stament.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
