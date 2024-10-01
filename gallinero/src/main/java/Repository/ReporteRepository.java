package Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DTO.ReporteDTO;
import dataBaseConfig.DataBaseConfig;

public class ReporteRepository implements IRepository<ReporteDTO>{

	@Override
	public boolean save(ReporteDTO dto) {
		String query = "INSERT INTO reportes (argumento,tipo_reporte,id_produccion,id_gallina)VALUES (?,?,?,?)";
		try (Connection connection = DataBaseConfig.getConnection();
				PreparedStatement stament = connection.prepareStatement(query)){
			stament.setString(1, dto.getArgumento());
			stament.setInt(2, dto.getTipoReporte());
			if(dto.getTipoReporte() == 0) {
				stament.setInt(3, dto.getIdPadre());
				stament.setInt(4, 0);
			}else {
				stament.setInt(3, 0);
				stament.setInt(4, dto.getIdPadre());
			}
			
			return 0 <stament.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public ReporteDTO getById(int id) {

		String query = "SELECT * FROM  reportes WHERE id = ?";
		try (Connection connection = DataBaseConfig.getConnection();
				PreparedStatement stament = connection.prepareStatement(query)) {
			stament.setInt(1, id);
			ResultSet set = stament.executeQuery();
			if (set.next()) {
				if(set.getInt(3) == 1) {
					return new ReporteDTO(set.getInt(1), set.getString(2), set.getInt(3), set.getInt(4));
				}else {
					return new ReporteDTO(set.getInt(1), set.getString(2), set.getInt(3), set.getInt(5));
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean deleteById(int id) {
		String query = "DELETE FROM reportes WHERE id = ?";
		try (Connection connection = DataBaseConfig.getConnection();
				PreparedStatement stament = connection.prepareStatement(query)){
			stament.setInt(1,id);
			
			return 0 <stament.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}

	@Override
	public boolean update(ReporteDTO dto) {
		String query = "UPDATE reportes SET argumento = ? WHERE id = ?";
		try (Connection connection = DataBaseConfig.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)){
			statement.setString(1, dto.getArgumento());
			statement.setInt(2, dto.getId());
			
			return 0 < statement.executeUpdate();
		} catch (Exception e) {
			
		}
		
		return false;
	}

	@Override
	public boolean removeChilds(int id) {
		return false;
		
	}

}
