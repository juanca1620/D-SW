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
import java.util.ArrayList;
import java.util.List;
import sun.jvm.hotspot.oops.Metadata;

/**
 *
 * @author USUARIO
 */
public class IARepositoryIMP implements IARepository {

    public Object[][] executeQuery(String query) {

        Object[][] tabla = new Object[0][0];

        try (Connection connecion = DataBaseConfig.getConnection(); PreparedStatement statment = connecion.prepareStatement(query)) {
            ResultSet set = statment.executeQuery();

            ResultSetMetaData estructura = set.getMetaData();

            int columnas = estructura.getColumnCount();
            String[] nombreColumnas = new String[columnas];

            for (int i = 0; i < columnas; i++) {
                nombreColumnas[i] = estructura.getCatalogName(i);
            }
            
            int filas = 0;

            while (set.next()) {
                filas++;
            }

            set.first();

            tabla = new Object[filas][columnas];
            tabla[0] = nombreColumnas;
            
            for (Object[] fila : tabla) {
                
                for (int i = 0; i < fila.length; i++) {
                    fila[i] = set.getObject(i);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return tabla;
    }
    
}
