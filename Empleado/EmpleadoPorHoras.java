package Empleado;
public class EmpleadoPorHoras extends Empleado {
  private int horas;
  private double salario;

  public EmpleadoPorHoras (String primerNombre, String primerApellido, String NSS, int horas, double salario) {
    super(primerNombre, primerApellido, NSS);
    this.horas = horas;
    this.salario = salario;
  }

  public int getHoras() {
    return horas;
  }

  public void setHoras(int horas) {
    this.horas = horas;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public double obtenerSalario () {
    if (horas <= 40) {
      return salario * horas;
    } else {
      return salario * horas + ((horas - 40) * salario * 1.5);
    }
  }

  @Override
  public String toString() {
    return "Empleado por horas: " + getPrimerNombre() + " " + getPrimerApellido() + "\nSalario: $" + obtenerSalario() + "\n";
  }
}
