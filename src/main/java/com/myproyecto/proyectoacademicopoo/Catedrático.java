/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproyecto.proyectoacademicopoo;

public class Catedrático {
    private static int contador = 0;
    private String nombre;
    private int idCatedrático;

    public Catedrático(String nombre) {
        this.nombre = nombre;
        this.idCatedrático = ++contador;
    }

    public void imprimirDatos() {
        System.out.println("Catedrático: " + nombre + " | ID: " + idCatedrático);
    }
}

