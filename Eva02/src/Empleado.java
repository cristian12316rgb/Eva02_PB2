public class Empleado{

    private Integer nroEmpleado;
    private String nombre;
    private Double sueldo;
    private Integer horasDeTrabajo; //PROPONGO BORRARLO
    private Integer fechaDeIngreso; //PROPONGO BORRARLO

    /*
    la fecha de ingreso para no complicarnos yo digo de expresarla asi: aaaammdd
    ej: 20200101
     */
    public Empleado (Integer nroDeEmpleado, String nombre, Double sueldo, Integer fechaDeIngreso){
        this.nroEmpleado=nroDeEmpleado;
        this.nombre=nombre;
        this.sueldo=sueldo;
        this.fechaDeIngreso=fechaDeIngreso;
    }

    public Integer getNroEmpleado() {
        return nroEmpleado;
    }

    public void setNroEmpleado(Integer nroEmpleado) {
        this.nroEmpleado = nroEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public Integer getHorasDeTrabajo() {
        return horasDeTrabajo;
    }

    public void setHorasDeTrabajo(Integer horasDeTrabajo) {
        this.horasDeTrabajo = horasDeTrabajo;
    }

    public Integer getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(Integer fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }
}
