package Vehiculo;

public class Taxi extends Turismo {
	
	double importeKm;
	
	double importeInicio = 2;
	
	double kmRecorridos;
	
	int precioPorDia = 50;
	
	int maxVelocidad = 200;
	
	Taxi(String marca, String modelo, String bastidor, int nPuertas, Asientos asientos, double importeKM, double kmRecorridos)
	{
		super(marca, modelo, bastidor, nPuertas,asientos);
		
		this.importeKm =importeKM;
		
		this.kmRecorridos = kmRecorridos;
		
	}
	double calcularPrecioAlquiler(int dias)
	{
		return dias* precioPorDia;
	}
	
	int  getMaxVelocidad()
	{
		return maxVelocidad;
	}
	
	double calcularCosteTrayecto()
	{
		return importeInicio + (kmRecorridos * importeKm);
	}
	
	void reiniciarContador(double km)
	{
		System.out.println("El contador del taxi actualmente es de: " + km + "Km, vamos a resetearlo a cero");
		
		km = 0;
	}
	
	double getKmRecorridos()
	{
		return kmRecorridos;
	}
	
	double getImporteKm()
	{
		return importeKm;
	}
	
	void setKmRecorridos(double kmRecorridos)
	{
		this.kmRecorridos = kmRecorridos;
	}
	
	void setImporteKm(double importeKm)
	{
		this.importeKm = importeKm;
	}
	
	void setImporteInicio(double importeInicio)
	{
		this.importeInicio = importeInicio;
	}
	
	double getImporteInicio()
	{
		return importeInicio;
	}
	
	public String toString()
	{
		return super.toString() + "\nImporte Inicial: " + this.importeInicio + "\nImporte X Km: " + importeKm + "\nKm recorridos: " + this.kmRecorridos
+ "\nVelocidad máxima: " + this.maxVelocidad + "\nPrecio X dia: " + this.precioPorDia + "\nCoste del trayecto: " + this.calcularCosteTrayecto();	}

}
