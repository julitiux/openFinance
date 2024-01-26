package actividad1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Actividad1 {

  static List<String> result = new ArrayList<String>();

  public static List<String> getResult() {
    return result;
  }

  public static List<String> executeActividad(Consumer<Actividad1> consumer){
    Actividad1 actividad1 = new Actividad1();
    consumer.accept(actividad1);
    return getResult();
  }

  private List<String> filter() {
    return result.stream().filter(string -> string.contains("y")).collect(Collectors.toList());
  }

  private List<String> reverseStringList() {
    return result.stream().map(string -> new StringBuilder(string).reverse().toString()).collect(Collectors.toList());
  }

}
