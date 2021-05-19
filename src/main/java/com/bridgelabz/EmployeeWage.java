package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args)
    {
        final int IS_PRESENT= 1 ;
        double empCheck= Math.floor(Math.random()*10)%2;
        if (empCheck==IS_PRESENT)
        {
            System.out.println("employee is present");

        }
        else {
            System.out.println("employee is absent");
        }
    }
}
