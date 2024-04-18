package Vehiculo;

public abstract class Turismo extends Vehiculo {
	
	Asientos asientos;
	
	Turismo (String marca, String modelo, String bastidor, int nPuertas, Asientos asientos)
	{
		super(marca, modelo, bastidor, nPuertas);
		
		this.asientos = asientos;
		
	}
	
	Asientos getTipoAsientos()
	{
		return this.asientos;
	}
	
	void setTipoAsientos(Asientos asientos)
	{
		this.asientos = asientos;
	}
	
	public String toString()
	{
		return super.toString() + "\nTipoAsientos: "+ this.getTipoAsientos();
	}
	
	abstract double calcularPrecioAlquiler(int dias);
	
	abstract int getMaxVelocidad();

}
