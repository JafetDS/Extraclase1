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
public class Estudiante_A extends Usuario {
    String Promedio_EQT;
    int PP;
    int proyecto_1b;
    int proyecto_2b;
    int proyecto_3b;

    public Estudiante_A(String Carne, String Nombre, String correo, String telefono, String nickname, String tipo, String Prom_examenes, String Prom_quices, String Prom_tareas, String proyecto_1, String proyecto_2, String proyecto_3) {
        super(Carne, Nombre, correo, telefono, nickname, tipo, Prom_examenes, Prom_quices, Prom_tareas, proyecto_1, proyecto_2, proyecto_3);
    }

        
    

    public String getPromedio_EQT(){
        proyecto_1b=Integer.parseInt(Prom_examenes);
        proyecto_2b=Integer.parseInt(Prom_quices);
        proyecto_3b=Integer.parseInt(Prom_tareas);
        
        PP=(proyecto_1b+proyecto_2b+proyecto_3b);
        Promedio_EQT=Integer.toString(PP);
        return Promedio_EQT;   
    }      
}
