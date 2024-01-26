package basic;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Actividad2Test {

  @Test
  public void actividad2() {
    Consumer<Actividad2> mockConcumer = mock(Consumer.class);
    Actividad2.iterateString(mockConcumer, anyString());
    verify(mockConcumer).accept(any(Actividad2.class));
  }

  @Test
  public void executeActividad2() {
    Actividad2.iterateString(method -> method.printString(), "Hello world, I am a developer");
  }

}
