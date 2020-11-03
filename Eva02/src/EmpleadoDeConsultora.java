public class EmpleadoDeConsultora extends Empleado {

    private Integer cuit;
    private Double porcentajePorHoraDeTrabajo;

    /*
    El constructor se armó solo
     */
    public EmpleadoDeConsultora(Integer nroDeEmpleado, String nombre, Double sueldo, Integer fechaDeIngreso, Integer cuit, Double porcentajePorHoraDeTrabajo) {
        super(nroDeEmpleado, nombre, (sueldo=(sueldo*porcentajePorHoraDeTrabajo)/100), fechaDeIngreso);
        this.cuit = cuit;
        this.porcentajePorHoraDeTrabajo = porcentajePorHoraDeTrabajo;
    }

    public Integer getCuit() {
        return cuit;
    }

    public void setCuit(Integer cuit) {
        this.cuit = cuit;
    }

    public Double getPorcentajePorHoraDeTrabajo() {
        return porcentajePorHoraDeTrabajo;
    }

    public void setPorcentajePorHoraDeTrabajo(Double porcentajePorHoraDeTrabajo) {
        this.porcentajePorHoraDeTrabajo = porcentajePorHoraDeTrabajo;
    }
}
