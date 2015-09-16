public class Numero {
					 private double n1;
					 private double n2;
					 private double n3;
					 
					 public Numero(double a,double b, double c){
					    n1=a;
						n2=b;
						n3=c;
					 }
					public double sumar(){
							double suma;
							suma=n1+n2+n3;
							
							return suma;
					}
					public double promediar(){
						   double promedio;
						   promedio=(n1+n2+n3)/3;
						   
						   return promedio;
					}
					
					public void calcularMayor(){
					
							if(n1>n2 && n1>n3)
								System.out.println("El Numero mayor es "+n1);
							else
								if(n2>n1 && n2>n3)
								System.out.println("El Numero mayor es "+n2);
							else
								System.out.println("El Numero mayor es "+n3);
							
					}
					public void calcularMenor(){

								if(n1<n2 && n1<n3)
								System.out.printf("El Numero menor es "+n1);
							else
								if(n2<n1 && n2<n3)
								System.out.printf("El Numero menor es "+n2);
							else
								System.out.printf("El Numero menor es "+n3);
					}					
						


}
