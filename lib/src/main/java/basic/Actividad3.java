package basic;

public class Actividad3 {

  public void actividad3() {
    String[][] arreglo = new String[3][2];
    arreglo[2][1] = "hello world";
    for (int i = 0; i < arreglo.length; i++)
      for (int j = 0; j < arreglo[i].length; j++)
        System.out.println("Contenido en la posición {" + i + "}{" + j + "} = " + arreglo[i][j]);
  }

}