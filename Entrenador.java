public class Entrenador extends SeleccionFutbol {
	private String idfederacion;
	
	public Entrenador(){
		super(); //llamado al constructor de la clase Padre
		
	}
	public Entrenador(int id, String nombre,String apellidos,int edad,  String idfederacion){
		super(id,nombre,apellidos,edad); //llamado al segundo constructor de la clase Padre SeleccionFutbol
		this.idfederacion=idfederacion;
	
	}
	public void dirigirPartido(){
		
			System.out.println(" "+nombre+" "+apellidos+" Está Dirigiendo el partido");
	
	}
	public void dirigirEntrenamiento(){
			System.out.println(" "+nombre+" "+apellidos+" Está dirigiendo el Entrenamiento");
	
	}

}
