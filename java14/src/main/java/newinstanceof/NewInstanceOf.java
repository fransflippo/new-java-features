package newinstanceof;

import java.util.Iterator;
import java.util.List;

public class NewInstanceOf {

    public <T> T getNth(Iterable<T> iterable, int n) {
        if (iterable instanceof List<T> list) {
            return list.get(n - 1);
        } else {
            Iterator<T> it = iterable.iterator();
            for (int i = 0; i < n - 1; i++) {
                it.next();
            }
            return it.next();
        }
    }
}
