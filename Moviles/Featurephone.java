package Moviles;

public class Featurephone extends Telefono
  implements Camara, GPS {
  
  private boolean camaraEstaEncendida, seEstaGrabandoVideo;

  public Featurephone(String numero, Operador operador) {
    super(numero, operador);
  }

  @Override
  public void encenderCamara() {
    if (camaraEstaEncendida) {
      System.err.println("La camara ya esta encendida");
    } else {
      System.out.println("Encendiendo la cámara...");
      System.out.println("La camara esta encendida");
      camaraEstaEncendida = true;
    }
  }

  @Override
  public void apagarCamara() {
    if (camaraEstaEncendida) {
      System.out.println("Apagando la cámara...");
      System.out.println("La camara esta apagada");
      this.camaraEstaEncendida = false;
    }
  }

  @Override
  public void grabarVideo() {
    if (camaraEstaEncendida && !seEstaGrabandoVideo) {
      System.out.println("Grabando video...");
    }

    if (seEstaGrabandoVideo) {
      System.out.println("Ya esta grabando video");
    }
  }

  @Override
  public void dejarDeGrabarVideo() {
    if (camaraEstaEncendida) {
      System.out.println("Dejando de grabar video...");
      seEstaGrabandoVideo = false;
    }
  }

  @Override
  public void tomarFoto() {
    if (camaraEstaEncendida) {
      System.out.println("Tomando foto...");
      System.out.println("Foto tomada");
    }
  }

  @Override
  public void ubicar() {
    System.out.println("Ubicando el GPS...");
  }
}
