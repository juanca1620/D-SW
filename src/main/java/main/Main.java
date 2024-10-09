/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import Service.IAServiceIMP;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        IAServiceIMP service = new IAServiceIMP();

        List<List<Object>> matriz= service.getTable(service.giveSQLCode("Dame las produciones con un huevo o mas producidos"));
    }
}
