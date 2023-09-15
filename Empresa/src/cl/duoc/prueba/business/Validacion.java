
package cl.duoc.prueba.business;

public class Validacion {

    public Validacion() {
    }
    
    public boolean validarClave(int run, int clave) {
        String runS, runSubstring;
        runS = run + "";
        runSubstring = runS.substring(0, 4);
        
       return (runSubstring.equals(clave + ""));
        
    }
    
    public boolean validarNombre(String nombre) {
        return (nombre.equals(""));
    }
    
    public boolean validarDV(char dv) {
        return (dv >= '0' && dv <= '9') || dv == 'K' || dv == 'k';
    }
    
    public boolean validarMonto(int monto) {
        return (monto >= 0);
    }
    
}

