package actividad1;

import java.util.List;
import java.util.stream.Collectors;

public class Actividad1 {

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
