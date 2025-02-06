/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sistemagestiontarea.modelo;

/**
 *
 * @author jordy
 */
public class Tarea {
    private int id;
    private String titulo;
    private String descripcion;
    private boolean tareaCompleta;

    public Tarea(int par, String titulo, String descripcion, boolean tareaCompleta) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tareaCompleta = tareaCompleta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isTareaCompleta() {
        return tareaCompleta;
    }

    public void setTareaCompleta(boolean tareaCompleta) {
        this.tareaCompleta = tareaCompleta;
    }
    
    
}
