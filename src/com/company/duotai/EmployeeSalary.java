package com.company.duotai;

public class EmployeeSalary extends EmployeeBasicInfo{
    private Double salary;

    public EmployeeSalary(String name, Integer age, String sex, Double salary) {
        super(name, age, sex);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void salarySOUT(){
        System.out.println("name:"+getName()+"age:"+getAge());
    }
}
