/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DTO.ReporteDTO;
import Service.ReporteService;
import Service.ReporteServiceIMP;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class ControladorReportesGenerales {
    
    ReporteService service = new ReporteServiceIMP();
    
    public List<ReporteDTO> devolverReporteProducciones (){
        return service.returnProductionReports();
    }
    
    public List<ReporteDTO> devolverReporteLotes(){
        return service.returnBatchReports();
    }
}
