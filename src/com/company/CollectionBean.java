package com.company;

import java.util.Collection;
import java.util.Objects;

public class CollectionBean implements Comparable{
    private int age;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CollectionBean)) return false;
        CollectionBean that = (CollectionBean) o;
        return getAge() == that.getAge() && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName());
    }

    @Override
    public int compareTo(Object o) {
        CollectionBean c = (CollectionBean) o;
        if (this.age > c.getAge()){
            return 1;
        }
        if (this.age < c.getAge()){
            return -1;
        }
        if (this.name.compareTo(c.getName()) > 0){
            return 1;
        }
        if (this.name.compareTo(c.getName()) < 0){
            return -1;
        }
        return 0;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public static void main(String[] args) {
        int ssize = 1;
        ssize <<= 1;
        System.out.println(ssize);
        ssize <<= 1;
        System.out.println(ssize);
        ssize <<= 1;
        System.out.println(ssize);
    }
}
