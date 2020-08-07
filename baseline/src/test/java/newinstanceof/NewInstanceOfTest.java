package newinstanceof;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class NewInstanceOfTest {

    @Test
    void getNth_list() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(new NewInstanceOf().getNth(list, 4));
    }

    @Test
    void getNth_set() {
        Set<Integer> list = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(new NewInstanceOf().getNth(list, 4));
    }
}
