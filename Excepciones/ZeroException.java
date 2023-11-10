public class ZeroException extends Exception {
  public ZeroException() {
    super("Has ingresado un 0");
  }

  public static int validarQueNoSeaCero (int num) throws ZeroException {
    if (num == 0) {
      throw new ZeroException();
    }
    return num;
  }
}
