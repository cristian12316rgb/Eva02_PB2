import java.util.ArrayList;

public class EmpleadoRepositor extends Empleado {


	ArrayList<Producto> productoArrayList = new ArrayList<Producto>();


	public EmpleadoRepositor(Integer nroDeEmpleado, String nombre, Double sueldo, Integer fechaDeIngreso) {
		super(nroDeEmpleado, nombre, sueldo, fechaDeIngreso);

	}

	public Integer getStockActual() { // este metodo devuelve un Integer con el tamaño del arrayList.
		return productoArrayList.size();

	}

	public void agregarProductoNuevo(Producto producto) {
		productoArrayList.add(producto);

	}

	public boolean modificarUnProductoDeLaLista(Producto productoACambiar, Producto productoAAgregar) {
		for (int i = 0; i < productoArrayList.size(); i++) { // recorre la lista
			if (productoArrayList.get(i).equals(productoACambiar)) { // si encuentra ese producto con el mismo codigo
				productoArrayList.set(i, productoAAgregar); // cambia el producto de esa posicion por el nuevo.
				return true;
			}
		}
		return false;

	}

	// agrego el metodo eliminar producto.

	public boolean eliminarUnProductoDeLaLista(Producto productoAEliminar) {
		for (int i = 0 ; i < productoArrayList.size() ; i++) {
			if (productoArrayList.get(i).equals(productoAEliminar)) {
				productoArrayList.remove(i);
				return true;
			}
		}
		return false;
	}

	public ArrayList<Producto> obtenerProductosLivianos() { // devuelve una lista de productos livianos.

		ArrayList<Producto> productosLivianos = new ArrayList<Producto>(); // creo la nueva lista
		for (Producto producto : productoArrayList) {
			if (producto.getPeso() < 1000) { // si el producto pesa menos de 1000grs.
				productosLivianos.add(producto);

			}
		}

		return productosLivianos;
	}

}
