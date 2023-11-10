package Empleado;
public class Main {
  public static void main(String[] args) {
    System.out.println("Empleados procesados por separado:");
    EmpleadoAsalariado empleadoA = new EmpleadoAsalariado("Pepito", "Conejo", "901212", 10000);
    EmpleadoPorComision empleadoB = new EmpleadoPorComision("Pepito", "Conejo", "901212", 0.01, 13000);
    EmpleadoPorHoras empleadoC = new EmpleadoPorHoras("Pepito", "Conejo", "901212", 16, 150);
    EmpleadoBaseMasComision empleadoD = new EmpleadoBaseMasComision("Pepito", "Conejo", "901212", 0.05, 5000, 8000);

    System.out.println(empleadoA.toString());

    System.out.println(empleadoB.toString());

    System.out.println(empleadoC.toString());

    System.out.println(empleadoD.toString());

    System.out.println("\nEmpleados procesados de manera polimorfica:");
    Empleado[] empleados = new Empleado[4];
    empleados[0] = empleadoA;
    empleados[1] = empleadoB;
    empleados[2] = empleadoC;
    empleados[3] = empleadoD;

    System.out.println(empleados.hashCode());

    for (Empleado empleado : empleados) {
      if (empleado instanceof Empleado) {
        System.out.println(empleado.toString());
      }
    }
  }
}
