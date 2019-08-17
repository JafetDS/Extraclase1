/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
package CSV2;

import com.csvreader.CsvReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author xcheko51x
 */
public class Lector {
        /**
     * @return 
     * @throws java.io.FileNotFoundException 
     */

    
    public static List<Usuario> ImportarCSV() throws FileNotFoundException, IOException{
     
        List<Usuario> usuarios; // Lista donde guardaremos los datos del archivo
        usuarios = new ArrayList<>();
            
            CsvReader leerUsuarios = new CsvReader("Usuarios.csv");
            leerUsuarios.readHeaders();
            
            // Mientras haya lineas obtenemos los datos del archivo
            while(leerUsuarios.readRecord()) {
                String Carne=leerUsuarios.get(0);
                String Nombre=leerUsuarios.get(1);
                String correo=leerUsuarios.get(2);
                String telefono=leerUsuarios.get(3);
                String nickname=leerUsuarios.get(4);
                String tipo=leerUsuarios.get(5);
                String Prom_examenes=leerUsuarios.get(6);
                String Prom_quices=leerUsuarios.get(7);
                String Prom_tareas=leerUsuarios.get(8);  
                String proyecto_1=leerUsuarios.get(9); 
                String proyecto_2=leerUsuarios.get(10); 
                String proyecto_3=leerUsuarios.get(11);
                Usuario usuario;
                if (tipo=="A"){
                    usuario = new Estudiante_A(Carne, Nombre, correo, telefono, nickname, tipo,Prom_examenes,Prom_quices,Prom_tareas,proyecto_1,proyecto_2,proyecto_3);
                }// Añade la informacion a la lista
                else{   
                    usuario = new Estudiante_B(Carne, Nombre, correo, telefono, nickname, tipo,Prom_examenes,Prom_quices,Prom_tareas,proyecto_1,proyecto_2,proyecto_3);   }    
                usuarios.add(usuario);
                }
            
            
            leerUsuarios.close(); // Cierra el archivo// Cierra el archivo// Cierra el archivo// Cierra el archivo// Cierra el archivo// Cierra el archivo// Cierra el archivo// Cierra el archivo
            return usuarios;
            
            
    
    
    }
}
