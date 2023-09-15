

package cl.duoc.prueba.domain;

import java.util.Date;

public class Tarjeta {
    
    private long codigo;
    private int clave, monto;
    private Date vigencia;
    private Trabajador trabajador;

    public Tarjeta() {
        this.codigo = 1000000000000000L;
    }

    public Tarjeta(long codigo, int clave, int monto, Date vigencia, Trabajador trabajador) {
        this.codigo = codigo;
        this.clave = clave;
        this.monto = monto;
        this.vigencia = vigencia;
        this.trabajador = trabajador;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Date getVigencia() {
        return vigencia;
    }

    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }
    
    public long generarCodigo() {
        return(this.codigo += 1);
    }
    
    public boolean validarMonto(int precio) {
        return(precio >= this.monto);        
    }
    
    public int descontarMonto(int precio) {
        return(this.monto - precio);
    }
    
    public boolean validarVigencia() {
        Date fechaActual = new Date();
        
        if(fechaActual.before(vigencia)) {
            System.out.println("Ta bien");
            return true;
        } else if (fechaActual.after(vigencia)) {
            System.out.println("Ta mal");
            return false;
        } else {
            System.out.println("Ta bien");
            return true;
        }
    }
    
    
}
