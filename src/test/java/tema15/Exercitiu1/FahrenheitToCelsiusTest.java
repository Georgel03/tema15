package tema15.Exercitiu1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class FahrenheitToCelsiusTest {

    @BeforeAll
    public static void setUpTemperature() {

        double myTemp = 30d;
        Assertions.assertEquals(30d, myTemp);
    }

    @Test
    @Order(1)
    public void fahrenheitToCelsius() {

        double myTemp = 32d;
        Assertions.assertEquals(0, (myTemp - 32) * 5 / 9);
    }
}
