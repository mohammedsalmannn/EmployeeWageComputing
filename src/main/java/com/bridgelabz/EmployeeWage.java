package com.bridgelabz;

import java.lang.*;

public class EmployeeWage {
    public static int empCheck;
    public static int PER_HR = 20;
    public static int FULL_DAY = 8;
    public static int PART_TIME_HRs = 4;
    public static int one_wages = 0;
    public static int total=0;


    public static void main(String[] args) {
        final int IS_PRESENT = 1;
        int MAX_WRK_HRS = 100;
        int NUM_OF_WRK_HR = 0;
        int NUM_OF_WRK_DAYS = 0;
        int MAX_WRK_DAYS = 20;
        int total = 0;


        while (NUM_OF_WRK_HR <= MAX_WRK_HRS && NUM_OF_WRK_DAYS <= MAX_WRK_DAYS) {
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
            int salary = Calculate(empCheck);
            NUM_OF_WRK_DAYS++;
            System.out.println("Total_salary   :" + (total += one_wages));
        }

    }




    private static int Calculate(int empCheck) {
        switch (empCheck) {
            case 1:
                one_wages = PER_HR * FULL_DAY;

                break;
            case 2:
                one_wages = PART_TIME_HRs * PER_HR;
                break;
            default:
                System.out.println("emp absnt");
                break;

        }


        return total;
    }
}
