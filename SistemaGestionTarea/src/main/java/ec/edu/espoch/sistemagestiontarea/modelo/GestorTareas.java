/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sistemagestiontarea.modelo;
/**
 *
 * @author jordy
 */
public class GestorTareas {
    private String[] tareas;
    private int contadorId;
    private int cantidadTareas;

    public GestorTareas() {
        tareas = new String[10]; 
        contadorId = 1;
        cantidadTareas = 0;
    }


    public void agregarTarea(Tarea tarea) {
        if (cantidadTareas < tareas.length) {
            tarea.setId(contadorId++);
            tareas[cantidadTareas] = tarea.toString();
            cantidadTareas++;
        } else {
            System.out.println("No se pueden agregar más tareas. Límite alcanzado.");
        }
        
    }

    public String[] listarTareasPendientes() {
        String[] pendientes = new String[cantidadTareas];
        int contador = 0;
        for (int i = 0; i < cantidadTareas; i++) {
            if (!tareas[i].contains("Completa")) { 
                pendientes[contador++] = tareas[i];
            }
        }
        return pendientes;
    }

    public String[] listarTareasCompletadas() {
        String[] completadas = new String[cantidadTareas];
        int contador = 0;
        for (int i = 0; i < cantidadTareas; i++) {
            if (tareas[i].contains("Completa")) { 
                completadas[contador++] = tareas[i];
            }
        }
        return completadas;
    }

    public boolean marcarComoCompletada(int id) {
        for (int i = 0; i < cantidadTareas; i++) {
            if (tareas[i].contains("ID: " + id)) { 
                tareas[i] = tareas[i].replace("Pendiente", "Completa"); 
                return true;
            }
        }
        return false;
    }


}
