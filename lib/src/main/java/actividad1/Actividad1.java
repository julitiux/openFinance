package actividad1;

import java.util.List;
import java.util.stream.Collectors;

public class Actividad1 {

  public List<String> actividad(List<String> stringList) {
    return null;
  }

  private List<String> filter(List<String> stringList) {
    return stringList.stream().filter(string -> string.contains("y")).collect(Collectors.toList());
  }

}
