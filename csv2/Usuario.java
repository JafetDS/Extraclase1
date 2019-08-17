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

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleIntegerProperty;


public class Usuario {
    public String Carne;
    public String Nombre;
    public String correo;
    public String telefono;
    public String nickname;
    public String tipo;
    public String Prom_examenes;
    public String Prom_quices;
    public String Prom_tareas;  
    public String proyecto_1; 
    public String proyecto_2; 
    public String proyecto_3;
    
  //  public SimpleDoubleProperty Carne;
    //public SimpleStringProperty Nombre;
  //  public SimpleStringProperty correo;
  //  public SimpleDoubleProperty telefono;
  //  public SimpleStringProperty nickname;
  //  public SimpleStringProperty tipo;
  //  public SimpleIntegerProperty Prom_examenes;
  //  public SimpleIntegerProperty Prom_quices;
  //  public SimpleIntegerProperty Prom_tareas;
  //  public SimpleIntegerProperty proyecto_1;
  //  public SimpleIntegerProperty proyecto_2;
  //  public SimpleIntegerProperty proyecto_3;
    
    
    public Usuario(String Carne, String Nombre, String correo, String telefono, String nickname, String tipo, String Prom_examenes, String Prom_quices, String Prom_tareas, String proyecto_1, String proyecto_2, String proyecto_3) {
        this.Carne = Carne;
        this.Nombre = Nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.nickname = nickname;
        this.tipo = tipo;
        this.Prom_examenes = Prom_examenes;
        this.Prom_quices = Prom_quices;
        this.Prom_tareas = Prom_tareas;
        this.proyecto_1 = proyecto_1;
        this.proyecto_2 = proyecto_2;
        this.proyecto_3 = proyecto_3;
        
        
    }

    public String getCarne() {
        return Carne;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNickname() {
        return nickname;
    }

    public String getTipo() {
        return tipo;
    }

    public String getProm_examenes() {
        return Prom_examenes;
    }

    public String getProm_quices() {
        return Prom_quices;
    }

    public String getProm_tareas() {
        return Prom_tareas;
    }

    public String getProyecto_1() {
        return proyecto_1;
    }

    public String getProyecto_2() {
        return proyecto_2;
    }

    public String getProyecto_3() {
        return proyecto_3;
    }   
}
    
    

