/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionalidades;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.HorarioModel;


public class HorarioDao {
    
    public static  ArrayList<HorarioModel> listaInstructor() {
        Connection c = DatabaseConnection.getConnection();
        String query = """
                       select d.nombre,u.nombre,cl.hora_inicio, cl.hora_fin
                       from clase cl, usuario u, disciplina d 
                       where cl.id_usuario = u.id_usuario  and d.id_disciplina = cl.id_disciplina
                       """;
        System.out.println(query);
        ArrayList listaHorarios = new ArrayList<HorarioModel>();
        try {
            Statement stat = c.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                HorarioModel horarioModel = new HorarioModel();
                horarioModel.setDisciplina(rs.getString(1));
                horarioModel.setInstructor(rs.getString(2));
                horarioModel.setInicioClase(rs.getString(3));
                horarioModel.setFinClase(rs.getString(4));
                listaHorarios.add(horarioModel);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            LogDao.insertarLog(DatabaseConnection.loginModel, DatabaseConnection.sesionModel, query);
        }
        return listaHorarios;
    }
    
}
