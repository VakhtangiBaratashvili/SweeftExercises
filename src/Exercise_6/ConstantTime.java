package Exercise_6;

import java.util.*;

public class ConstantTime<T> {
    private Set<T> set;
    private LinkedList<T> list;

    public ConstantTime() {
        set = new HashSet<>();
        list = new LinkedList<>();
    }

    public void add(T element) {
        if (!set.contains(element)) {
            set.add(element);
            list.add(element);
        }
    }

    public void remove(T element) {
        if (set.contains(element)) {
            set.remove(element);
            list.remove(element);
        }
    }
}

