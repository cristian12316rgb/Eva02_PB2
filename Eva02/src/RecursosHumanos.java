import java.util.ArrayList;

public class RecursosHumanos {

    ArrayList<Empleado> empleados=new ArrayList<Empleado>();

    public void despedirEmpleado(Empleado empleadoADespedir){
            empleados.remove(empleadoADespedir);
    }
    public void contratarEmpleado(Empleado empladoAContratar){
            empleados.add(empladoAContratar);
    }

}
