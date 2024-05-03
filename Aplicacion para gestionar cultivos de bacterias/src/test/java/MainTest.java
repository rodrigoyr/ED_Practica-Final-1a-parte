import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import tu.paquete.Main; // Reemplaza 'tu.paquete' con el paquete real de la clase Main

public class MainTest {
    @Test
    public void testCalculate() {
        // Supongamos que Main tiene un método `calculate` que queremos probar
        int result = Main.calculate(2, 3);

        // Verificar que el resultado es el esperado
        assertEquals(5, result);
    }
}