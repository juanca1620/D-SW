package Repository;

import DTO.AlimentoDTO;
import java.awt.Taskbar.State;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DTO.LoteDTO;
import dataBaseConfig.DataBaseConfig;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoteRepositoryIMP implements LoteRepository<LoteDTO>{

	@Override
	public boolean save(LoteDTO dto) {
		String query = "INSERT INTO lotes(id,nombre,nombre_ubicacion) VALUES (?,?,?)";
		try (Connection connection = DataBaseConfig.getConnection();
				PreparedStatement stament = connection.prepareStatement(query)){
			stament.setInt(1, dto.getId());
			stament.setString(2, dto.getNombre());
			stament.setString(3, dto.getNombreDireccion());
			
			return 0 <stament.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}

	@Override
	public LoteDTO getById(int id) {

		String query = "SELECT * FROM lotes WHERE id = ?";
		
		try (Connection connection = DataBaseConfig.getConnection();
				PreparedStatement stament = connection.prepareStatement(query)){
			stament.setInt(1, id);
			ResultSet set = stament.executeQuery();
			
			if(set.next()) {
				return new LoteDTO(set.getInt(1), set.getString(2), set.getString(3));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		String query = "DELETE FROM lotes WHERE id = ?";
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
	public boolean update(LoteDTO dto) {
		String query = "UPDATE lotes SET nombre = ?,nombre_ubicacion = ? WHERE id = ?";
		try (Connection connection = DataBaseConfig.getConnection();
				PreparedStatement stament = connection.prepareStatement(query)){
			stament.setString(1, dto.getNombre());
			stament.setString(2, dto.getNombreDireccion());
			stament.setInt(3, dto.getId());
			
			return 0 <stament.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}

    public List<LoteDTO> missingToFeed() {
        String query = "SELECT l.id, l.nombre, l.nombre_ubicacion\n"
                + "FROM lotes l\n"
                + "LEFT JOIN alimentacion a ON l.id = a.id_lote AND a.fecha_alimento = CURDATE()\n"
                + "WHERE a.id IS NULL;";
        List<LoteDTO> lista = new ArrayList<LoteDTO>();
        
        try (Connection connection = DataBaseConfig.getConnection();
                PreparedStatement statment = connection.prepareStatement(query)){
            ResultSet set = statment.executeQuery();
            while (set.next()) {                
                LoteDTO dto = new LoteDTO(set.getInt(1), set.getString(2), set.getString(3));
                lista.add(dto);
            }
        } catch (SQLException e) {
        }
        return lista;
    }
    
}
