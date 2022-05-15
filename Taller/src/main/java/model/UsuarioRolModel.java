/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;


public class UsuarioRolModel {
   
    public String nombreRol;
    public String nombreUsuario;
    public boolean activo;
    public Date fechaIni;
    public Date fechaFin;

    public UsuarioRolModel(String nombreRol, String nombreUsuario, boolean activo, Date fechaIni, Date fechaFin) {
        this.nombreRol = nombreRol;
        this.nombreUsuario = nombreUsuario;
        this.activo = activo;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }
    
    

}
