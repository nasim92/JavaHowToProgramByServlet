package com.java;

public class SalariedEmployee extends Employee
{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklysalary) {
        super(firstName, lastName, socialSecurityNumber);

        if (weeklysalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");

        this.weeklySalary = weeklysalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("salaried employee: %s%n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    }
}
