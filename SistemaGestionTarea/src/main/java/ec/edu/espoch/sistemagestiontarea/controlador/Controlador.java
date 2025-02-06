/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sistemagestiontarea.controlador;

import ec.edu.espoch.sistemagestiontarea.modelo.GestorTareas;
import ec.edu.espoch.sistemagestiontarea.vista.Interfaz;

/**
 *
 * @author SO-LAB1-PC24
 */
public class Controlador {

    private Interfaz vista;
    private GestorTareas modelo;

    public Controlador(Interfaz vista, GestorTareas modelo) {
        this.vista = vista;
        this.modelo = new GestorTareas();
    }

    public void ProcesoGestorTareas() {


    }
    }

