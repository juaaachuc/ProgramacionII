import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ArchivoTexto {
  public void crear(String nombre) {
    // Código para crear un archivo de texto
    File file = new File(nombre);
    try {
      file.createNewFile();
    } catch (Exception e) {
      System.out.println("Error al crear el archivo: " + e.getMessage());
    }
  }

  public void escribir(String nombre, String contenido, boolean concatener) {
    // Código para escribir en un archivo de texto
    File file = new File(nombre);
    
    // Si el archivo no existe, manda mensaje de error
    if (!file.exists()) {
      System.out.println("El archivo no existe");
      return;
    }

    // Si concatenar es verdadero, agrega el contenido al final del archivo, sin sobreescribir
    try {
      FileWriter writer = new FileWriter(file, concatener);
      writer.write(contenido + "\n");
      writer.close();
    } catch (Exception e) {
      System.out.println("Error al escribir en el archivo: " + e.getMessage());
    }
  }

  public void leer(String nombre) {
    // Código para leer un archivo de texto
    File file = new File(nombre);
    
    // Si el archivo no existe, manda mensaje de error
    if (!file.exists()) {
      System.out.println("El archivo no existe");
      return;
    } else {
      // Código para leer el archivo
      try {
        FileReader reader = new FileReader(file);
        int c;
        while ((c = reader.read()) != -1) {
          System.out.print((char) c);
        }
        reader.close();
      } catch (Exception e) {
        System.out.println("Error al leer el archivo: " + e.getMessage());
      }
    }
  }

  public void borrarContenido(String nombre) {
    // Código para borrar el contenido de un archivo de texto
    File file = new File(nombre);
    // Si el archivo no existe, manda mensaje de error
    if (!file.exists()) {
      System.out.println("El archivo no existe");
      return;
    }

    // Código para borrar el contenido del archivo
    try {
      FileWriter writer = new FileWriter(file);
      writer.write("");
      writer.close();
    } catch (Exception e) {
      System.out.println("Error al borrar el contenido del archivo: " + e.getMessage());
    }
  }
}
