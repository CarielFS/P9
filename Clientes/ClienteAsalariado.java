public class EmpleadoAsalariado extends Empleado{
	//private fields
	private float salarioSemanal;

	//constructor method
	public EmpleadoAsalariado(String nombre, String apellido, String numSeguridad, float salarioSemanal){
		super.Empleado(String nombre, String apellido, String numSeguridad);
		this.salarioSemanal = salarioSemanal;
	}

	//Accessor for nombre
	public String getNombre(){
		return nombre;
	}

	//Setter for nombre
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	//Accessor for apellido
	public String getApellido(){
		return nombre;
	}

	//Setter for apellido
	public void setApellido(String apellido){
		this.apellido = apellido;
	}

	//Accessor for numSeguridad
	public String getNumSeguridad(){
		return nombre;
	}

	//Setter for numSeguridad
	public void setNumSeguridad(String numSeguridad){
		this.numSeguridad = numSeguridad;
	}

	//Accessor for salarioSemanal
	public String getSalarioSemanal(){
		return salarioSemanal;
	}

	//Setter for salarioSemanal
	public void setSalarioSemanal(String nombre){
		this.salarioSemanal = salarioSemanal;
	}

	//Accessor for ingresos
	public abstract float ingresos(float salarioSemanal){
		this.salarioSemanal = salarioSemanal;
		return salarioSemanal;

	}

}
