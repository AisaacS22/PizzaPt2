package Pizza;

import java.util.ArrayList;

public class Topping {
    private String nombre;
    private ArrayList<String> ingredientes = new ArrayList<>();

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    private double costo;  // Nuevo campo para el costo

        public Topping(String nombre, double costo) {
            this.nombre = nombre;
            this.costo = costo;
        }

    public void agregarIngrediente(String ingrediente){
        this.ingredientes.add(ingrediente);
    }

    public Topping(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "Topping: " + nombre + " Ingredientes: " + ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
