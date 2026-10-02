package modelo;

public class Producto {

    private String nombre;
    private int stock;

    public Producto(String nombre, int stock) {
        validarStock(stock);
        this.nombre = nombre;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

        
    public void setStock(int stock) {
        validarStock(stock);
        this.stock = stock;
    }

    private void validarStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException(
                "El stock no puede ser negativo"
            );
        }
    }
    
}