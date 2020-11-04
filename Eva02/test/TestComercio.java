import static org.junit.Assert.*;

import org.junit.Test;

public class TestComercio {

	@Test
	public void testQueMePermiteAgregarYEliminarProductos() {
		EmpleadoRepositor empleado = new EmpleadoRepositor(1,"pepe",20.0,20);
		
		
		Producto producto1 = new Producto (200.0,"bateria",1500.0);
		Producto producto2 = new Producto (150.0,"lampara",600.0);
		Producto producto3 = new Producto (80.0,"cosa",1100.0);
		Producto producto4 = new Producto (5.0,"maouse",200.0);
		Producto producto5 = new Producto (250.0,"bateria",2000.0);
		
		empleado.agregarProductoNuevo(producto1);
		empleado.agregarProductoNuevo(producto2);
		empleado.agregarProductoNuevo(producto3);
		empleado.agregarProductoNuevo(producto4);
		empleado.agregarProductoNuevo(producto5);

		
		assertTrue(empleado.eliminarUnProductoDeLaLista(producto3));
		
		Integer ve = 4; //ahora deberia tener 4 elementos porque borre el 3
		
		assertEquals(empleado.getStockActual(),ve);
		
		
		

		
		
	}
	@Test
	public void testQueMeDevuelvaLaCantidadCorrectaDeProductos(){

		Producto producto1 = new Producto (200.0,"bateria",1500.0);
		Producto producto2 = new Producto (150.0,"lampara",600.0);
		Producto producto3 = new Producto (80.0,"cosa",1100.0);
		Producto producto4 = new Producto (5.0,"maouse",200.0);
		Producto producto5 = new Producto (250.0,"bateria",2000.0);



	}

}
