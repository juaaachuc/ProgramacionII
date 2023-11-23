import java.lang.reflect.InvocationTargetException;

public class Main {
  public static void main(String[] args) {
    String [] detalles = {};
    DatosDePago dp = new DatosDePago(15000, args[0], "23/11/2023", "11:40:00", "pendiente", detalles);

    PasarelaDePagos pp = new PasarelaDePagos();
    try {
      pp.pagar(dp);
    } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
        | NoSuchMethodException | SecurityException | ClassNotFoundException e) {
      System.err.println("Error: No se puede procesar el pago por este medio.");
    }
  }
}
