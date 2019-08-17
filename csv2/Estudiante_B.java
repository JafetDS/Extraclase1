
package CSV2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Estudiante_B extends Usuario {
    
    String Promedio_Proyecto;
    int PP;
    int proyecto_1b;
    int proyecto_2b;
    int proyecto_3b;

    public Estudiante_B(String Carne, String Nombre, String correo, String telefono, String nickname, String tipo, String Prom_examenes, String Prom_quices, String Prom_tareas, String proyecto_1, String proyecto_2, String proyecto_3) {
        super(Carne, Nombre, correo, telefono, nickname, tipo, Prom_examenes, Prom_quices, Prom_tareas, proyecto_1, proyecto_2, proyecto_3);

        
    }

    public String getPromedio_Proyecto(){
        proyecto_1b=Integer.parseInt(proyecto_1);
        proyecto_2b=Integer.parseInt(proyecto_2);
        proyecto_3b=Integer.parseInt(proyecto_3);
        
        PP=(proyecto_1b+proyecto_2b+proyecto_3b);
        Promedio_Proyecto=Integer.toString(PP);
        return Promedio_Proyecto;   
    }    
        
        
        
    
    
    
    
    
    
}
