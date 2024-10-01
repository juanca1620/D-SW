package Service;

import DTO.AlimentoDTO;
import Repository.AlimentoRepositoryIMP;

public class AlimentoServiceIMP implements AlimentoService<AlimentoDTO>{
	private AlimentoRepositoryIMP repo = new AlimentoRepositoryIMP();
	@Override
	public boolean save(AlimentoDTO dto) {
		return repo.save(dto);
	}

	@Override
	public AlimentoDTO getById(int id) {
		return repo.getById(id);
	}

	@Override
	public boolean update(AlimentoDTO dto) {
		return repo.update(dto);
	}

	@Override
	public boolean deleteById(int id) {
		return repo.deleteById(id);
	}
}
