import org.example.Main;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @ParameterizedTest
    @ValueSource(ints = {3, 23, 311, 487, 653, 947})

    void isPrime(int number){

        assertTrue(Main.isPrime(number));

        boolean expected = true;

        boolean actual = Main.isPrime(number);

        assertEquals(expected, actual, "Not prime!");
        System.out.println("Primos: " + number);

    }

    @ParameterizedTest
    @ValueSource(ints = {32, 64, 2, 20, 30, 26})
    void isEven(int number){

        assertTrue(Main.isEven(number));

        boolean expected = true;
        boolean actual = Main.isEven(number);
        assertEquals(expected, actual, "Not Even!");
        System.out.println("Pares: " + number);

    }

    @ParameterizedTest
    @ValueSource(ints = {23, 46, 115, 184, 207, 230})
    void isMultiple(int number){

        assertTrue(Main.isMultiple(number, 23));
        System.out.println("Múltiplo de 23: " + number);

    }

}
