public class DatosDePago {
  private double monto;
  private String tipo;
  private String fecha;
  private String hora;
  private String status;
  private String[] detalles;

  public DatosDePago (double monto, String tipo, String fecha, String hora, String status, String[] detalles) {
    this.monto = monto;
    this.tipo = tipo;
    this.fecha = fecha;
    this.hora = hora;
    this.status = status;
    this.detalles = detalles;
  }

  public double getMonto() {
    return monto;
  }

  public String getTipo() {
    return tipo;
  }

  public String getFecha() {
    return fecha;
  }

  public String getHora() {
    return hora;
  }

  public String getStatus() {
    return status;
  }

  public String[] getDetalles() {
    return detalles;
  }
}
