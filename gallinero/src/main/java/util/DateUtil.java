/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import exceptions.DateNotValidException;
import java.time.LocalDate;

/**
 *
 * @author USUARIO
 */
public class DateUtil {
        public static LocalDate isoToLocalDate(String date){
        try {
            return LocalDate.parse(date);
        } catch (Exception e) {
            throw new DateNotValidException();
        }
    }
}
