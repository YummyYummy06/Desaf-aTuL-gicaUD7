package Vehiculo;

public class Particular extends Turismo{
	
	int maxVelocidad = 220;
	
	int precioPorDia = 30;
	
	String propietario = "Nadie";
	
	boolean conAC;
	
	int kmRecorridos;
	
	Particular(String marca, String modelo, String bastidor, int nPuertas, Asientos asientos,int kmRecorridos, String propietario, boolean conAC)
	{
		super(marca, modelo, bastidor, nPuertas,asientos);
		
		this.kmRecorridos = kmRecorridos;
		
		this.propietario = propietario;
		
		this.conAC = conAC;
		
	}
	double calcularPrecioAlquiler(int dias)
	{
		return dias* precioPorDia;
	}
	
	int  getMaxVelocidad()
	{
		return maxVelocidad;
	}
	
	void reiniciarContador(double km)
	{
		System.out.println("El contador del particular actualmente es de: " + km + "Km, vamos a resetearlo a cero");
		
		km = 0;
	}
	
	void setPropietario(String propietario)
	{
		this.propietario = propietario;
	}
	
	void setAC(boolean AC)
	{
		this.conAC = AC;
	}
	
	void setKmRecorridos(int kmRecorridos)
	{
		this.kmRecorridos = kmRecorridos;
	}
	
	String getPropietario()
	{
		return this.propietario;
	}
	
	boolean getConAC()
	{
		return this.conAC;
	}
	
	int getKmRecorridos()
	{
		return this.kmRecorridos;
	}
	
	public String toString()
	{
		return super.toString() + "\nKm recorridos: " + this.kmRecorridos + "\nPropietario: " + this.propietario + "\nAire acondicionado: " + this.conAC;
	}

}
