package modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductoTest {

	
	  @Test
	    void debeRechazarStockNegativo() {
	        Producto producto = new Producto("Teclado", 10);
	        assertThrows(IllegalArgumentException.class, () -> {
	            producto.setStock(-5);
	        });
	    }
	  @Test 
	    void constructorDebeRechazarStockNegativo() {
			assertThrows(IllegalArgumentException.class, () -> {
				new Producto("Teclado", -5);
			});
		}
	  @Test
        void debeModificarStockPositivo() { 
            Producto producto=new Producto("Teclado", 10);
           producto.setStock(15);
		   assertEquals(15, producto.getStock());
    }


} 
	

