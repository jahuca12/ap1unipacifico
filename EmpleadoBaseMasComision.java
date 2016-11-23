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
public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase=0.0; 

    public EmpleadoBaseMasComision(double salarioBase, double ventasBrutas, double tarifaComision, String nombre, String apellido, String NumeroSeguroSocial) {
        super(ventasBrutas, tarifaComision, nombre, apellido, NumeroSeguroSocial);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double ingresos() {
        return getSalarioBase()+ super.ingresos(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
     return String.format( "%s %s; %s: $%,.2f","con salario base", super.toString(),"salario base", getSalarioBase() );
    }
    
    
    
}
