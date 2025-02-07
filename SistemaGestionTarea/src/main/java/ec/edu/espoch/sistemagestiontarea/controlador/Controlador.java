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
    private Interfaz vista;
    private GestorTareas gestorTareas;

    public Controlador(Completas completas, Pendientes pendientes, Interfaz vista) {
        this.completas = completas;
        this.pendientes = pendientes;
        this.vista = vista;
        this.gestorTareas = new GestorTareas();
    }

    public void procesoGestorTareas() {

        try {
            String titulo = vista.getTituloTarea();
            String descripcion = vista.getDescripcion();
            boolean completada = vista.isCompletada();
            String[] agregarTareas = new String[10];
            Tarea tarea = new Tarea(0, titulo, descripcion, completada);
            

            agregarTareas = gestorTareas.agregarTarea(tarea);

            vista.setMostarTareas(agregarTareas);
        } catch (Exception e) {
            vista.error("Error: " + e.getMessage());

        }
    }

    public void tareasCompletadas() {
        try {
            
            String[] tareasCOmpletadas = new String[20];
            tareasCOmpletadas = gestorTareas.listarTareasCompletadas();
            completas.setMostarTareas(tareasCOmpletadas);
        } catch (Exception e) {
            completas.error("Error: " + e.getMessage());

        }
    }

    public void tareasPendiente() {
        try {
            String[] tareasPendientes = new String[20];
            tareasPendientes = gestorTareas.listarTareasPendientes();
            pendientes.setMostarTareas(tareasPendientes);
        } catch (Exception e) {
            pendientes.error("Error: " + e.getMessage());

        }

    }

}
