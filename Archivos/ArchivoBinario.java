import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArchivoBinario {
  public void crear(String nombre) {
    try {
      ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nombre));
      outputStream.close();
      System.out.println("Archivo creado correctamente: " + nombre);
    } catch (IOException e) {
      System.err.println("Error al crear el archivo: " + e.getMessage());
    }
  }

  public void escribir(String nombre, ArrayList<Movimiento> movimientos) {
    try {
      ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nombre));

      outputStream.writeObject(movimientos);
      outputStream.close();
      System.out.println("Movimiento guardado en el archivo: " + nombre);
    } catch (IOException e) {
      System.err.println("Error al escribir en el archivo: " + e.getMessage());
    }
  }

  public void leer(String nombre) {
    try {
      ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nombre));

      try {
        while (true) {
          ArrayList<Movimiento> movimientos = (ArrayList<Movimiento>) inputStream.readObject();
          for (Movimiento m: movimientos) {
            System.out.println('1');
            System.out.println(m);
          }
        }
      } catch (EOFException e) {
        // Fin del archivo
      }

      inputStream.close();
    } catch (IOException | ClassNotFoundException e) {
      System.err.println("Error al leer el archivo: " + e.getMessage());
    }
  }
}
