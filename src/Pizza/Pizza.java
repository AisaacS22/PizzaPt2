package Pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private double price;
    private List<Topping> toppings = new ArrayList<>();

    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public void removeTopping(int index) {
        this.toppings.remove(index);
    }

    @Override
    public String toString(){
        return "Pizza: " + name + " Costo: " + price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void prepare() {
        System.out.println("Preparando pizza..." + name);
        System.out.println("Agregando ingredientes...");
        for (Topping topping : toppings) {
            System.out.println("-" + topping.getNombre());
            //delay 1 second
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
                System.out.printf(ex.getMessage());
            }
        }
        System.out.println("TSSSSSSS...");
        System.out.println("¡TIIIN!");
        System.out.println("¡Su Pizza esta lista!");
    }
    public double calcularCostoTotal() {
        double costoTotal = price;
        for (Topping topping : toppings) {
            costoTotal += topping.getCosto();
        }
        return costoTotal;
    }


}

