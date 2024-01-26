package actividad1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Actividad1Test {

  @Test
  public void test() {
    List<String> result =
      Actividad1.executeActividad(
        methods -> methods
          .setResult(Arrays.asList("Hello", "Hello", "Bye", "World"))
          .filter()
          .reverseStringList()
      );
    System.out.println(result);
  }

}
