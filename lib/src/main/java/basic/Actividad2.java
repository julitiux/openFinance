package basic;

import java.util.function.Consumer;

public class Actividad2 {

  private static String string;

  public Actividad2(String string) {
    Actividad2.string = string;
  }

  public static void iterateString(Consumer<Actividad2> consumer, String string) {
    Actividad2 actividad2 = new Actividad2(string);
    consumer.accept(actividad2);
  }

  private Integer sizeString(String string) {
    return string.length();
  }

  public void printString() {
    for (int index = 0; index < sizeString(string); index++)
      System.out.println(string.charAt(index));
  }

}
