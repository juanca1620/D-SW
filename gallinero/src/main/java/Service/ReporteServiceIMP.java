package Service;

import DTO.ReporteDTO;
import Repository.ReporteRepositoryIMP;
import Verificator.ReporteVerificator;
import java.util.List;

public class ReporteServiceIMP implements ReporteService<ReporteDTO>{
	
	ReporteRepositoryIMP repo = new ReporteRepositoryIMP();
        
	@Override
	public boolean save(ReporteDTO dto) {
            if(ReporteVerificator.isReporteVacio(dto.getArgumento())){
                throw new IllegalArgumentException("Error: El argumento del reporte no puede ser vacio");
            }
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

    public List<ReporteDTO> returnProductionReports() {
        return repo.returnProductionReports();
    }

    public List<ReporteDTO> returnBatchReports() {
         return repo.returnBatchReports();
    }

	
}
