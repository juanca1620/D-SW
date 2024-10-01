package Service;

import DTO.ReporteDTO;
import Repository.ReporteRepositoryIMP;

public class ReporteServiceIMP implements ReporteService<ReporteDTO>{
	
	ReporteRepositoryIMP repo = new ReporteRepositoryIMP();
        
	@Override
	public boolean save(ReporteDTO dto) {
		return repo.save(dto);
	}

	@Override
	public ReporteDTO getById(int id) {
		// TODO Auto-generated method stub
		return repo.getById(id);
	}

	@Override
	public boolean update(ReporteDTO dto) {
		return repo.update(dto);
	}

	@Override
	public boolean deleteById(int id) {
		return repo.deleteById(id);
	}

	
}
