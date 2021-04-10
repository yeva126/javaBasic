package singleton;

public class DoubleCheckSingleton {
    private volatile static DoubleCheckSingleton aDouble;
    private DoubleCheckSingleton(){}
    public static DoubleCheckSingleton aaa(){
        if(aDouble == null){
            synchronized (DoubleCheckSingleton.class){
                aDouble = new DoubleCheckSingleton();
            }
        }
        return aDouble;
    }
}
