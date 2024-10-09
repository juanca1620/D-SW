/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import java.util.List;

/**
 *
 * @author USUARIO
 */
public interface IAService {
    
    public String giveSQLCode (String promt);
    
    public List<List<Object>> getTable (String query);
    
}
