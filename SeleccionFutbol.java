public class SeleccionFutbol{
		protected int id;
		protected String nombre;
		protected String apellidos;
		protected int edad;
		
		public SeleccionFutbol(){
		
		}
		
		public SeleccionFutbol(int id, String nombre, String apellidos, int edad){
					this.id=id;
					this.nombre=nombre;
					this.apellidos=apellidos;
					this.edad=edad;
		}
		
		public void viajar(){
			System.out.println(""+nombre +" "+apellidos +" Está viajando");
		}

		public void concentrarse(){
			System.out.println(""+nombre +" "+apellidos +" Está concentrado para el partido");
		}
		public String getNombre(){
					return nombre;
		}
		public String getApellidos(){
		
				return apellidos;
		}
}
