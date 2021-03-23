package com.company.Enums;

public class Pizza1 {
    private PizzaStatus1 pizzaStatus1;
    public enum PizzaStatus1{
        ORDERED (5){
            @Override
            public boolean isOrdered() {
                return true;
            }
        },
        READY (2){
            @Override
            public boolean isReady() {
                return true;
            }
        },
        DELIVERED (0){
            @Override
            public boolean isDelivered() {
                return true;
            }
        };

        private int timeToDelivery;

        public boolean isOrdered() {return false;}

        public boolean isReady() {return false;}

        public boolean isDelivered(){return false;}

        public int getTimeToDelivery() {
            return timeToDelivery;
        }

        PizzaStatus1 (int timeToDelivery) {
            this.timeToDelivery = timeToDelivery;
        }
    }

    public boolean isDeliverable() {
        return this.pizzaStatus1.isReady();
    }

    public void printTimeToDeliver() {
        System.out.println("Time to delivery is " +
                this.getPizzaStatus1().getTimeToDelivery());
    }

    public PizzaStatus1 getPizzaStatus1() {
        return pizzaStatus1;
    }

    public void setPizzaStatus1(PizzaStatus1 pizzaStatus1) {
        this.pizzaStatus1 = pizzaStatus1;
    }
}
