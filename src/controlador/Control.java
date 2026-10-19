package controlador;


import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ERA-PC37
 */
public class Control {
    public static void inicia(){
    try {
            Runtime.getRuntime().exec("C:\\xampp\\apache\\bin\\httpd.exe");
       
            Runtime.getRuntime().exec("C:\\xampp\\MySQL_start.bat");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void detener(){
        try {
            Runtime.getRuntime().exec("taskkill /F /IM httpd.exe");
            
            Runtime.getRuntime().exec("taskkill /F /IM mysqld.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
