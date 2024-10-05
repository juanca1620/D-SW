/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DTO.ProduccionDTO;
import com.mysql.cj.xdevapi.Result;
import dataBaseConfig.DataBaseConfig;
import java.sql.Array;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sun.jvm.hotspot.oops.Metadata;

/**
 *
 * @author USUARIO
 */
public class IARepositoryIMP implements IARepository {

    public List<List<Object>> executeQuery(String query) {

        try (Connection connecion = DataBaseConfig.getConnection(); PreparedStatement statment = connecion.prepareStatement(query);
                ResultSet set = statment.executeQuery();) {
            
            ResultSetMetaData estructuraSet = set.getMetaData();
            List<List<Object>> matriz = new  ArrayList<>();
            
            int filas = estructuraSet.getColumnCount();
            
            for (int i = 0; i < filas; i++) {
                matriz.add(new ArrayList<Object>());
            }
            
            for (int i = 0; i < matriz.size(); i++) {
                matriz.get(i).add(estructuraSet.getColumnName(i + 1));
            }
            
            while (set.next()) {                
                for (int i = 0; i < filas; i++) {
                    matriz.get(i).add(set.getObject(i + 1));
                }
            }
            return matriz;
        } catch (SQLException e) {
            throw  new RuntimeException("Error: algo paso con la base de datos");
        }
    }
    
}
