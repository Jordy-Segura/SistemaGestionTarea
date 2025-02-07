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
        tareas = new String[20];
        contadorId = 1;
        cantidadTareas = 0;
    }

    public String[] agregarTarea(Tarea tarea) {
        for (int i = 0; i < tareas.length; i++) {
            if (cantidadTareas < tareas.length) {
                tarea.setId(contadorId++);
                tareas[i] = tarea.toString();
                cantidadTareas++;  
                break;
            }
        }
        int size = 0;
        for (int i = 0; i < cantidadTareas; i++) {
            if (tareas[i] != null) {
                size++;
            }
        }

        String[] resultado = new String[size];
        for (int i = 0, j = 0; i < cantidadTareas; i++) {
            if (tareas[i] != null) {
                resultado[j++] = tareas[i];
            }
        }
        return resultado;
    }

    public String[] listarTareasPendientes() {
        int size = 0;
        for (int i = 0; i < cantidadTareas; i++) {
            if (tareas[i] != null && tareas[i].contains("Completada: No")) {
                size++;
            }
        }

        String[] pendientes = new String[size];
        int j = 0;
        for (int i = 0; i < cantidadTareas; i++) {
            if (tareas[i] != null && tareas[i].contains("Completada: No")) {
                pendientes[j++] = tareas[i];
            }
        }
        return pendientes;
    }

    public String[] listarTareasCompletadas() {
        int size = 0;
        for (int i = 0; i < cantidadTareas; i++) {
            if (tareas[i] != null && tareas[i].contains("Completada: Sí")) {
                size++;
            }
        }

        String[] completadas = new String[size];
        int j = 0;
        for (int i = 0; i < cantidadTareas; i++) {
            if (tareas[i] != null && tareas[i].contains("Completada: Sí")) {
                completadas[j++] = tareas[i];
            }
        }
        return completadas;
    }

    public boolean marcarComoCompletada(int id) {
        for (int i = 0; i < cantidadTareas; i++) {
            if (tareas[i] != null && tareas[i].contains("ID: " + id)) {
                tareas[i] = tareas[i].replace("Completada: No", "Completada: Sí");
                return true;
            }
        }
        return false;
    
    }

}
