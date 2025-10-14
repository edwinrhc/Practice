package src.main.empleados.util;

import src.main.empleados.model.Empleado;

@FunctionalInterface
public interface EmpleadoFiltro {
    boolean filtrar(Empleado e);
}
