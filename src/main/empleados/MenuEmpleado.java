package src.main.empleados;

import src.main.empleados.exception.EmpleadoNoEncontradoException;
import src.main.empleados.model.Desarrollador;
import src.main.empleados.model.Empleado;
import src.main.empleados.model.Gerente;
import src.main.empleados.service.EmpleadoServiceImpl;

import java.util.Scanner;

public class MenuEmpleado {

    private final Scanner scanner = new Scanner(System.in);
    private final EmpleadoServiceImpl service;

    public MenuEmpleado(EmpleadoServiceImpl service) {
        this.service = service;
    }

    public void iniciar(){
        int opcion;
        do{
            mostrarMenu();
            System.out.println("Selecciona una opción: ");
            opcion = leerEntero();

            switch(opcion){
                case 1 -> agregarEmpleado();
                case 2 -> service.listarEmpleados();
                case 3 -> buscarEmpleado();
                case 4 -> eliminarEmpleado();
                case 5 -> System.out.println("Nómina total: $" + service.calcularNominaTotal());
                case 6 -> filtarEmplados();
                case 7 -> System.out.println("Saliendo del sistema ...");
                default -> System.out.println("Opción inválida. Intente nuevamente");
            }
            System.out.println();
        } while ( opcion != 7);
    }


    private static void mostrarMenu(){
        System.out.println("=================================");
        System.out.println("SISTEMA DE GESTIÓN DE EMPLEADOS");
        System.out.println("=================================");
        System.out.println("1. Agregar empleado");
        System.out.println("2. Listar empleados");
        System.out.println("3. Buscar empleado");
        System.out.println("4. Eliminar empleado");
        System.out.println("5. Calcular nómina total");
        System.out.println("6. Filtrar empleados");
        System.out.println("7. Salir");
        System.out.println("=================================");

    }

    private  void agregarEmpleado(){
        System.out.println("Seleccione tipo de empleado: ");
        System.out.println("1. Desarrollador");
        System.out.println("2. Gerente");
        System.out.println("Opción: ");
        int tipo = leerEntero();

        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Salario base: ");
        double salarioBase = leerDouble();

        switch (tipo){
            case 1 -> {
                System.out.println("Bono: ");
                double bono = leerDouble();
                service.agregarEmpleado(new Desarrollador(nombre,salarioBase,bono));
                System.out.println("Desarrollador agregado correctamente");
            }
            case 2 -> {
                System.out.println("Comisión: ");
                double comision = leerDouble();
                service.agregarEmpleado(new Gerente(nombre, salarioBase, comision));
                System.out.println("Gerente agregado correctamente");
            }
            default -> System.out.println("Tipo no válido");
        }
    }

    private  void buscarEmpleado(){
        System.out.println("Ingrese el nombre a buscar: ");
        String nombre = scanner.nextLine();

        try{
            Empleado e = service.buscarPorNombre(nombre);
            System.out.println("Empleado encontrado: " + e);
        }catch(EmpleadoNoEncontradoException ex){
            System.out.println("!!" + ex.getMessage());
        }

    }

    private  void eliminarEmpleado(){
        System.out.println("Ingrese el nombre a eliminar: ");
        String nombre = scanner.nextLine();

        boolean eliminado = service.eliminarPorNombre(nombre);
        if(eliminado){
            System.out.println("Empleado eliminado correctamente");
        }else{
            System.out.println("No se encontró el empleado con ese nombre");
        }
    }

    private  int leerEntero(){
        while(true){
            try{
                return Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException ex){
                System.out.println("Por favor, ingresa un número válido: ");
            }
        }
    }

    private  double leerDouble(){
        while(true){
            try{
                return Double.parseDouble(scanner.nextLine());
            }catch (NumberFormatException ex){
                System.out.println("Por favor, ingresa un número decimal válido: ");
            }
        }
    }

    private  void filtarEmplados(){
        System.out.println("Seleccione filtro");
        System.out.println("1. Salario mayor a 3000");
        System.out.println("2. Salario menor a 3000");
        System.out.println("3. Nombre que empieza con una letra");
        System.out.println("Opción: ");
        int filtroOpcion = leerEntero();

        System.out.println("Ingrese la primera letra del nombre: ");
        String nombre = scanner.nextLine();

        switch(filtroOpcion){
            case 1 -> service.filtrarEmpleados(e -> e.calcularSalario() > 3000);
            case 2 -> service.filtrarEmpleados(e -> e.calcularSalario() < 3000);
            case 3 -> service.filtrarEmpleados(e -> e.getNombre().startsWith(nombre));
            default -> System.out.println("Filtro inválido. Intente nuevamente");
        }
    }
}
