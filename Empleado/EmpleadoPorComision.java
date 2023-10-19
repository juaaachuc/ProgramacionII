package Empleado;
public class EmpleadoPorComision extends Empleado {
  private double tarifaPorComision, ventasBrutas;
  
  public EmpleadoPorComision(String primerNombre, String primerApellido, String NSS, double tarifaPorComision, double ventasBrutas) {
    super(primerNombre, primerApellido, NSS);
    this.tarifaPorComision = tarifaPorComision;
    this.ventasBrutas = ventasBrutas;
  }

  public double getTarifaPorComision() {
    return tarifaPorComision;
  }

  public void setTarifaPorComision(double tarifaPorComision) {
    this.tarifaPorComision = tarifaPorComision;
  }

  public double getVentasBrutas() {
    return ventasBrutas;
  }

  public void setVentasBrutas(double ventasBrutas) {
    this.ventasBrutas = ventasBrutas;
  }

  public double obtenerSalario() {
    return tarifaPorComision * ventasBrutas;
  }

  @Override
  public String toString() {
    return "Empleado por comision: " + getPrimerNombre() + " " + getPrimerApellido() + "\nSalario: $" + obtenerSalario() + "\n";
  }
}
