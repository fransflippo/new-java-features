package localvar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocalVar {

    public void doSomething() {
        var s = "-";
        var list = new ArrayList<String>();
        var it = list.iterator();
        var hasNext = it.hasNext();
        list.trimToSize();
        list.add("a");
        var context = new HashMap<String, Object>();
        context.put("a", 1);
        System.out.println(s.getClass() + ": " + s);
        System.out.println(list.getClass() + ": " + list);
        System.out.println(context.getClass() + ": " + context);
    }
}
