import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = 0, b = 0, c = 0;

    do {
      try {
        a = s.nextInt();
        b = ZeroException.validarQueNoSeaCero(s.nextInt());
        c = a / b;
        System.out.println(c);
      } catch (ArithmeticException | InputMismatchException | NumberFormatException e) {
        System.err.println("Error: Has ingresado un valor errado");
        s.nextLine();
      } catch (ZeroException e) {
        System.err.println(e.getMessage());
      } finally {
        System.out.println("Deseas continuar (s/n)?");
        String respuesta = s.next();
        if (respuesta.equals("s") || respuesta.equals("S")) {
          System.out.println("De acuerdo");          
        } else {
          System.out.println("Adiosin!!!");
          System.exit(0);
        }
      }
    } while (true);
  }
}
