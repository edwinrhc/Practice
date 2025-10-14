package src.main.empleados.service;

import src.main.empleados.exception.EmpleadoNoEncontradoException;
import src.main.empleados.model.Empleado;
import src.main.empleados.util.EmpleadoFiltro;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class EmpleadoServiceImpl implements EmpleadoService{

    private List<Empleado> empleados = new LinkedList<>();


    @Override
    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    @Override
    public void listarEmpleados() {
        empleados.forEach(System.out::println);
    }

    @Override
    public Empleado buscarPorNombre(String nombre) throws EmpleadoNoEncontradoException {
        Optional<Empleado> encontrado = empleados.stream()
                .filter(e -> e.getNombre().equals(nombre))
                .findFirst();
        return encontrado.orElseThrow(() -> new EmpleadoNoEncontradoException(nombre));
    }

    @Override
    public void filtrarEmpleados(EmpleadoFiltro filtro) {
        empleados.stream()
                .filter(filtro::filtrar)
                .forEach(System.out::println);
    }

    @Override
    public boolean eliminarPorNombre(String nombre) {
        return empleados.removeIf(e -> e.getNombre().equalsIgnoreCase(nombre));
    }

    @Override
    public double calcularNominaTotal() {
        return empleados.stream()
                .mapToDouble(Empleado:: calcularSalario)
                .sum();
    }
}
