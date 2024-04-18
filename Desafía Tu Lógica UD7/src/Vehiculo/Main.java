package Vehiculo;

public class Main {

	public static void main(String[] args) {

		Asientos cuero = Asientos.CUERO;

		Asientos reclinables = Asientos.RECLINABLES;

		Asientos calefaccion = Asientos.CALEFACCIÓN;

		Taxi taxi1 = new Taxi("Toyota", "Prius", "123454321", 5, cuero, 0.18, 100);

		Taxi taxi2 = new Taxi("Audi", "Q2", "908989", 5, calefaccion, 0.28, 100);

		Particular particular1 = new Particular("Audi", "R8", "5678987654", 2, reclinables, 5000, "Miguel Angel", true);

		Particular particular2 = new Particular("Ford", "Mustang", "250567", 2, calefaccion, 25000, "Miguel Angel",
				true);

		Autobus autobus = new Autobus("Mercedes", "Vito", "777777", 1, 27, 20);

		System.out.println(taxi1.toString() +

				taxi2.toString() +

				particular1.toString() +

				particular2.toString() +

				autobus.toString());

		System.out.println("Total de vehículos funcionando: " + taxi1.getCantidadVehiculosFuncionando());

		taxi1.setKmRecorridos(25000);

		taxi1.calcularCosteTrayecto();

		System.out.println(taxi1.toString());

		particular1.setKmRecorridos(10000);

		particular2.setPropietario("Ramon");

		System.out.println(particular1.toString() +

		particular2.toString());

	}

}
