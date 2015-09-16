import java.util.Scanner;

public class ProblemaNumeros{


			public static void main(String args[]){
			double a,b,c;
				Scanner entrada = new Scanner(System.in);
				System.out.print("Ingrese el primer numero: ");
				a=entrada.nextDouble();	
				System.out.print("Ingrese el segundo numero: ");
				b=entrada.nextDouble();	
				System.out.print("Ingrese el tercer numero: ");
				c=entrada.nextDouble();	
				Numero num = new Numero(a,b,c);
				System.out.println("La Suma de los Tres Numeros ingresados es:");
				System.out.println(""+num.sumar());
				System.out.println("El promedio de los Tres Numeros ingresados es:");
				System.out.println(""+num.promediar());
				num.calcularMayor();
				num.calcularMenor();
				
				
				
			
			
			}



}
