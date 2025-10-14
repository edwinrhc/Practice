package src.main.empleados.model;

public class Desarrollador extends Empleado{
    private double bono;

    public Desarrollador(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bono;
    }
}
