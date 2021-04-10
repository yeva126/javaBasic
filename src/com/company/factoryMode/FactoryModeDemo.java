package com.company.factoryMode;

/**
 * 手写工厂模式
 */
interface fruit{
    void eat();
}

class apple implements fruit{
    @Override
    public void eat() {
        System.out.println("吃苹果");
    }
}

class orange implements fruit{
    @Override
    public void eat(){
        System.out.println("吃橘子");
    }
}

public class FactoryModeDemo {
    private FactoryModeDemo(){}

    public static fruit getInstance(String className){
        fruit f = null;
        try {
            f = (fruit) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}

class test{
    public static void main(String[] args){
        fruit f = FactoryModeDemo.getInstance("com.company.factoryMode.orange");
        f.eat();
        fruit fa = FactoryModeDemo.getInstance("com.company.factoryMode.apple");
        fa.eat();
    }
}
