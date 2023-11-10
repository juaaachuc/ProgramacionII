import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // ArchivoTexto texto = new ArchivoTexto();
    // texto.crear("prueba.txt");
    // texto.escribir("prueba.txt", "Hola mundo", true);
    // texto.escribir("prueba.txt", "Hola mundo 2", true);
    // System.out.println("Mostrando mensaje de archivo de texto: ");
    // texto.leer("prueba.txt");

    // System.out.println();

    ArchivoBinario binario = new ArchivoBinario();
    binario.crear("prueba.bin");
    Movimiento m1 = new Movimiento("consultar", "pepito-conejo", 5000);
    Movimiento m2 = new Movimiento("depositar", "pepito-conejo", 15000);

    ArrayList<Movimiento> movimientos = new ArrayList<Movimiento>();
    movimientos.add(m1);
    movimientos.add(m2);

    binario.escribir("prueba.bin", movimientos);

    System.out.println("Mostrando mensaje de archivo binario: ");
    binario.leer("prueba.bin");
  }
}
