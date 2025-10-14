package src.main.empleados.service;

import src.main.empleados.exception.EmpleadoNoEncontradoException;
import src.main.empleados.model.Empleado;
import src.main.empleados.util.EmpleadoFiltro;

public interface EmpleadoService {

    void agregarEmpleado(Empleado e);
    void listarEmpleados();
    Empleado buscarPorNombre(String nombre) throws EmpleadoNoEncontradoException;

    void filtrarEmpleados(EmpleadoFiltro filtro);

    // Opcionales pero útiles
    boolean eliminarPorNombre(String nombre);
    double calcularNominaTotal();

}
