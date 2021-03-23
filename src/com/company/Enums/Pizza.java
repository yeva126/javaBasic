package com.company.Enums;

public class Pizza {
    private PizzaStatus status;
    public enum PizzaStatus{
        ORDERED,
        READY,
        DELIVERED;
    }
    public boolean isDelivered(){
        return getStatus() == PizzaStatus.DELIVERED;
    }

    public PizzaStatus getStatus() {
        return status;
    }

    public void setStatus(PizzaStatus status) {
        this.status = status;
    }
}
