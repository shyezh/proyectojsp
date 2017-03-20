/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fje.daw2;


/**
 *
 * @author weily
 */
public class Tarea {
    
    public String nom;
    public String descripcio;
    public String dies;
    public String realitzat;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public String getDies() {
        return dies;
    }

    public void setDies(String dies) {
        this.dies = dies;
    }

    public String getRealitzat() {
        return realitzat;
    }

    public void setRealitzat(String realitzat) {
        this.realitzat = realitzat;
    }

    public Tarea(String nom, String descripcio, String dies, String realitzat) {
        this.nom = nom;
        this.descripcio = descripcio;
        this.dies = dies;
        this.realitzat = realitzat;
    }


    
}
