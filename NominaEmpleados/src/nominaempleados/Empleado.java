/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nominaempleados;

/**
 *
 * @author jahuc_000
 */
public abstract class Empleado implements PorPagar {
    
        private String nombre;
        private String apellido;
        private String NumeroSeguroSocial;

    public Empleado(String nombre, String apellido, String NumeroSeguroSocial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.NumeroSeguroSocial = NumeroSeguroSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroSeguroSocial() {
        return NumeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String NumeroSeguroSocial) {
        this.NumeroSeguroSocial = NumeroSeguroSocial;
    }

    @Override
    public String toString() {
        return String.format("%s %s\nnumero de seguro social: %s",getNombre(),getApellido(),getNumeroSeguroSocial());
    }
    
    public abstract double ingresos();
    
}
