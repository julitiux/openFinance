package actividad1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;


public class Actividad1Test {

  @Test
  public void actividad1() {
    assertThat(
      Actividad1.executeActividad(
        methods -> methods
          .distinctList()
          .filter()
          .reverseStringList()
        , Arrays.asList("Hello", "Hello", "Bye", "World"))
    ).contains("eyB");
  }

}
