import java.util.ArrayList;

public class RecursosHumanos extends Empresa{

    ArrayList<Empleado> empleados=new ArrayList<Empleado>();

    public RecursosHumanos(String nombre) {
        super(nombre);
        this.empleados = empleados;
    }

    public void despedirEmpleado(Empleado empleadoADespedir){
            empleados.remove(empleadoADespedir);
    }
    public void contratarEmpleado(Empleado empladoAContratar){
            empleados.add(empladoAContratar);
    }

}
