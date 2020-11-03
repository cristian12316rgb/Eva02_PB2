public class Producto {

    private Double precio;
    private String nombre;
    private Integer codigo;
    private Double peso;


    public Producto(Double precio, String nombre, Double peso){
        this.precio=precio;
        this.nombre=nombre;
        this.peso=peso;
        this.codigo++;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
