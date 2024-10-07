/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author USUARIO
 */
public class DateNotValidException extends RuntimeException{
    
    public DateNotValidException (){
        super("Este formato de fecha no es valido");
    }
}
