/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DTO.AlimentoDTO;
import DTO.LoteDTO;
import Service.AlimentoService;
import Service.AlimentoServiceIMP;
import Service.LoteService;
import Service.LoteServiceIMP;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class ControladorAlimentacion {
    
    AlimentoService<AlimentoDTO> service  = new AlimentoServiceIMP();
    
    LoteService loteService = new LoteServiceIMP();
    
    public List<AlimentoDTO> obtenerAlimentaciones(){
        return service.getAll();
    }
    
    public List<LoteDTO>  missingToFeed(){
        return loteService.missingToFeed();
    }
    
    public boolean saveAlimentacion (AlimentoDTO dto){
       return service.save(dto);
    }
}
