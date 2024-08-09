/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproyecto.proyectoacademicopoo;

/**
 *
 * @author Kim Villeda
 */
public class Test {
    public static void main(String[] args) {
        // Crear catedráticos
        Catedrático catedratico1 = new Catedrático("Dr. piz");
        Catedrático catedratico2 = new Catedrático("Dra. cu");
        Catedrático catedratico3 = new Catedrático("Lic. more");

        // Crear cursos
        Curso curso1 = new Curso("quimica", 101, 2);
        Curso curso2 = new Curso("industrial", 102, 5);
        Curso curso3 = new Curso("Literatura", 103, 5);

        // Crear alumnos
        Alumno alumno1 = new Alumno("pipe");
        Alumno alumno2 = new Alumno("pepe");
        Alumno alumno3 = new Alumno("Cars");

        // Asignar cursos a alumnos
        Asignación asignación1 = new Asignación(alumno1);
        asignación1.addCurso(curso1);
        asignación1.addCurso(curso2);
        asignación1.addCurso(curso3);

        Asignación asignación2 = new Asignación(alumno2);
        asignación2.addCurso(curso1);
        asignación2.addCurso(curso2);
        asignación2.addCurso(curso3);

        Asignación asignación3 = new Asignación(alumno3);
        asignación3.addCurso(curso1);
        asignación3.addCurso(curso2);
        asignación3.addCurso(curso3);

        // Imprimir datos
        catedratico1.imprimirDatos();
        catedratico2.imprimirDatos();
        catedratico3.imprimirDatos();

        alumno1.imprimirDatos();
        alumno2.imprimirDatos();
        alumno3.imprimirDatos();
    }
}

