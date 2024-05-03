import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testCalculate() {
        // Supongamos que Main tiene un método `calculate` que queremos probar
        int result = Main.calculate(2, 3);

        // Verificar que el resultado es el esperado
        assertEquals(5, result);
    }
}