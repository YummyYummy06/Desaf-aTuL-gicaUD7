package Vehiculo;

public class Vehiculo {

	String marca, modelo, bastidor;
	int nPuertas;
	int cantidadVehiculosFuncionando = 0;

	Vehiculo(String marca, String modelo, String bastidor, int nPuertas) {
		this.marca = marca;
		this.modelo = modelo;
		this.bastidor = bastidor;
		this.nPuertas = nPuertas;
		
		cantidadVehiculosFuncionando = cantidadVehiculosFuncionando + 1;
	}

	String getMarca() {
		return marca;
	}

	String getModelo() {
		return modelo;
	}

	String getBastidor() {
		return bastidor;
	}

	int getNumeroPuertas() {
		return nPuertas;
	}

	int getCantidadVehiculosFuncionando() {
		return cantidadVehiculosFuncionando;
	}

	void setMarca(String marca) {
		this.marca = marca;
	}

	void setModelo(String modelo) {
		this.modelo = modelo;
	}

	void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}

	void setNumeroPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}

	void setCatidadVehiculosFuncionando(int cantidadVehiculosFuncionando) {
		this.cantidadVehiculosFuncionando = cantidadVehiculosFuncionando;
	}

	public String toString() {
		
		return "\n------------\n" + "Marca: " + this.getMarca() + "\nModelo: " + this.getModelo() + "\nNum bastidor: " + this.getBastidor()
				+ "\nNum Puertas: " + this.getNumeroPuertas();
	}
	
	

}
