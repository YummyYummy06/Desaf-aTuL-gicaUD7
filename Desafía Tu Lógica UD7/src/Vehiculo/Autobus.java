package Vehiculo;

public class Autobus extends Vehiculo {
	
	
	int numero, numParadas;
	
	
	Autobus(String marca, String modelo, String bastidor, int nPuertas, int numero, int numParadas)
	{
		super(marca,modelo,bastidor,nPuertas);
		
		this.numero = numero;
		
		this.numParadas = numParadas;
	}
	
	int getNumero()
	{
		return numero;
	}
	
	int getNumParadas()
	{
		return numParadas;
	}
	
	void setNumero(int numero)
	{
		this.numero = numero;
	}
	
	void setNumParadas(int numParadas)
	{
		this.numParadas = numParadas;
	}
	
	public String toString()
	{
		return super.toString() + "\nNumero: "+ this.getNumero()+"\nNumeroParadas: "+ this.getNumParadas();
	}

}
