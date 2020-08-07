package privmethiface;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;

class BagOfNumbersTest {

    @Test
    void getSumOfEvenNumbers() {
        System.out.println(new BagOfNumbers() {
            @Override
            public Collection<Integer> getNumbers() {
                return Arrays.asList(1, 2, 3, 4, 5);
            }
        }.getSumOfEvenNumbers());
    }

    @Test
    void getAverageOfEvenNumbers() {
        System.out.println(new BagOfNumbers() {
            @Override
            public Collection<Integer> getNumbers() {
                return Arrays.asList(1, 2, 3, 4, 5);
            }
        }.getAverageOfEvenNumbers());
    }
}
