/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eBrain;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author luigy
 */
public class Perfil {
    private String nombre;
    private String raza;
    private String genero;
    private Date fechaNacimiento;
    private String obs;
    private LinkedList<Perfil> hijos;
    private LinkedList<mapaMental> mapamental;

    public Perfil() {
    }

    public Perfil(String nombre, String raza, String genero, Date fechaNacimiento, String obs) {
        this.nombre = nombre;
        this.raza = raza;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.obs = obs;
        hijos=new LinkedList();
        mapamental=new LinkedList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public LinkedList<Perfil> getHijos() {
        return hijos;
    }

    public void setHijos(LinkedList<Perfil> hijos) {
        this.hijos = hijos;
    }

    public LinkedList<mapaMental> getMapamental() {
        return mapamental;
    }

    public void setMapamental(LinkedList<mapaMental> mapamental) {
        this.mapamental = mapamental;
    }
    
    
}