package localvar;

import lombok.val;
import lombok.var;

import java.util.ArrayList;
import java.util.HashMap;

public class LocalVarLombok {

    public void doSomething() {
        String s = "-";
        var list = new ArrayList<>();
        list.add("a");
        val context = new HashMap<>();
        context.put("a", 1);
        System.out.println(s.getClass() + ": " + s);
        System.out.println(list.getClass() + ": " + list);
        System.out.println(context.getClass() + ": " + context);
        // The following will cause a compile error: "cannot assign a value to final variable context"
        // context = new HashMap<>();
        // System.out.println(context.getClass() + ": " + context);
    }

}
