import java.util.ArrayList;

public class RecursosHumanos {

    ArrayList<Empleado> empleados=new ArrayList<Empleado>();

    public void despedirEmpleado(Empleado empleadoADespedir){
        for (Empleado x: empleados) {
            empleados.remove(empleadoADespedir);
        }
    }
    public void contratarEmpleado(Empleado empladoAContratar){
        for (Empleado x:empleados) {
            empleados.add(empladoAContratar);
        }
    }

}
