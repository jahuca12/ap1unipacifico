public class Masajista extends SeleccionFutbol {
			private String titulo;
			private int aniosExperiencia;
	
			public Masajista(){
				super(); //llamado al constructor de la clase Padre
				
			}
			public Masajista(int id, String nombre,String apellidos,int edad,  String titulo, int aniosExperiencia){
				super(id,nombre,apellidos,edad); //llamado al segundo constructor de la clase Padre SeleccionFutbol
				this.titulo=titulo;
				this.aniosExperiencia=aniosExperiencia;
			
			}
			
			public void darMasaje(Futbolista jugador){
			
			System.out.println(" "+nombre+" "+apellidos+" Esta dando un masaje a "+ jugador.getNombre()+" "+jugador.getApellidos()); 
			
			}
	
	
	}
