package Moviles;

public class Smartphone extends Telefono
  implements Camara, GPS {
  public Smartphone(String numero, Operador operador) {
    super(numero, operador);
  }

  @Override
  public void ubicar() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'ubicar'");
  }

  @Override
  public void encenderCamara() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'encenderCamara'");
  }

  @Override
  public void apagarCamara() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'apagarCamara'");
  }

  @Override
  public void grabarVideo() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'grabarVideo'");
  }

  @Override
  public void dejarDeGrabarVideo() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'dejarDeGrabarVideo'");
  }

  @Override
  public void tomarFoto() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'tomarFoto'");
  }
}
