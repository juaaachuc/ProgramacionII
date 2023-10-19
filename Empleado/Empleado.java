package Empleado;
public abstract class Empleado {
  private String primerNombre, primerApellido, NSS;

  public Empleado(String primerNombre, String primerApellido, String NSS) {
    this.primerNombre = primerNombre;
    this.primerApellido = primerApellido;
    this.NSS = NSS;
  }

  public String getPrimerNombre() {
    return primerNombre;
  }

  public void setPrimerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
  }

  public String getPrimerApellido() {
    return primerApellido;
  }

  public void setPrimerApellido(String primerApellido) {
    this.primerApellido = primerApellido;
  }

  public String getNSS() {
    return NSS;
  }

  public void setNSS(String nSS) {
    NSS = nSS;
  }

  @Override
  public abstract String toString();
  
  public abstract double obtenerSalario();
}
