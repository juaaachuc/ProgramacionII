package Moviles;

public class Telefono {
  private String numero;
  private Operador operador;

  
  public Telefono(String numero, Operador operador) {
    this.numero = numero;
    this.operador = operador;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public Operador getOperador() {
    return operador;
  }

  public void setOperador(Operador operador) {
    this.operador = operador;
  }
  
  public void llamar(String numero) {
    System.out.println("LLAMANDO A " + this.getNumero() + " DE " + this.getOperador());
  }

  public void contestarLlamada() {
    System.out.println("RECIBIENDO LLAMADA DE " + this.getOperador());
  }

  public void colgar() {
    System.out.println("COLGANDO DE " + this.getOperador());
  }
}
