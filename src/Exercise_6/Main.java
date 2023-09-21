package Exercise_6;

public class Main {
    public static void main(String[] args) {
        ConstantTime<Integer> set = new ConstantTime<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.remove(20);
    }
}

