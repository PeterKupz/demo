import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void plus() {
        Main m = new Main();

        Assertions.assertEquals(m.plus(1, 2), 3);
        Assertions.assertEquals(m.plus(2, 2), 3);
    }
}