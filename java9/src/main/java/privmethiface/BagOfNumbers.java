package privmethiface;

import java.util.Collection;
import java.util.stream.Collectors;

public interface BagOfNumbers {

    Collection<Integer> getNumbers();

    default double getAverageOfEvenNumbers() {
        Collection<Integer> evenNumbers = getEvenNumbers();
        return ((double) evenNumbers.stream().reduce(0, Integer::sum, Integer::sum)) / evenNumbers.size();
    }

    default double getSumOfEvenNumbers() {
        return ((double) getEvenNumbers().stream().reduce(0, Integer::sum, Integer::sum));
    }

    private Collection<Integer> getEvenNumbers() {
        return getNumbers().stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }
}
