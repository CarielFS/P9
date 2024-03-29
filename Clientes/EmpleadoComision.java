public class EmpleadoComision extends Empleado{
	private int ventasTotales;
	private float tasaComision;

	public EmpleadoComision(String nombre, String apellido, String numSeguridad, int ventasTotales, float tasaComision){
		super(nombre, apellido, numSeguridad);
		this.ventasTotales = ventasTotales;
		this.tasaComision = tasaComision;
	}

	public abstract float ingresos(){
		double salarioSemanal = super.getSalarioSemanal();
		return (salarioSemanal + ventasTotales*tasaComision);
	}

	@Override
	public String toString(){
		return "Empleado por comisión [" + getNombre() + " " + getApellido() + ". SegSocial: " + getNumSeguridad() + ". Sueldo: " + getIngresos() + "]";
	}
}
