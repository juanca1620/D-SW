package Repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DTO.AlimentoDTO;
import DTO.VentaDTO;
import dataBaseConfig.DataBaseConfig;

public class VentaRepository implements IRepository<VentaDTO>{

	@Override
	public boolean save(VentaDTO dto) {
		String query = "INSERT INTO ventas(fecha_venta,cantidad_vendida,precio_venta,id_usuario,id_produccion) VALUES (?,?,?,?,?)";
		try (Connection connection = DataBaseConfig.getConnection();
				PreparedStatement stament = connection.prepareStatement(query)){
			stament.setDate(1, Date.valueOf(dto.getFechaVenta()));
			stament.setInt(2, dto.getCantidadVendida());
			stament.setFloat(3, dto.getPrecioVenta());
			stament.setInt(4, dto.getIdUsuario());
			stament.setInt(5, dto.getIdProduccion());
			
			return 0 <stament.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public VentaDTO getById(int id) {
		String query = "SELECT * FROM ventas WHERE id = ?";
		try (Connection connection = DataBaseConfig.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);){
			statement.setInt(1, id);
			ResultSet set = statement.executeQuery();
			if(set.next()){
				return new VentaDTO(set.getInt(1), set.getDate(2).toLocalDate(),set.getInt(3), set.getFloat(4), set.getInt(5),set.getInt(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		String query = "DELETE FROM ventas WHERE id =?";
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
	public boolean update(VentaDTO dto) {
		String query = "UPDATE ventas SET fecha_venta = ?,cantidad_vendida = ?, precio_venta = ? WHERE id = ?";
		try (Connection connection = DataBaseConfig.getConnection();
				PreparedStatement stament = connection.prepareStatement(query)){
			stament.setDate(1, Date.valueOf(dto.getFechaVenta()));
			stament.setInt(2, dto.getCantidadVendida());
			stament.setFloat(3, dto.getPrecioVenta());
			
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
		
	}

}
