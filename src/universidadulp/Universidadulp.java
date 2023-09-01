/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadulp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MARCELA
 */
public class Universidadulp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
             //conexión a la bd
            Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/universidadulp", "root", "");
        //c)
        
       /* String insAlumno = " INSERT INTO alumno(dni, apellido, nombre, fechaNacimiento, estado) "
                + "VALUES (49775892,'Manteiga','Fabiola','1990-11-13',true),"
                + "(44557788,'Benitez','Maria','1995-04-10',true)";
        
        PreparedStatement ps = conexion.prepareStatement(insAlumno);
               int registros = ps.executeUpdate();
               JOptionPane.showMessageDialog(null,"alumno agregado corectamente");*/
       
        //d)
        
        /*String materia = " INSERT INTO materia(nombre,año, estado) "
                + "VALUES ('Matemática', 1, true),"
                + "('Literatura', 4, true),"
                + "('Historia', 3, true),"
                + "('Química', 2, true)";
        PreparedStatement ps = conexion.prepareStatement(materia);
               int registros = ps.executeUpdate();
               JOptionPane.showMessageDialog(null,"La materia esta agregada");*/
        String inscrip = "INSERT INTO inscripcion(id_alumno,id_materia)"
                + "VALUES(1,1),"
                + "(1,2),(2,2),(2,3),(3,1),(3,4)";
         PreparedStatement ps = conexion.prepareStatement(inscrip);
               int registros = ps.executeUpdate();
               JOptionPane.showMessageDialog(null,"Los alumnos estan inscriptos correctamente");       
        
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, "Error al cargar el driver:" + ex.getMessage());
            
        }
       
           
            
         catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error de conexión:" + ex.getMessage());
        }
        //JOptionPane.showMessageDialog(null, "La conexión al servidor fue exitosa");
    }
    
}
