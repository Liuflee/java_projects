/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.appmusica.domain;

public class Cancion {
    private String titulo;
    private Artista artista;
    private int duracionSegs;
    private boolean esFav, esDescargada;

    public Cancion() {
    }

    public Cancion(String titulo, Artista artista, int duracionSegs, boolean esFav, boolean esDescargada) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracionSegs = duracionSegs;
        this.esFav = esFav;
        this.esDescargada = esDescargada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public int getDuracionSegs() {
        return duracionSegs;
    }

    public void setDuracionSegs(int duracionSegs) {
        this.duracionSegs = duracionSegs;
    }

    public boolean isEsFav() {
        return esFav;
    }

    public void setEsFav(boolean esFav) {
        this.esFav = esFav;
    }

    public boolean isEsDescargada() {
        return esDescargada;
    }

    public void setEsDescargada(boolean esDescargada) {
        this.esDescargada = esDescargada;
    }
    
   
    
}
