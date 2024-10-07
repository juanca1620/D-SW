package Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import DTO.ProduccionDTO;
import Repository.ProduccionRepositoryIMP;
import Verificator.ProduccionVerificator;

public class ProduccionServiceIMP implements ProduccionService<ProduccionDTO> {

    ProduccionRepositoryIMP repo = new ProduccionRepositoryIMP();

    @Override
    public boolean save(ProduccionDTO dto) {
        if (!ProduccionVerificator.isCantidadValida(dto.getCantidadHuevos())) {
            throw new IllegalArgumentException("Error:Esta producion NO PUEDE tener huevos negativos");
        }
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

    public boolean verificarFormatoFecha (String fecha){
        String regex = "^(19|20)\\d{2}-(0[1-9]|1[0-2])-([0-2]\\d | 3[01])$"; 
        Pattern pattern =  Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fecha);
        return matcher.matches();
    }
}
