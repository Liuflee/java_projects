/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redessociales.domain;

import java.util.Date;

/**
 *
 * @author Sumir
 */
public class Twitter extends RedSocial {
    
    private int id;
    private String noticia;
    private Date fecha;

    public Twitter() {
        
    }

    public Twitter(int id, String noticia, String usuario, String password) {
        super(usuario, password);
        this.id = id;
        this.noticia = noticia;
        this.fecha = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean validarCuenta(String user, String pass) {
        return (user.equals(this.usuario) && pass.equals(this.password));
    } 
            
    @Override
    public String toString() {
        return "Twitter{" + "id=" + id + ", noticia=" + noticia + ", fecha=" + fecha + '}';
    }
    
    @Override
    public void listar() {
        System.out.println("Usuario Conectado: " + usuario + " Noticia: " + noticia);
    }
    
    

}
