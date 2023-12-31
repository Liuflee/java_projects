/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.appmusica.domain;

import java.util.ArrayList;

/**
 *
 * @author Sumir
 */
public class Playlist {
    
    private ArrayList<Cancion> listaCanciones;
    
    public Playlist() {
        listaCanciones = new ArrayList<Cancion>();
    }
 
    
    public boolean agregarCancion(Cancion cancion) {
        return this.listaCanciones.add(cancion);
    }
    
    public void mostrarLista() {
        
        if (!this.listaCanciones.isEmpty()){
            System.out.println("Actualmente reproduciendo: ");
        } else {
            System.out.println("No hay canciones en la playlist");
        }
        
        for (Cancion cancion : listaCanciones) {
            System.out.println(cancion.getTitulo());;
    }
    
    }
    
 
    
}
