package Service;

import DTO.VentaDTO;
import Repository.VentaRepositoryIMP;

public class VentaServiceIMP implements VentaService<VentaDTO>{
	
	private VentaRepositoryIMP repo = new VentaRepositoryIMP();
	@Override
	public boolean save(VentaDTO dto) {
		return repo.save(dto);
	}

	@Override
	public VentaDTO getById(int id) {
		return repo.getById(id);
	}

	@Override
	public boolean update(VentaDTO dto) {
		return repo.update(dto);
	}

	@Override
	public boolean deleteById(int id) {
		return deleteById(id);
	}
}
