public class Futbolista extends SeleccionFutbol {
	private int dorsal;
	private String demarcacion;
	
	public Futbolista(){
		super(); //llamado al constructor de la clase Padre
		
	}
	public Futbolista(int id, String nombre,String apellidos, int edad, int dors, String demar){
		super(id,nombre,apellidos,edad); //llamado al segundo constructor de la clase Padre SeleccionFutbol
		dorsal=dors;
		demarcacion=demar;
	
	}
	public void jugarPartido(){
		
			System.out.println(" "+nombre+" "+apellidos+" Está Jugando el partido");
	
	}
	public void entrenar(){
			System.out.println(" "+nombre+" "+apellidos+" Está entrenando");
	
	}
	
	

}
