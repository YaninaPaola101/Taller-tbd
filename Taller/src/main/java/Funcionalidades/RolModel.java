/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionalidades;

import java.util.Date;

/**
 *
 * @author Alvaro.Yapu
 */
public class RolModel {
   
    public String nombreRol;
    public String nombreUsuario;
    public boolean activo;
    public Date fechaIni;
    public Date fechaFin;

    public RolModel(String nombreRol, String nombreUsuario, boolean activo, Date fechaIni, Date fechaFin) {
        this.nombreRol = nombreRol;
        this.nombreUsuario = nombreUsuario;
        this.activo = activo;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }
    
    

}
