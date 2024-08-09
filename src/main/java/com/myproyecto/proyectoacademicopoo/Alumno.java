/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproyecto.proyectoacademicopoo;

/**
 *
 * @author Kim Villeda
 */
public class Alumno {
    private static int contador = 0;
    private final String nombre;
    private final int idAlumno;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.idAlumno = ++contador;
    }

    public void imprimirDatos() {
        System.out.println("Alumno: " + nombre + " | ID: " + idAlumno);
    }

    public String getNombre() {
        return nombre;
    }
}

