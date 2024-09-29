package Service;

import DTO.ProduccionDTO;
import Model.Produccion;
import Repository.ProduccionRepository;

public class ProduccionService implements ISERVICE<ProduccionDTO, Produccion>{

	ProduccionRepository repo = new ProduccionRepository();
	
	@Override
	public boolean save(ProduccionDTO dto) {
		return repo.save(dto);
	}

	@Override
	public ProduccionDTO getById(int id) {
		return repo.getById(id);
	}

	@Override
	public boolean update(ProduccionDTO dto) {
		return repo.update(dto);
	}

	@Override
	public boolean deleteById(int id) {
		return repo.deleteById(id);
	}

	@Override
	public ProduccionDTO classToDTO(Produccion date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produccion DTOToClass(ProduccionDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
