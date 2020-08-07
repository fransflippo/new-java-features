package localvar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocalVar {

    public void doSomething() {
        String s = "-";
        List<String> list = new ArrayList<>();
        list.add("a");
        Map<String, Object> context = new HashMap<>();
        context.put("a", 1);
        System.out.println(s.getClass() + ": " + s);
        System.out.println(list.getClass() + ": " + list);
        System.out.println(context.getClass() + ": " + context);
    }
}
