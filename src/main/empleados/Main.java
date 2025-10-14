package src.main.empleados;

import src.main.empleados.exception.EmpleadoNoEncontradoException;
import src.main.empleados.model.Desarrollador;
import src.main.empleados.model.Empleado;
import src.main.empleados.model.Gerente;
import src.main.empleados.service.EmpleadoServiceImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        EmpleadoServiceImpl service = new EmpleadoServiceImpl();
        MenuEmpleado menu = new MenuEmpleado(service);
        menu.iniciar();


    }



}
