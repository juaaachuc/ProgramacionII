public class PagoDebito implements IPagable {
  @Override
  public void pagar(DatosDePago datosDePago) {
    System.out.println("Pagando con debito");
  }
}
