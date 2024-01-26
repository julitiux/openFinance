package actividad1;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Actividad1 {

  private static List<String> result;

  public Actividad1 (List<String> result) {
    Actividad1.result = result;
  }

  public static List<String> getResult() {
    return result;
  }

  public static List<String> executeActividad(Consumer<Actividad1> consumer, List<String> stringList) {
    Actividad1 actividad1 = new Actividad1(stringList);
    consumer.accept(actividad1);
    return getResult();
  }

  public Actividad1 distinctList() {
    result = result.stream().distinct().collect(Collectors.toList());
    return this;
  }

  public Actividad1 filter() {
    result = result.stream().filter(string -> string.contains("y")).collect(Collectors.toList());
    return this;
  }

  public Actividad1 reverseStringList() {
    result = result.stream().map(string -> new StringBuilder(string).reverse().toString()).collect(Collectors.toList());
    return this;
  }

}
