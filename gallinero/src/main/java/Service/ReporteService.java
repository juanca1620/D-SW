package Service;

import DTO.ReporteDTO;
import Model.Reporte;
import Repository.ReporteRepository;

public class ReporteService implements ISERVICE<ReporteDTO, Reporte>{
	
	ReporteRepository repo= new ReporteRepository();
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

	@Override
	public ReporteDTO classToDTO(Reporte date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reporte DTOToClass(ReporteDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
