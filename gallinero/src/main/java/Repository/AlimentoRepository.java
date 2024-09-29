package Repository;

import java.sql.Connection;

import DTO.AlimentoDTO;
import dataBaseConfig.DataBaseConfig;

public class AlimentoRepository implements IRepository<AlimentoDTO>{

	@Override
	public void save(AlimentoDTO dto) {
		String query = "INSERT INTO alimentacion(tipo_alimento,fecha_alimento,id_lote) VALUES (?,?,?)";
		try (Connection connection = DataBaseConfig.getConnection();
				){
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public AlimentoDTO getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(AlimentoDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeChilds(int id) {
		// TODO Auto-generated method stub
		
	}

}
