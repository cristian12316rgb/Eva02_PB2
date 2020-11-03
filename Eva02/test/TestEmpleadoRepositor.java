import org.junit.Test;


public class TestEmpleadoRepositor {

    @Test
    public void testQueCompruebaElStockActual(){

        Producto productoUno= new Producto(200.0,"productoUno", 600.0);
        Producto productoDOs= new Producto(600.0, "productoDos", 1200.0);
        Producto productosTres= new Producto(90.0,"productoTres", 800.0);

        EmpleadoRepositor empr= new EmpleadoRepositor(10,"Raul",80000.0,20200101);
        empr.agregarProductoNuevo(productoUno);
        empr.agregarProductoNuevo(productoDOs);
        empr.agregarProductoNuevo(productosTres);

        assertEquals(3, empr.getStockActual());

    }
}
