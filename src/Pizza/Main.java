package Pizza;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pizza pizza1 = new Pizza("Pizza Clásica", 40.00);
        Pizza pizza2 = new Pizza("Pizza Especial", 60.00);

// Agregar ingredientes a las pizzas
        pizza1.addTopping(new Topping("Salchicha", 0.5));
        pizza1.addTopping(new Topping("Doble ueso", 0.75));
        pizza1.addTopping(new Topping("Tomate Extra", 0.5));

        pizza2.addTopping(new Topping("Pepperoni", 1.0));
        pizza2.addTopping(new Topping("Champiñones", 1.25));
        pizza2.addTopping(new Topping("Chile", 0.8));

        // Mostrar catálogo de pizzas
        System.out.println("Catálogo de Pizzas:");
        System.out.println("1. " + pizza1.getName());
        System.out.println("2. " + pizza2.getName());

        // Solicitar al usuario que elija una pizza
        System.out.print("Seleccione el número de la pizza que desea: \n");
        int opcion = scanner.nextInt();

        Pizza pizzaElegida = null;

        if (opcion == 1) {
            pizzaElegida = pizza1;
        } else if (opcion == 2) {
            pizzaElegida = pizza2;
        } else {
            System.out.println("Opción inválida.");
            scanner.close();
            return;
        }

        System.out.println("Ingredientes disponibles para " + pizzaElegida.getName() + ":");
        for (int i = 0; i < pizzaElegida.getToppings().size(); i++) {
            Topping topping = pizzaElegida.getToppings().get(i);
            System.out.println(i + ". " + topping.getNombre());
        }

        System.out.println("Ingrese los números de los ingredientes que desea agregar (separados por espacios):");
        scanner.nextLine(); // Limpiar el buffer
        String[] indicesElegidos = scanner.nextLine().split(" ");

        ArrayList<Topping> ingredientesElegidos = new ArrayList<>();
        for (String indice : indicesElegidos) {
            int index = Integer.parseInt(indice);
            if (index >= 0 && index < pizzaElegida.getToppings().size()) {
                Topping toppingElegido = pizzaElegida.getToppings().get(index);
                ingredientesElegidos.add(toppingElegido);
            }
        }

// Llamar al método prepare para mostrar la preparación
        System.out.println("Preparando la pizza...");
        pizzaElegida.prepare();

        double costoTotal = pizzaElegida.calcularCostoTotal();
        System.out.println("Costo total: Q" + costoTotal);
        scanner.close();
    }
}
