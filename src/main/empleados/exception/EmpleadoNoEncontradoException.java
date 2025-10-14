package src.main.empleados.exception;

public class EmpleadoNoEncontradoException extends Exception{

    public EmpleadoNoEncontradoException(String nombre){
        super("Empleado no encontrado: " + nombre + "");
    }

}
