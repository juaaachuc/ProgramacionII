package Empleado;
public class EmpleadoAsalariado extends Empleado {
  private double salarioSemanal;

  public EmpleadoAsalariado(String primerNombre, String primerApellido, String NSS, double salarioSemanal) {
    super(primerNombre, primerApellido, NSS);
    this.salarioSemanal = salarioSemanal;
  }

  public void setSalarioSemanal(double salarioSemanal) {
    this.salarioSemanal = salarioSemanal;
  }

  public double obtenerSalario() {
    return salarioSemanal;
  }

  @Override
  public String toString() {
    return "Empleado asalariado: " + getPrimerNombre() + " " + getPrimerApellido() + "\nSalario: $" + obtenerSalario() + "\n";
  }
}
