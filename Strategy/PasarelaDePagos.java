import java.lang.reflect.InvocationTargetException;

public class PasarelaDePagos {
  private IPagable pagable;

  public PasarelaDePagos () {}

  public void pagar (DatosDePago datosDePago) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
    String tipoPago = "Pago" + datosDePago.getTipo();
    pagable = (IPagable) Class.forName(tipoPago)
      .getConstructor()
      .newInstance();
    pagable.pagar(datosDePago);
  }
}
