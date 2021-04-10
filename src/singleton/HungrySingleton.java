package singleton;

public class HungrySingleton {
    private static HungrySingleton singleton = null;
    private HungrySingleton(){}
    public static HungrySingleton method(){
        if(singleton == null){
            singleton = new HungrySingleton();
        }
        return singleton;
    }
}
