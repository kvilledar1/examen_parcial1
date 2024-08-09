/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproyecto.proyectoacademicopoo;

/**
 *
 * @author Kim Villeda
 */
public class Curso {
    private final String nombre;
    private final int idCurso;
    private final int cupoMaximo;
    private int alumnosInscritos = 0;

    public Curso(String nombre, int idCurso, int cupoMaximo) {
        this.nombre = nombre;
        this.idCurso = idCurso;
        this.cupoMaximo = cupoMaximo;
    }

    public boolean verificaEspacio() {
        return alumnosInscritos < cupoMaximo;
    }

    public void inscribirAlumno() {
        if (verificaEspacio()) {
            alumnosInscritos++;
        } else {
            System.out.println("No hay espacio en el curso " + nombre);
        }
    }

    public String getNombre() { return nombre; }
    public int getIdCurso() { return idCurso; }
    public int getCupoMaximo() { return cupoMaximo; }
    public int getAlumnosInscritos() { return alumnosInscritos; }
}

