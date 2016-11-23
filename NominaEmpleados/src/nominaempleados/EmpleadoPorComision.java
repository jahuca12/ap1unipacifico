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
public class EmpleadoPorComision extends Empleado{
    private double ventasBrutas=0.0;
    private double tarifaComision=0.0;

    public EmpleadoPorComision(double ventasBrutas, double tarifaComision, String nombre, String apellido, String NumeroSeguroSocial) {
        super(nombre, apellido, NumeroSeguroSocial);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = tarifaComision;
    }
    
    @Override
    public double ingresos() {
        return tarifaComision * ventasBrutas;
    }

    @Override
    public String toString() {
        return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f","empleado por comision", super.toString(), "ventas brutas", getVentasBrutas(),"tarifa de comision", getTarifaComision() );
    }

    @Override
    public double obtenerMontoPago() {
        return ingresos();
    }
    
    
    
    
}
