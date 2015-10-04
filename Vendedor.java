import java.util.Scanner;
public class Vendedor{
				String nombre;
				Double ventasBrutas;
				Double ingresos;
				int  articulosVendidos; 
				//Metodo constructor
				public Vendedor(String n,int av){
							nombre=n;
							articulosVendidos=av;
							ventasBrutas=0.0;
							ingresos=0.0;
				}
				//Calcular Articulos Vendidos
				public void vender(){
					Scanner entrada = new Scanner(System.in);
					int $x=1;
					Double valor;
					for($x=1;$x<=articulosVendidos;$x++){
						 System.out.print("Ingrese el Valor de Articulo "+$x+":");
						 valor=entrada.nextDouble();
						 ventasBrutas=ventasBrutas+valor;
						 
					}
					calcular_ingresos();
				
				}
				private void calcular_ingresos(){
						ingresos=ventasBrutas * 0.09 + 200;	
				
				}
				public Double getIngresos(){

					  return ingresos;
				}
				public String getNombre(){

						return nombre;
				}				
				public Double getVentasBrutas(){
				
						return ventasBrutas;
				}

}
