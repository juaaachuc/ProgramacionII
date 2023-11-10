import java.io.Serializable;

public class Movimiento implements Serializable {
  private String accion;
  private String nombreUsuario;
  private int cantidad;
  private boolean accionRealizada;

  public Movimiento(String accion, String nombreUsuario, int cantidad) {
    this.accion = accion;
    this.nombreUsuario = nombreUsuario;
    this.cantidad = cantidad;
    this.accionRealizada = false;
  }

  public String getAccion() {
    return accion;
  }

  public void setAccion(String accion) {
    this.accion = accion;
  }

  public String getNombreUsuario() {
    return nombreUsuario;
  }

  public void setNombreUsuario(String nombreUsuario) {
    this.nombreUsuario = nombreUsuario;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public boolean isAccionRealizada() {
    return accionRealizada;
  }

  public void setAccionRealizada(boolean accionRealizada) {
    this.accionRealizada = accionRealizada;
  }

  @Override
  public String toString() {
    return "Movimiento [accion=" + accion + ", nombreUsuario=" + nombreUsuario + ", cantidad=" + cantidad
        + ", accionRealizada=" + accionRealizada + "]";
  }
}
