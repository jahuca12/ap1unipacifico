import java.util.Scanner;
public class VenderAPP{


			public static void main(String args[]){
							String nombre;
							int cant_art;
							Scanner entrada = new Scanner(System.in);
							System.out.print("Ingrese el Nombre del Vendedor:");
							nombre=entrada.nextLine();
							System.out.print("Ingrese el # De articulos vendidos:");
							cant_art=entrada.nextInt();
							
							Vendedor vendedor1 = new Vendedor(nombre,cant_art);
							
							vendedor1.vender();
							
							System.out.println("El Vendedor "+ vendedor1.getNombre() + " Tuvo Ingresos de "+ vendedor1.getIngresos());
							System.out.println("Total de Ventas Brutas es: "+vendedor1.getVentasBrutas());

			}

}
