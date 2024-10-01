package Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DTO.ReporteDTO;
import dataBaseConfig.DataBaseConfig;

public class ReporteRepositoryIMP implements ReporteRepository <ReporteDTO>{

	@Override
	public boolean save(ReporteDTO dto) {
		String query = "INSERT INTO reportes (argumento,tipo_reporte,id_produccion,id_lote)VALUES (?,?,?,?)";
		try (Connection connection = DataBaseConfig.getConnection();
				PreparedStatement stament = connection.prepareStatement(query)){
			stament.setString(1, dto.getArgumento());
			stament.setInt(2, dto.getTipoReporte());
                    switch (dto.getTipoReporte()) {
                        case 1:
                            stament.setInt(3, dto.getIdPadre());
                            stament.setNull(4, java.sql.Types.INTEGER);
                            break;
                        case 2:
                            stament.setInt(3, java.sql.Types.INTEGER);
                            stament.setNull(4, dto.getIdPadre());
                            break;
                        default:
                            return false;
                    }
			
			return 0 < stament.executeUpdate();
			
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

}
