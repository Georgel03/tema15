package tema15.Exercitiu1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class CelsiusToFahrenheitTest {

    @BeforeAll
    public static void setUpTemperature() {

        double myTemp = 30d;
        Assertions.assertEquals(30d, myTemp);
    }

    @Test
    @Order(1)
    public void celsiusToFahrenheit() {

        double myTemp = 0d;
        Assertions.assertEquals(32, (myTemp * 9 / 5) + 32);
    }
}
