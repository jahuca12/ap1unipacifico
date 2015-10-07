import java.util.ArrayList;
public class MiSeleccion {
        //Creamos el arreglo para ingresar los Objetos tipo SeleccionFutbol
		public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

		public static void main(String args[]){
					
					//Creamos nuestros objetos de acuerdo a las clases hijas de SeleccionFutbol
					Entrenador delBosque= new Entrenador(1,"Vicente","Del Bosque",60,"z28d45");
					Masajista raulSanchez= new Masajista(2,"Raul","Sanches",41,"Licenciado en Fisioterapia",18);
					Futbolista iniesta = new Futbolista(3,"Andres","Iniesta",29,8,"Volante de Creacion");
					
					//Agregamos los objetos al arreglo integrantes
					integrantes.add(delBosque);
					integrantes.add(iniesta);
					integrantes.add(raulSanchez);
					
					//Ejecucion del Metodo concentrarse de la clase padre SeleccionFutbol
					// de manera dinamica usando un for para navegar por el arreglo
					System.out.println("Todos los Integrantes de la Seleccion de Futbol Entran a Concentracion");
					for(SeleccionFutbol integrante : integrantes){
						integrante.concentrarse();
					}
					System.out.println("\n\n");
					//Ejecucion del metodo viajar de la clase padre SeleccionFutbol
					System.out.println("Todos los Integrantes de la Seleccion de Futbol estan viajando");
					for(SeleccionFutbol integrante : integrantes){
						integrante.viajar();
					}
					//Llamados Independiente de los Objetos
					System.out.println("\n\n");
					
					iniesta.entrenar();
					System.out.println("\n");
					delBosque.dirigirEntrenamiento();
					System.out.println("\n");
					raulSanchez.darMasaje(iniesta);
					System.out.println("\n");
					delBosque.dirigirPartido();
					System.out.println("\n");
					iniesta.jugarPartido();
					System.out.println("\n");
					
					

		}

		
}
