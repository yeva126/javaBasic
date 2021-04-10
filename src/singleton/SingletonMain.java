package singleton;

public class SingletonMain {
    public static void main(String[] args) {
        DoubleCheckSingleton a = DoubleCheckSingleton.aaa();
        DoubleCheckSingleton b = DoubleCheckSingleton.aaa();
        System.out.println(a==b);
    }
}
