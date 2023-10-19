package Empleado;
public class EmpleadoBaseMasComision extends EmpleadoPorComision {
  private double salarioBase;

  public EmpleadoBaseMasComision(String primerNombre, String primerApellido, String NSS, double tarifaPorComision,
      double ventasBrutas, double salarioBase) {
    super(primerNombre, primerApellido, NSS, tarifaPorComision, ventasBrutas);
    this.salarioBase = salarioBase;
  }
  
  @Override
  public double obtenerSalario() {
    return salarioBase + (getTarifaPorComision() * getVentasBrutas());
  }

  @Override
  public String toString() {
    return "Empleado base mas comision: " + getPrimerNombre() + " " + getPrimerApellido() + "\nSalario: $" + obtenerSalario() + "\n";
  }
}
