/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cl.duoc.appmusica.main;

import cl.duoc.appmusica.domain.Artista;
import cl.duoc.appmusica.domain.Cancion;
import cl.duoc.appmusica.domain.Playlist;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sumir
 */
public class AppMusica {

    public static void main(String[] args) {
        
        Artista artista1 = new Artista("Ado");
        Artista artista2 = new Artista("illion");
        
        Cancion cancion1 = new Cancion("Gira Gira", artista1, 300, true, true);
        Cancion cancion2 = new Cancion("Readymade", artista1, 350, true, true);
        Cancion cancion3 = new Cancion("Eien no Akuruhi", artista1, 400, true, false);
        
        Cancion cancion4 = new Cancion("Y", artista2, 500, true, true);
        Cancion cancion5 = new Cancion("Dream Play Sick", artista2, 500, true, true);
        Cancion cancion6 = new Cancion("GASSHOW", artista2, 550, true, true);
        
        
        ArrayList<Cancion> listaCanciones1 = new ArrayList<>();
        Playlist playlist1 = new Playlist(listaCanciones1);
        listaCanciones1.add(cancion1);
        listaCanciones1.add(cancion2);
        listaCanciones1.add(cancion3);
        
        
        ArrayList<Cancion> listaCanciones2 = new ArrayList<>();
        Playlist playlist2 = new Playlist(listaCanciones2);
        listaCanciones2.add(cancion4);
        listaCanciones2.add(cancion5);
        listaCanciones2.add(cancion6);
        
        Scanner sc = new Scanner(System.in);
        int opc;
        
        do {
            System.out.println("¿Que playlist quieres escuchar?");
            System.out.println("1 - Playlist de Ado");
            System.out.println("2 - Playlist de illion");
            System.out.println("3 - Salir");
            opc = sc.nextInt();
            
            switch (opc) {
                case 1:
                    playlist1.mostrarLista();
                    break;
                case 2:
                    playlist2.mostrarLista();
                    break;
                case 3:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Fuera de rango");
                    continue;
            }
            
            
        } while (opc != 3);
        
        
    }
    
}
