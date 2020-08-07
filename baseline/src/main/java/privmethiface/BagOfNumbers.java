package privmethiface;

import java.util.Collection;
import java.util.stream.Collectors;

public interface BagOfNumbers {

    Collection<Integer> getNumbers();

    default double getAverageOfEvenNumbers() {
        Collection<Integer> evenNumbers = getNumbers().stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        return ((double) evenNumbers.stream().reduce(0, Integer::sum, Integer::sum)) / evenNumbers.size();
    }

    default double getSumOfEvenNumbers() {
        Collection<Integer> evenNumbers = getNumbers().stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        return ((double) evenNumbers.stream().reduce(0, Integer::sum, Integer::sum));
    }

}
