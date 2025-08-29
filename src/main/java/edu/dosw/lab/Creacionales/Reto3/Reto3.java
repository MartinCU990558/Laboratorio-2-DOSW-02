package edu.dosw.lab.Creacionales.Reto3;

import java.util.*;


public class Reto3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Vehiculo> carrito = new ArrayList<>();

		System.out.println("¡Bienvenido al Reino de los Vehículos!");
		boolean continuar = true;

		while (continuar) {
			Tipo tipo = leerTipo(sc);
			Categoria categoria = leerCategoria(sc);
			String modelo = leerModelo(sc, tipo);

			FabricaVehiculos fabrica = switch (tipo) {
				case TIERRA -> new FabricaTierra();
				case ACUATICO -> new FabricaAcuatico();
				case AEREO -> new FabricaAereo();
			};

			Vehiculo v = fabrica.crear(modelo, categoria);
			carrito.add(v);

			System.out.print("¿Desea agregar otro vehículo? (si/no): ");
			continuar = sc.nextLine().trim().equalsIgnoreCase("si");
		}

		System.out.println("\n--- RESUMEN DE COMPRA ---\n");
		for (int i = 0; i < carrito.size(); i++) {
			Vehiculo v = carrito.get(i);
			System.out.println("Vehículo " + (i + 1) + ":");
			System.out.println("Tipo: " + v.getTipo());
			System.out.println("Categoría: " + v.getCategoria());
			System.out.println("Modelo: " + v.getModelo());
			System.out.println("Velocidad máxima: " + v.getVelocidadMaxKmH() + " km/h");
			System.out.println("Precio: " + pesos(v.getPrecioCop()));
			System.out.println("Equipamiento: " + v.getEquipamiento());
			System.out.println();
		}

		int subtotal = carrito.stream().mapToInt(Vehiculo::getPrecioCop).sum();
		int descuento = 0;
		int total = subtotal - descuento;

		System.out.println("Subtotal: " + pesos(subtotal));
		System.out.println("Descuento aplicado: " + pesos(descuento));
		System.out.println("Total a pagar: " + pesos(total));
		System.out.println("\n¡Gracias por su compra en el Reino de los Vehículos!");
	}

	private static Tipo leerTipo(Scanner sc) {
		System.out.println("Seleccione el tipo de vehículo:");
		System.out.println("1. Tierra");
		System.out.println("2. Acuático");
		System.out.println("3. Aéreo");
		System.out.print("Ingrese opción: ");
		String op = sc.nextLine().trim();
		return switch (op) {
			case "1" -> Tipo.TIERRA;
			case "2" -> Tipo.ACUATICO;
			case "3" -> Tipo.AEREO;
			default -> Tipo.TIERRA;
		};
	}

	private static Categoria leerCategoria(Scanner sc) {
		System.out.println("\nSeleccione la categoría del vehículo:");
		System.out.println("1. Económico\n2. Lujo\n3. Usado");
		System.out.print("Ingrese opción: ");
		String op = sc.nextLine().trim();
		return switch (op) {
			case "1" -> Categoria.ECONOMICO;
			case "2" -> Categoria.LUJO;
			case "3" -> Categoria.USADO;
			default -> Categoria.ECONOMICO;
		};
	}

	private static String leerModelo(Scanner sc, Tipo tipo) {
		System.out.println("\nSeleccione el modelo de vehículo:");
		switch (tipo) {
			case TIERRA -> {
				System.out.println("1. Auto\n2. Bicicleta\n3. Moto");
				System.out.print("Ingrese opción: ");
				return switch (sc.nextLine().trim()) {
					case "1" -> "Auto";
					case "2" -> "Bicicleta";
					case "3" -> "Moto";
					default -> "Auto";
				};
			}
			case ACUATICO -> {
				System.out.println("1. Lancha\n2. Velero\n3. Jet Ski");
				System.out.print("Ingrese opción: ");
				return switch (sc.nextLine().trim()) {
					case "1" -> "Lancha";
					case "2" -> "Velero";
					case "3" -> "Jet Ski";
					default -> "Lancha";
				};
			}
			case AEREO -> {
				System.out.println("1. Avión\n2. Avioneta\n3. Helicóptero");
				System.out.print("Ingrese opción: ");
				return switch (sc.nextLine().trim()) {
					case "1" -> "Avión";
					case "2" -> "Avioneta";
					case "3" -> "Helicóptero";
					default -> "Avioneta";
				};
			}
			default -> {
				return "Auto";
			}
		}
	}

	private static String pesos(int valor) {
		String s = Integer.toString(valor);
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
			count++;
			if (count == 3 && i != 0) {
				sb.append('.');
				count = 0;
			}
		}
		return "$" + sb.reverse();
	}
}
