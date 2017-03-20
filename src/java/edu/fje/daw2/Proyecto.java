/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fje.daw2;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author weily
 */
public class Proyecto {
    
    public int codi;
    public String nombre;
    public String Tasques;
    public String data_inici;
    public String data_fi;

    public Proyecto(int codi, String nombre, String Tasques, String data_inici, String data_fi) {
        this.codi = codi;
        this.nombre = nombre;
        this.Tasques = Tasques;
        this.data_inici = data_inici;
        this.data_fi = data_fi;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public String getTasques() {
        return Tasques;
    }

    public void setTasques(String Tasques) {
        this.Tasques = Tasques;
    }

    public String getData_inici() {
        return data_inici;
    }

    public void setData_inici(String data_inici) {
        this.data_inici = data_inici;
    }

    public String getData_fi() {
        return data_fi;
    }

    public void setData_fi(String data_fi) {
        this.data_fi = data_fi;
    }
    ArrayList<Tarea> Tarea = new ArrayList<Tarea>();
}
