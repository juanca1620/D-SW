package Service;

import DTO.GallinaDTO;
import Model.Gallina;
import Repository.GallinaRepository;

public class GallinaService implements ISERVICE<GallinaDTO, Gallina>{

	GallinaRepository repo = new GallinaRepository();
	
	@Override
	public boolean save(GallinaDTO dto) {
		return repo.save(dto);
	}

	@Override
	public GallinaDTO getById(int id) {
		return repo.getById(id);
	}

	@Override
	public boolean update(GallinaDTO dto) {
		return repo.update(dto);
	}

	@Override
	public boolean deleteById(int id) {
		return repo.deleteById(id);
	}

	@Override
	public GallinaDTO classToDTO(Gallina date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Gallina DTOToClass(GallinaDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
