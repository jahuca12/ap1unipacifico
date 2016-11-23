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
public class NominaEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       EmpleadoAsalariado emp1 = new EmpleadoAsalariado(200.0,"Juan","Valdes","JV20001");
       EmpleadoPorHoras  emp2 = new EmpleadoPorHoras(45,10.0,"Ambrosio","Correa","AC30123");
       EmpleadoPorComision emp3 = new EmpleadoPorComision(5000.0,0.15,"Inocencio","Cortes","IC980123");
       EmpleadoBaseMasComision emp4 = new EmpleadoBaseMasComision(150.0,3000,0.15,"Donald","Trump","DT78123");
    /*
       System.out.println( "Empleados procesados por separado:\n" );
       
       System.out.printf( "%s\n%s: $%,.2f\n\n", emp1, "ingresos", emp1.ingresos() );
       System.out.printf( "%s\n%s: $%,.2f\n\n", emp2, "ingresos", emp2.ingresos() );
       System.out.printf( "%s\n%s: $%,.2f\n\n", emp3, "ingresos", emp3.ingresos() );
       System.out.printf( "%s\n%s: $%,.2f\n\n", emp4, "ingresos", emp4.ingresos() );
    */
       Empleado empleados[] = new Empleado[ 4 ];
       empleados[0]= emp1;
       empleados[1]= emp2;
       empleados[2]= emp3;
       empleados[3]= emp4;
       System.out.println( "Empleados procesados de forma polimorfica:\n" );
       
       for(Empleado EmpleadoActual: empleados){
           System.out.println( EmpleadoActual );
           if ( EmpleadoActual instanceof EmpleadoBaseMasComision ){
               double salAnterior = 0.0;
               EmpleadoBaseMasComision Empleado = (EmpleadoBaseMasComision) EmpleadoActual;
               salAnterior= Empleado.getSalarioBase();
               Empleado.setSalarioBase(salAnterior*1.10);
           }
               
           System.out.println("Ingresos : "+EmpleadoActual.ingresos());
           System.out.println();
           
       
       }
       
       
    }
    
}
