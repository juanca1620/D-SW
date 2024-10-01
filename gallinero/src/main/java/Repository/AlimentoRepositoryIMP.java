package Repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DTO.AlimentoDTO;
import dataBaseConfig.DataBaseConfig;

public class AlimentoRepositoryIMP implements AlimentoRepository<AlimentoDTO>{

	@Override
	public boolean save(AlimentoDTO dto) {
		String query = "INSERT INTO alimentacion(tipo_alimento,fecha_alimento,id_lote) VALUES (?,?,?)";
		try (Connection connection = DataBaseConfig.getConnection();
				PreparedStatement stament = connection.prepareStatement(query)){
			stament.setString(1, dto.getTipoAlimento());
			stament.setDate(2, Date.valueOf(dto.getFechaAlimento()));
			stament.setInt(3, dto.getId());
			
			return 0 <stament.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public AlimentoDTO getById(int id) {
		String query = "SELECT * FROM alimentacion WHERE id = ?";
		try (Connection connection = DataBaseConfig.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);){
			statement.setInt(1, id);
			ResultSet set = statement.executeQuery();
			if(set.next()){
				return new AlimentoDTO(set.getInt("id"), set.getString("tipo_alimento"), set.getDate("fecha_alimento").toLocalDate(), set.getInt("id_lote"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		String query = "DELETE FROM alimentacion WHERE id =?";
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
	public boolean update(AlimentoDTO dto) {
		String query = "UPDATE alimentacion SET fecha_alimento = ? WHERE id = ?";
		try (Connection connection = DataBaseConfig.getConnection();
				PreparedStatement stament = connection.prepareStatement(query)){
			stament.setDate(1,Date.valueOf(dto.getFechaAlimento()));
			stament.setInt(2, dto.getId());
			
			return 0 <stament.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
