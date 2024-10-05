/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Service.IAService;
import Service.IAServiceIMP;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class ControladorTablasIA {
    
    private IAService service  = new IAServiceIMP();
    
    public List<List<Object>> matrizConsulta (String promt){
        return service.getTable(service.giveSQLCode(promt));
    }
}
