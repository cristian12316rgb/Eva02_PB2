import java.util.ArrayList;

public class RecursosHumanos extends Empresa{

    ArrayList<Empleado> empleados=new ArrayList<Empleado>();
    private Empleado empleadoACargo;

    /*
    al pedir en el constructor el empleado a cargo obliga a que solo se pueda despedir a alguien si hay alguien
    responsable.
     */
    public RecursosHumanos(String nombreDeLaEmpresa, Empleado empleadoAcargo) {
        super(nombreDeLaEmpresa);
        this.empleados = empleados;
        this.empleadoACargo=empleadoAcargo;
    }

    public void despedirEmpleado(Empleado empleadoADespedir){
            empleados.remove(empleadoADespedir);
    }
    public void contratarEmpleado(Empleado empladoAContratar){
            empleados.add(empladoAContratar);
    }

}
