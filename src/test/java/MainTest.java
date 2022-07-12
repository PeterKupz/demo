import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void plus() {
        Main m = new Main();

        Properties properties = System.getProperties();
        String vale = properties.getProperty("vale");
        Assertions.assertEquals(m.plus(1, 2), Integer.parseInt(vale));
    }
}