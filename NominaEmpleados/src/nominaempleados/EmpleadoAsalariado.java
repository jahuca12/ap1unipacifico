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
public class EmpleadoAsalariado extends Empleado {

        private double salarioSemanal=0.0;

    public EmpleadoAsalariado(double salarioSemanal, String nombre, String apellido, String NumeroSeguroSocial) {
        super(nombre, apellido, NumeroSeguroSocial);
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }
        
        
    @Override
    public double ingresos() {
        return salarioSemanal;
     
    }
    
        @Override
    public double obtenerMontoPago(){
        return salarioSemanal;
    }
    
}
