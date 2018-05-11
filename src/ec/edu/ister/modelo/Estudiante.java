/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import sun.invoke.empty.Empty;

/**
 *
 * @author SuRo.kaneki
 */
public class Estudiante {
    private String nombre;
    private String genero;
    private int edad;
    private double nota;

    public Estudiante() {
    }

    public Estudiante(String nombre, String genero, int edad, double nota) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.nota = nota;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the nota
     */
    public double getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        
        
            return "El alumno : "+getNombre()
              +"\n está aprobado!!! ";
    }
}
