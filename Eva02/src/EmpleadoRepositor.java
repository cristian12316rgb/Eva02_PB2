import java.util.ArrayList;

public class EmpleadoRepositor extends Empleado {

    private Integer stockActual;
    ArrayList<Producto> productoArrayList= new ArrayList<Producto>();
    private Producto producto;

    public EmpleadoRepositor(Integer nroDeEmpleado, String nombre, Double sueldo, Integer fechaDeIngreso) {
        super(nroDeEmpleado, nombre, sueldo, fechaDeIngreso);
    }

    /*Hay que revisar todos los metodos*/

    public Integer getStockActual(){
        for (Producto x:productoArrayList) {
            return productoArrayList.size();
        }
        return productoArrayList.size();
    }
    public void agregarProductoNuevo(Producto producto){
        for (Producto x:productoArrayList) {
            productoArrayList.add(producto);
        }
    }
    public void modificarUnProductoDeLaLista(Producto productoACambiar,Producto productoAAgregar){
        for (Producto x:productoArrayList) {
            productoArrayList.remove(productoACambiar);
            productoArrayList.add(productoAAgregar);
        }
    }
    /*Está mal*/
    public Producto obtenerProductosLivianos(){
        for (Producto x:productoArrayList) {
            if(producto.getPeso()<1000){
                return producto;
            }
        }
        return producto;
    }



}
