package Service;

import DTO.GallinaDTO;
import Repository.GallinaRepositoryIMP;

public class GallinaServiceIMP implements GallinaService<GallinaDTO>{

	GallinaRepositoryIMP repo = new GallinaRepositoryIMP();
	
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



}
