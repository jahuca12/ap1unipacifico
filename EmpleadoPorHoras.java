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
public class EmpleadoPorHoras extends Empleado{

        private double sueldo=0.0;
        private double horas=0.0;

    public EmpleadoPorHoras(double sueldo, double horas, String nombre, String apellido, String NumeroSeguroSocial) {
        super(nombre, apellido, NumeroSeguroSocial);
        this.sueldo = sueldo;
        this.horas = horas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
        
        
    
    @Override
    public double ingresos() {
        if(horas<=40.0)
            return horas * sueldo;
        else
            return 40 * sueldo + (horas-40)* (sueldo*1.5);
    }

    @Override
    public String toString() {
        return String.format( "empleado por horas: %s\n%s: $%,.2f; %s: %,.2f",super.toString(), "sueldo por hora", getSueldo(),"horas trabajadas", getHoras() );
    }
    
    
    
    
}
