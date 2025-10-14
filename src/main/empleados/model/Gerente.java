package src.main.empleados.model;

public class Gerente extends Empleado{

    private double comision;

    public Gerente(String nombre, double salarioBase, double comision) {
        super(nombre, salarioBase);
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + comision;
    }
}
