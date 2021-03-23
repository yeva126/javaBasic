package com.company.Enums;

public class PizzaMain {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.setStatus(Pizza.PizzaStatus.ORDERED);
        System.out.println(pizza.getStatus());;
        System.out.println(pizza.isDelivered());

        System.out.println("====================");

        Pizza.PizzaStatus pizza1 = null;
        //System.out.println(pizza1.equals(Pizza.PizzaStatus.DELIVERED));//空指针异常
        System.out.println(pizza1 == Pizza.PizzaStatus.DELIVERED);//正常运行

        System.out.println("====================");

        Pizza1 testPz = new Pizza1();
        testPz.setPizzaStatus1(Pizza1.PizzaStatus1.ORDERED);
        System.out.println(testPz.isDeliverable());
        testPz.printTimeToDeliver();
    }
}
