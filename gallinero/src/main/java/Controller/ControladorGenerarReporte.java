/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DTO.ReporteDTO;
import Service.ReporteService;
import Service.ReporteServiceIMP;

/**
 *
 * @author USUARIO
 */
public class ControladorGenerarReporte {

    private ReporteService service;
    
    public ControladorGenerarReporte() {
        service = new ReporteServiceIMP();
    }
    
    
    public int analizarTipo (String datoConbobox){
        if("reporte de produccion" == datoConbobox){
            return 1;
        }else if ("Reporte general de las gallinas" == datoConbobox) {
            return 2;
        }else {
        	throw new IndexOutOfBoundsException("Error, este tipo de reporte NO EXISTE");
        }
    }
    
    public boolean saveReporte (ReporteDTO dto){
        return service.save(dto);
    }
}
