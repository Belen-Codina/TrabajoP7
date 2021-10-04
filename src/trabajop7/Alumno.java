/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajop7;

import java.util.HashSet;

/**
 *
 * @author belen
 */
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> lista=new HashSet();

    @Override
    public String toString() {
        return "Alumno{"  + apellido + " " + nombre +  '}';
    }

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public HashSet<Materia> getLista() {
        return lista;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLista(HashSet<Materia> lista) {
        this.lista = lista;
    }
    
    public void agregarMateria(Materia materia){
        lista.add(materia);
        
    }
    public int cantidadDeMaterias(){
        return lista.size();
    }
    
    
    
}
