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

  public List<String> actividad(List<String> stringList) {
    List<String> listFilter = filter(stringList);
    return reverseStringList(listFilter);
  }

  private List<String> filter(List<String> stringList) {
    return stringList.stream().filter(string -> string.contains("y")).collect(Collectors.toList());
  }

  private List<String> reverseStringList(List<String> stringList) {
    return stringList.stream().map(string -> new StringBuilder(string).reverse().toString()).collect(Collectors.toList());
  }

}
