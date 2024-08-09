/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproyecto.proyectoacademicopoo;

/**
 *
 * @author Kim Villeda
 */
import java.util.ArrayList;
import java.util.List;

public class Asignación {
    private final Alumno alumno;
    private final List<Curso> cursos;

    public Asignación(Alumno alumno) {
        this.alumno = alumno;
        this.cursos = new ArrayList<>();
    }

    public void addCurso(Curso curso) {
        if (curso.verificaEspacio()) {
            cursos.add(curso);
            curso.inscribirAlumno();
            System.out.println("Curso " + curso.getNombre() + " asignado a " + alumno.getNombre());
        } else {
            System.out.println("No se puede asignar el curso " + curso.getNombre() + " a " + alumno.getNombre() + " porque no hay espacio.");
        }
    }
}

