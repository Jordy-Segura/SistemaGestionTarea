/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sistemagestiontarea.controlador;

/*
 *
 * @author SO-LAB1-PC24
 */
import ec.edu.espoch.sistemagestiontarea.modelo.GestorTareas;
import ec.edu.espoch.sistemagestiontarea.modelo.Tarea;
import ec.edu.espoch.sistemagestiontarea.vista.Completas;
import ec.edu.espoch.sistemagestiontarea.vista.Interfaz;
import ec.edu.espoch.sistemagestiontarea.vista.Pendientes;

public class Controlador {

    private Completas completas;
    private Pendientes pendientes;
    private Interfaz Vista;
    private GestorTareas gestorTareas;

    public Controlador(Completas completas, Pendientes pendientes, Interfaz Vista) {
        this.completas = completas;
        this.pendientes = pendientes;
        this.Vista = Vista;
        this.gestorTareas = new GestorTareas();
    }

    public void procesoGestorTareas() {                            
        try{
        String titulo = Vista.getTituloTarea();
        String Descripcion = Vista.getDescripcion();
        boolean Pendiente = Vista.setPendiente();
        boolean Completada = Vista.setCompletada();
        
        Tarea tarea = new Tarea(0, titulo, Descripcion, Completada);
               
        gestorTareas.agregarTarea(tarea);
        
        if (Completada) {
            Vista.setMostarTareas(titulo+" "+Descripcion+" "+"Completada");
        } else  if (Pendiente) {
            Vista.setMostarTareas(titulo+" "+Descripcion+" "+"Pendiente");
        }
        }catch(NumberFormatException e){
            Vista.setMostarTareas("Error cambiate a ambiental");
        }
    }
    
    

}
